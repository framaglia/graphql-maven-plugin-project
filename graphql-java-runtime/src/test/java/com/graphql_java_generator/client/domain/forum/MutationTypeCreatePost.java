package com.graphql_java_generator.client.domain.forum;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.graphql_java_generator.client.GraphQLRequestObject;

/**
 * @author generated by graphql-java-generator
 * @see <a href=
 *      "https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
public class MutationTypeCreatePost implements GraphQLRequestObject {

	public static final String NAME = "createPost";

	@JsonProperty("createPost")
	Post createPost;

	public void setCreatePost(Post createPost) {
		this.createPost = createPost;
	}

	public Post getCreatePost() {
		return createPost;
	}

	@Override
	public String toString() {
		return "MutationTypeCreatePost {createPost: " + createPost + "}";
	}

	@Override
	public void setExtensions(JsonNode extensions) {
		// TODO Auto-generated method stub

	}
}
