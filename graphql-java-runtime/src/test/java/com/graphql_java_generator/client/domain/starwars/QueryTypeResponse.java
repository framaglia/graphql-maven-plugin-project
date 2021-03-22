package com.graphql_java_generator.client.domain.starwars;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.graphql_java_generator.GraphQLField;
import com.graphql_java_generator.annotation.GraphQLInputParameters;
import com.graphql_java_generator.annotation.GraphQLNonScalar;
import com.graphql_java_generator.annotation.GraphQLQuery;
import com.graphql_java_generator.annotation.RequestType;
import com.graphql_java_generator.client.GraphQLRequestObject;

/**
 * @author generated by graphql-java-generator
 * @see <a href=
 *      "https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLQuery(name = "QueryTypeResponse", type = RequestType.query)
public class QueryTypeResponse implements GraphQLRequestObject {

	@GraphQLInputParameters(names = { "episode" }, types = { "Episode" })
	@JsonProperty("hero")
	@GraphQLNonScalar(fieldName = "hero", graphQLTypeSimpleName = "Character", javaClass = Character.class)
	Character hero;

	@GraphQLInputParameters(names = { "episode" }, types = { "Episode" })
	@JsonProperty("characters")
	@JsonDeserialize(contentAs = Character.class)
	@GraphQLNonScalar(fieldName = "characters", graphQLTypeSimpleName = "Character", javaClass = Character.class)
	List<Character> characters;

	@GraphQLInputParameters(names = { "id" }, types = { "ID" })
	@JsonProperty("human")
	@GraphQLNonScalar(fieldName = "human", graphQLTypeSimpleName = "Human", javaClass = Human.class)
	Human human;

	@GraphQLInputParameters(names = { "id" }, types = { "ID" })
	@JsonProperty("droid")
	@GraphQLNonScalar(fieldName = "droid", graphQLTypeSimpleName = "Droid", javaClass = Droid.class)
	Droid droid;

	@JsonProperty("__schema")
	@GraphQLNonScalar(fieldName = "__schema", graphQLTypeSimpleName = "__Schema", javaClass = __Schema.class)
	__Schema __schema;

	@GraphQLInputParameters(names = { "name" }, types = { "String" })
	@JsonProperty("__type")
	@GraphQLNonScalar(fieldName = "__type", graphQLTypeSimpleName = "__Type", javaClass = __Type.class)
	__Type __type;

	public void setHero(Character hero) {
		this.hero = hero;
	}

	public Character getHero() {
		return hero;
	}

	public void setCharacters(List<Character> characters) {
		this.characters = characters;
	}

	public List<Character> getCharacters() {
		return characters;
	}

	public void setHuman(Human human) {
		this.human = human;
	}

	public Human getHuman() {
		return human;
	}

	public void setDroid(Droid droid) {
		this.droid = droid;
	}

	public Droid getDroid() {
		return droid;
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
		return "QueryType {" + "hero: " + hero + ", " + "characters: " + characters + ", " + "human: " + human + ", "
				+ "droid: " + droid + ", " + "__schema: " + __schema + ", " + "__type: " + __type + "}";
	}

	/**
	 * Enum of field names
	 */
	public static enum Field implements GraphQLField {
		Hero("hero"), Characters("characters"), Human("human"), Droid("droid"), __schema("__schema"), __type("__type");

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
		private Character hero;
		private List<Character> characters;
		private Human human;
		private Droid droid;
		private __Schema __schema;
		private __Type __type;

		public Builder withHero(Character hero) {
			this.hero = hero;
			return this;
		}

		public Builder withCharacters(List<Character> characters) {
			this.characters = characters;
			return this;
		}

		public Builder withHuman(Human human) {
			this.human = human;
			return this;
		}

		public Builder withDroid(Droid droid) {
			this.droid = droid;
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
			object.setHero(hero);
			object.setCharacters(characters);
			object.setHuman(human);
			object.setDroid(droid);
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
