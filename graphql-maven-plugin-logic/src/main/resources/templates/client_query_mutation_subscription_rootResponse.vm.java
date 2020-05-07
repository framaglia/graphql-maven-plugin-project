/** Generated by the default template from graphql-java-generator */
package ${packageUtilName};

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.graphql_java_generator.annotation.GraphQLNonScalar;
import com.graphql_java_generator.client.request.ObjectResponse;
import com.graphql_java_generator.client.response.Error;

public class ${object.javaName}RootResponse {

	@JsonProperty("data")
	@GraphQLNonScalar(fieldName = "${object.name}", graphQLTypeName = "${object.javaName}", javaClass = ${object.classSimpleName}.class)
	${object.classSimpleName} ${object.requestType};

	@JsonProperty("errors")
	@JsonDeserialize(contentAs = Error.class)
	public List<Error> errors;

	// This getter is needed for the Json serialization
	public ${object.classSimpleName} getData() {
		return this.${object.requestType};
	}

	// This setter is needed for the Json deserialization
	public void setData(${object.classSimpleName} ${object.requestType}) {
		this.${object.requestType} = ${object.requestType};
	}

	public List<Error> getErrors() {
		return errors;
	}

	public void setErrors(List<Error> errors) {
		this.errors = errors;
	}

}