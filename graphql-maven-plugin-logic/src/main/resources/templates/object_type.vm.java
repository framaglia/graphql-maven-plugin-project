package ${pluginConfiguration.packageName};

import java.util.List;
#if (${pluginConfiguration.mode} == "server")
import java.util.UUID;

#if (${pluginConfiguration.generateJPAAnnotation})
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
#end
#end

#if (${pluginConfiguration.mode} == "client")
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
#end

import com.graphql_java_generator.annotation.GraphQLInputParameters;
import com.graphql_java_generator.annotation.GraphQLInputType;
import com.graphql_java_generator.annotation.GraphQLNonScalar;
import com.graphql_java_generator.annotation.GraphQLScalar;

#foreach($import in $imports)
import $import;
#end

/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
${object.annotation}
public class ${object.name} #if($object.implementz.size()>0)implements #foreach($impl in $object.implementz)$impl#if($foreach.hasNext), #end#end#end {

#foreach ($field in $object.fields)
#if (${field.inputParameters.size()} > 0)
	@GraphQLInputParameters(names = {#foreach ($inputParameter in $field.inputParameters)"${inputParameter.name}"#if($foreach.hasNext), #end#end}, types = {#foreach ($inputParameter in $field.inputParameters)"${inputParameter.type.name}"#if($foreach.hasNext), #end#end})
#end
	${field.annotation}
	#if(${field.list})List<#end${field.type.classSimpleName}#if(${field.list})>#end ${field.name};


#end

#foreach ($field in $object.fields)
	public void set${field.pascalCaseName}(#if(${field.list})List<#end${field.type.classSimpleName}#if(${field.list})>#end ${field.name}) {
		this.${field.name} = ${field.name};
	}

	public #if(${field.list})List<#end${field.type.classSimpleName}#if(${field.list})>#end get${field.pascalCaseName}() {
		return ${field.name};
	}

#end
    public String toString() {
        return "${object.name} {"
#foreach ($field in $object.fields)
				+ "${field.name}: " + ${field.name}
#if($foreach.hasNext)
				+ ", "
#end 
#end
        		+ "}";
    }

    /**
	 * Enum of field names
	 */
	 public static enum Field {
#foreach ($field in $object.fields)
		${field.pascalCaseName}("${field.name}")#if($foreach.hasNext),
#end
#end;

		private String fieldName;

		Field(String fieldName) {
			this.fieldName = fieldName;
		}

		public String getFieldName() {
			return fieldName;
		}

	}
}
