package com.graphql_java_generator.samples.forum;

import java.util.Calendar;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.socket.client.ReactorNettyWebSocketClient;
import org.springframework.web.reactive.socket.client.WebSocketClient;

import com.graphql_java_generator.client.GraphQLConfiguration;
import com.graphql_java_generator.exception.GraphQLRequestExecutionException;
import com.graphql_java_generator.exception.GraphQLRequestPreparationException;
import com.graphql_java_generator.samples.forum.client.Queries;
import com.graphql_java_generator.samples.forum.client.graphql.PartialDirectRequests;
import com.graphql_java_generator.samples.forum.client.graphql.PartialPreparedRequests;
import com.graphql_java_generator.samples.forum.client.graphql.PartialPreparedRequestsDeprecated;
import com.graphql_java_generator.samples.forum.client.graphql.SubscriptionRequests;
import com.graphql_java_generator.samples.forum.client.graphql.forum.client.QueryTypeExecutor;

import reactor.netty.http.client.HttpClient;

/**
 * A Spring Boot client app. Very easy to use and to configure
 * 
 * @author etienne-sf
 */
@SpringBootApplication(scanBasePackageClasses = { Main.class, GraphQLConfiguration.class, QueryTypeExecutor.class })
public class Main implements CommandLineRunner {

	@Value("${graphql.endpoint.url}")
	private String graphqlEndpoint;
	@Value("${graphql.endpoint.subscriptionUrl}")
	private String graphqlSubscriptionEndpoint;

	@Autowired
	PartialDirectRequests partialDirectRequests;
	@Autowired
	PartialPreparedRequests partialPreparedRequests;
	@Autowired
	PartialPreparedRequestsDeprecated partialPreparedRequestsDeprecated;
	@Autowired
	SubscriptionRequests subscriptionRequests;

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

	/**
	 * This method is started by Spring, once the Spring context has been loaded. This is run, as this class implements
	 * {@link CommandLineRunner}
	 */
	@Override
	public void run(String... args) throws Exception {
		System.out.println("");
		System.out.println("============================================================================");
		System.out.println("======= SIMPLEST WAY: DIRECT QUERIES =======================================");
		System.out.println("============================================================================");
		exec(partialDirectRequests, null);

		System.out.println("");
		System.out.println("============================================================================");
		System.out.println("======= MOST SECURE WAY: PREPARED QUERIES ==================================");
		System.out.println("============================================================================");
		exec(partialPreparedRequests, null);

		System.out.println("");
		System.out.println("============================================================================");
		System.out.println("======= DEPRECATED WAY (to check that it still works) ======================");
		System.out.println("============================================================================");
		exec(partialPreparedRequestsDeprecated, null);

		System.out.println("");
		System.out.println("============================================================================");
		System.out.println("======= LET'S EXECUTE A SUBSCRIPTION      ==================================");
		System.out.println("============================================================================");
		subscriptionRequests.execSubscription();

		System.out.println("");
		System.out.println("");
		System.out.println("Sample application finished ... enjoy !    :)");
		System.out.println("");
		System.out.println("Please take a look at the other samples, for other use cases");
		System.out.println(
				"You'll find more information on the plugin's web site: https://graphql-maven-plugin-project.graphql-java-generator.com/");
	}

	void exec(Queries client, String name) throws GraphQLRequestPreparationException, GraphQLRequestExecutionException {
		try {

			System.out.println("----------------------------------------------------------------------------");
			System.out.println("----------------  boardsSimple  --------------------------------------------");
			System.out.println(client.boardsSimple());

			System.out.println("----------------------------------------------------------------------------");
			System.out.println("----------------  topicAuthorPostAuthor  -----------------------------------");
			Calendar cal = Calendar.getInstance();
			cal.set(2018, 12, 20);
			System.out.println(client.topicAuthorPostAuthor("Board name 2", cal.getTime()));

			System.out.println("----------------------------------------------------------------------------");
			System.out.println("----------------  createBoard  ---------------------------------------------");
			// We need a unique name. Let's use a random name for that, if none was provided.
			name = (name != null) ? name : "Name " + Float.floatToIntBits((float) Math.random() * Integer.MAX_VALUE);
			System.out.println(client.createBoard(name, true));

		} catch (javax.ws.rs.ProcessingException e) {
			System.out.println("");
			System.out.println("ERROR");
			System.out.println("");
			System.out.println(
					"Please start the server from the project graphql-maven-plugin-samples-StarWars-server, before executing the client part");
		}
	}

	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	////////////////// Below is the configuration, based on Spring beans
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Bean
	String graphqlEndpoint() {
		return graphqlEndpoint;
	}

	@Bean
	String graphqlSubscriptionEndpoint() {
		return graphqlSubscriptionEndpoint;
	}

	@Bean
	WebClient webClient(String graphqlEndpoint) {
		return WebClient.builder()//
				.baseUrl(graphqlEndpoint)//
				// .defaultCookie("cookieKey", "cookieValue")//
				.defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
				.defaultUriVariables(Collections.singletonMap("url", graphqlEndpoint))
				.clientConnector(new ReactorClientHttpConnector(HttpClient.create()))//
				.build();
	}

	/**
	 * The Spring reactive {@link WebSocketClient} web socket client, that will execute HTTP requests to build the web
	 * sockets, for GraphQL subscriptions.<BR/>
	 * This is mandatory if the application latter calls subscription. It may be null otherwise.
	 */
	@Bean
	WebSocketClient webSocketClient(@Autowired(required = false) HttpClient httpClient) {
		if (httpClient == null) {
			return new ReactorNettyWebSocketClient(HttpClient.create());
		} else {
			return new ReactorNettyWebSocketClient(httpClient);
		}
	}

}
