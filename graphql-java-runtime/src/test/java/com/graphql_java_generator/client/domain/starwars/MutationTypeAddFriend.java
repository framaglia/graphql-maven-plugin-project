package com.graphql_java_generator.client.domain.starwars;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.graphql_java_generator.client.GraphQLRequestObject;

/**
 * @author generated by graphql-java-generator
 * @see <a href=
 *      "https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
public class MutationTypeAddFriend implements GraphQLRequestObject {

	public static final String NAME = "addFriend";

	@JsonDeserialize(as = Character.class)
	@JsonProperty("addFriend")
	Character addFriend;

	public void setAddFriend(Character addFriend) {
		this.addFriend = addFriend;
	}

	public Character getAddFriend() {
		return addFriend;
	}

	@Override
	public String toString() {
		return "MutationTypeAddFriend {addFriend: " + addFriend + "}";
	}

	@Override
	public void setExtensions(JsonNode extensions) {
		// TODO Auto-generated method stub

	}
}
