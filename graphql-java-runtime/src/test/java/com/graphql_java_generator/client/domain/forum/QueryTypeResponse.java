package com.graphql_java_generator.client.domain.forum;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.graphql_java_generator.GraphQLField;
import com.graphql_java_generator.annotation.GraphQLInputParameters;
import com.graphql_java_generator.annotation.GraphQLNonScalar;
import com.graphql_java_generator.annotation.GraphQLQuery;
import com.graphql_java_generator.annotation.GraphQLScalar;
import com.graphql_java_generator.annotation.RequestType;
import com.graphql_java_generator.client.GraphQLRequestObject;

/**
 * @author generated by graphql-java-generator
 * @see <a href=
 *      "https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLQuery(name = "QueryTypeResponse", type = RequestType.query)
public class QueryTypeResponse implements GraphQLRequestObject {

	@JsonProperty("boards")
	@JsonDeserialize(contentAs = Board.class)
	@GraphQLNonScalar(fieldName = "boards", graphQLTypeSimpleName = "Board", javaClass = Board.class)
	List<Board> boards;

	@JsonProperty("nbBoards")
	@GraphQLScalar(fieldName = "nbBoards", graphQLTypeSimpleName = "Int", javaClass = Integer.class)
	Integer nbBoards;

	@GraphQLInputParameters(names = { "boardName" }, types = { "String" })
	@JsonProperty("topics")
	@JsonDeserialize(contentAs = Topic.class)
	@GraphQLNonScalar(fieldName = "topics", graphQLTypeSimpleName = "Topic", javaClass = Topic.class)
	List<Topic> topics;

	@GraphQLInputParameters(names = { "boardName", "keyword" }, types = { "String", "String" })
	@JsonProperty("findTopics")
	@JsonDeserialize(contentAs = Topic.class)
	@GraphQLNonScalar(fieldName = "findTopics", graphQLTypeSimpleName = "Topic", javaClass = Topic.class)
	List<Topic> findTopics;

	@JsonProperty("__schema")
	@GraphQLNonScalar(fieldName = "__schema", graphQLTypeSimpleName = "__Schema", javaClass = __Schema.class)
	__Schema __schema;

	@GraphQLInputParameters(names = { "name" }, types = { "String" })
	@JsonProperty("__type")
	@GraphQLNonScalar(fieldName = "__type", graphQLTypeSimpleName = "__Type", javaClass = __Type.class)
	__Type __type;

	public void setBoards(List<Board> boards) {
		this.boards = boards;
	}

	public List<Board> getBoards() {
		return boards;
	}

	public void setNbBoards(Integer nbBoards) {
		this.nbBoards = nbBoards;
	}

	public Integer getNbBoards() {
		return nbBoards;
	}

	public void setTopics(List<Topic> topics) {
		this.topics = topics;
	}

	public List<Topic> getTopics() {
		return topics;
	}

	public void setFindTopics(List<Topic> findTopics) {
		this.findTopics = findTopics;
	}

	public List<Topic> getFindTopics() {
		return findTopics;
	}

	public void set__schema(__Schema __schema) {
		this.__schema = __schema;
	}

	public __Schema get__schema() {
		return __schema;
	}

	public void set__type(__Type __type) {
		this.__type = __type;
	}

	public __Type get__type() {
		return __type;
	}

	@Override
	public String toString() {
		return "QueryType {" + "boards: " + boards + ", " + "nbBoards: " + nbBoards + ", " + "topics: " + topics + ", "
				+ "findTopics: " + findTopics + ", " + "__schema: " + __schema + ", " + "__type: " + __type + "}";
	}

	/**
	 * Enum of field names
	 */
	public static enum Field implements GraphQLField {
		Boards("boards"), NbBoards("nbBoards"), Topics("topics"), FindTopics("findTopics"), __schema(
				"__schema"), __type("__type");

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
		private List<Board> boards;
		private Integer nbBoards;
		private List<Topic> topics;
		private List<Topic> findTopics;
		private __Schema __schema;
		private __Type __type;

		public Builder withBoards(List<Board> boards) {
			this.boards = boards;
			return this;
		}

		public Builder withNbBoards(Integer nbBoards) {
			this.nbBoards = nbBoards;
			return this;
		}

		public Builder withTopics(List<Topic> topics) {
			this.topics = topics;
			return this;
		}

		public Builder withFindTopics(List<Topic> findTopics) {
			this.findTopics = findTopics;
			return this;
		}

		public Builder with__schema(__Schema __schema) {
			this.__schema = __schema;
			return this;
		}

		public Builder with__type(__Type __type) {
			this.__type = __type;
			return this;
		}

		public QueryTypeResponse build() {
			QueryTypeResponse object = new QueryTypeResponse();
			object.setBoards(boards);
			object.setNbBoards(nbBoards);
			object.setTopics(topics);
			object.setFindTopics(findTopics);
			object.set__schema(__schema);
			object.set__type(__type);
			return object;
		}
	}

	@Override
	public void setExtensions(JsonNode extensions) {
		// TODO Auto-generated method stub

	}
}
