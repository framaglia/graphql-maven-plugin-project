package com.graphql_java_generator.client.domain.starwars;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.graphql_java_generator.client.GraphQLRequestObject;

/**
 * @author generated by graphql-java-generator
 * @see <a href=
 *      "https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
public class QueryType__schema implements GraphQLRequestObject {

	public static final String NAME = "__schema";

	@JsonProperty("__schema")
	__Schema __schema;

	public void set__schema(__Schema __schema) {
		this.__schema = __schema;
	}

	public __Schema get__schema() {
		return __schema;
	}

	@Override
	public String toString() {
		return "QueryType__schema {__schema: " + __schema + "}";
	}

	@Override
	public void setExtensions(JsonNode extensions) {
		// TODO Auto-generated method stub

	}
}
