package com.graphql_java_generator.client.domain.forum;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.graphql_java_generator.client.GraphQLRequestObject;

/**
 * @author generated by graphql-java-generator
 * @see <a href=
 *      "https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
public class QueryTypeFindTopics implements GraphQLRequestObject {

	public static final String NAME = "findTopics";

	@JsonDeserialize(contentAs = Topic.class)
	@JsonProperty("findTopics")
	List<Topic> findTopics;

	public void setFindTopics(List<Topic> findTopics) {
		this.findTopics = findTopics;
	}

	public List<Topic> getFindTopics() {
		return findTopics;
	}

	@Override
	public String toString() {
		return "QueryTypeFindTopics {findTopics: " + findTopics + "}";
	}

	@Override
	public void setExtensions(JsonNode extensions) {
		// TODO Auto-generated method stub

	}
}
