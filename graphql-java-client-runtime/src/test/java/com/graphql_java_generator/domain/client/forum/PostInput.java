/** Generated by the default template from graphql-java-generator */
package com.graphql_java_generator.domain.client.forum;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.graphql_java_generator.annotation.GraphQLInputType;
import com.graphql_java_generator.annotation.GraphQLNonScalar;
import com.graphql_java_generator.annotation.GraphQLScalar;
import com.graphql_java_generator.client.GraphQLObjectMapper;
import com.graphql_java_generator.exception.GraphQLRequestExecutionException;

/**
 *
 * @author generated by graphql-java-generator
 * @see <a href=
 *      "https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLInputType("PostInput")
@JsonInclude(Include.NON_NULL)
public class PostInput {

	/**
	 * This map contains the deserialiazed values for the alias, as parsed from the json response from the GraphQL
	 * server. The key is the alias name, the value is the deserialiazed value (taking into account custom scalars,
	 * lists, ...)
	 */
	@com.graphql_java_generator.annotation.GraphQLIgnore
	Map<String, Object> aliasValues = new HashMap<>();

	public PostInput() {
		// No action
	}

	@JsonProperty("topicId")
	@GraphQLScalar(fieldName = "topicId", graphQLTypeSimpleName = "ID", javaClass = String.class)
	String topicId;

	@JsonProperty("input")
	@GraphQLNonScalar(fieldName = "input", graphQLTypeSimpleName = "TopicPostInput", javaClass = TopicPostInput.class)
	TopicPostInput input;

	@JsonProperty("from")
	@GraphQLScalar(fieldName = "from", graphQLTypeSimpleName = "Date", javaClass = Date.class)
	Date from;

	@JsonProperty("in")
	@GraphQLScalar(fieldName = "in", graphQLTypeSimpleName = "Date", javaClass = Date.class)
	List<Date> in;

	public void setTopicId(String topicId) {
		this.topicId = topicId;
	}

	public String getTopicId() {
		return topicId;
	}

	public void setInput(TopicPostInput input) {
		this.input = input;
	}

	public TopicPostInput getInput() {
		return input;
	}

	public void setFrom(Date from) {
		this.from = from;
	}

	public Date getFrom() {
		return from;
	}

	public void setIn(List<Date> in) {
		this.in = in;
	}

	public List<Date> getIn() {
		return in;
	}

	/**
	 * This method is called during the json deserialization process, by the {@link GraphQLObjectMapper}, each time an
	 * alias value is read from the json.
	 * 
	 * @param aliasName
	 * @param aliasDeserializedValue
	 */
	public void setAliasValue(String aliasName, Object aliasDeserializedValue) {
		aliasValues.put(aliasName, aliasDeserializedValue);
	}

	/**
	 * Retrieves the value for the given alias, as it has been received for this object in the GraphQL response. <BR/>
	 * This method <B>should not be used for Custom Scalars</B>, as the parser doesn't know if this alias is a custom
	 * scalar, and which custom scalar to use at deserialization time. In most case, a value will then be provided by
	 * this method with a basis json deserialization, but this value won't be the proper custom scalar value.
	 * 
	 * @param alias
	 * @return
	 * @throws GraphQLRequestExecutionException
	 *             If the value can not be parsed
	 */
	public Object getAliasValue(String alias) throws GraphQLRequestExecutionException {
		Object value = aliasValues.get(alias);
		if (value instanceof GraphQLRequestExecutionException)
			throw (GraphQLRequestExecutionException) value;
		else
			return value;
	}

	@Override
	public String toString() {
		return "PostInput {" + "topicId: " + topicId + ", " + "input: " + input + ", " + "from: " + from + ", " + "in: "
				+ in + "}";
	}

	public static Builder builder() {
		return new Builder();
	}

	/**
	 * Builder
	 */
	public static class Builder {
		private String topicId;
		private TopicPostInput input;
		private Date from;
		private List<Date> in;

		public Builder withTopicId(String topicId) {
			this.topicId = topicId;
			return this;
		}

		public Builder withInput(TopicPostInput input) {
			this.input = input;
			return this;
		}

		public Builder withFrom(Date from) {
			this.from = from;
			return this;
		}

		public Builder withIn(List<Date> in) {
			this.in = in;
			return this;
		}

		public PostInput build() {
			PostInput _object = new PostInput();
			_object.setTopicId(topicId);
			_object.setInput(input);
			_object.setFrom(from);
			_object.setIn(in);
			return _object;
		}
	}
}
