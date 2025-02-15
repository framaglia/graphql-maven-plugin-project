/** Generated by the default template from graphql-java-generator */
package com.graphql_java_generator.domain.server.allGraphQLCases;

import com.graphql_java_generator.annotation.GraphQLNonScalar;
import com.graphql_java_generator.annotation.GraphQLObjectType;
import com.graphql_java_generator.annotation.GraphQLScalar;

/**
 *
 * @author generated by graphql-java-generator
 * @see <a href=
 *      "https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLObjectType("HumanEdge")
public class HumanEdge {

	public HumanEdge() {
		// No action
	}

	@GraphQLNonScalar(fieldName = "node", graphQLTypeSimpleName = "Human", javaClass = Human.class)
	Human node;

	@GraphQLScalar(fieldName = "cursor", graphQLTypeSimpleName = "String", javaClass = String.class)
	String cursor;

	public void setNode(Human node) {
		this.node = node;
	}

	public Human getNode() {
		return node;
	}

	public void setCursor(String cursor) {
		this.cursor = cursor;
	}

	public String getCursor() {
		return cursor;
	}

	@Override
	public String toString() {
		return "HumanEdge {" + "node: " + node + ", " + "cursor: " + cursor + "}";
	}

	public static Builder builder() {
		return new Builder();
	}

	/**
	 * Builder
	 */
	public static class Builder {
		private Human node;
		private String cursor;

		public Builder withNode(Human node) {
			this.node = node;
			return this;
		}

		public Builder withCursor(String cursor) {
			this.cursor = cursor;
			return this;
		}

		public HumanEdge build() {
			HumanEdge _object = new HumanEdge();
			_object.setNode(node);
			_object.setCursor(cursor);
			return _object;
		}
	}
}
