/** Generated by the default template from graphql-java-generator */
package com.graphql_java_generator.domain.client.forum;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.graphql_java_generator.GraphQLField;
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
@GraphQLInputType("TopicInput")
@JsonInclude(Include.NON_NULL)
public class TopicInput {

	/**
	 * This map contains the deserialiazed values for the alias, as parsed from the json response from the GraphQL
	 * server. The key is the alias name, the value is the deserialiazed value (taking into account custom scalars,
	 * lists, ...)
	 */
	@com.graphql_java_generator.annotation.GraphQLIgnore
	Map<String, Object> aliasValues = new HashMap<>();

	public TopicInput() {
		// No action
	}

	@JsonProperty("boardId")
	@GraphQLScalar(fieldName = "boardId", graphQLTypeSimpleName = "ID", javaClass = String.class)
	String boardId;

	@JsonProperty("input")
	@GraphQLNonScalar(fieldName = "input", graphQLTypeSimpleName = "TopicPostInput", javaClass = TopicPostInput.class)
	TopicPostInput input;

	public void setBoardId(String boardId) {
		this.boardId = boardId;
	}

	public String getBoardId() {
		return boardId;
	}

	public void setInput(TopicPostInput input) {
		this.input = input;
	}

	public TopicPostInput getInput() {
		return input;
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
		return "TopicInput {" + "boardId: " + boardId + ", " + "input: " + input + "}";
	}

	/**
	 * Enum of field names
	 */
	public static enum Field implements GraphQLField {
		BoardId("boardId"), Input("input");

		private String fieldName;

		Field(String fieldName) {
			this.fieldName = fieldName;
		}

		@Override
		public String getFieldName() {
			return fieldName;
		}

		@Override
		public Class<?> getGraphQLType() {
			return this.getClass().getDeclaringClass();
		}

	}

	public static Builder builder() {
		return new Builder();
	}

	/**
	 * Builder
	 */
	public static class Builder {
		private String boardId;
		private TopicPostInput input;

		public Builder withBoardId(String boardId) {
			this.boardId = boardId;
			return this;
		}

		public Builder withInput(TopicPostInput input) {
			this.input = input;
			return this;
		}

		public TopicInput build() {
			TopicInput _object = new TopicInput();
			_object.setBoardId(boardId);
			_object.setInput(input);
			return _object;
		}
	}
}
