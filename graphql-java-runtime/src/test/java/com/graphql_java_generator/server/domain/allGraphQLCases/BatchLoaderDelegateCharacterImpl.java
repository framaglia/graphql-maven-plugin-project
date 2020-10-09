/** Generated by the default template from graphql-java-generator */
package com.graphql_java_generator.server.domain.allGraphQLCases;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import javax.annotation.Resource;

import org.dataloader.DataLoaderRegistry;
import org.springframework.stereotype.Component;

import com.graphql_java_generator.server.util.BatchLoaderDelegate;	

import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.Date;

/**
 * This is the default implementation for BathLoaderDelegate. It is implemented for each object of the GraphQL model
 * that has a field of type ID, which is identified as an identifier. <BR/>
 * It can be used in a DataFetcherDelegate implementation in this way : 
 * <PRE>
 * &#64;Override
 * public CompletableFuture<List<Character>> friends(DataFetchingEnvironment environment, DataLoader<UUID, Character> dataLoader,
 * 		Character source) {
 * 	logger.debug("Executing characterImpl.friends, with this character: {}", source.getId().toString());
 * 	List<UUID> friendIds = graphQLUtil
 * 			.convertListByteArrayToListUUID(characterRepository.findFriendsId(source.getId()));
 * 	return dataLoader.loadMany(friendIds);
 * }
 *
 * </PRE>
 * @author generated by graphql-java-generator
 */
@Component
public class BatchLoaderDelegateCharacterImpl implements BatchLoaderDelegate<UUID, Character> {

	/** The DataFetcherDelegates contain the requests to the data */
	@Resource
	DataFetchersDelegateCharacter dataFetchersDelegateCharacter;

	/**
	 * A batch loader function that will be called with N or more keys for batch loading. This can be a singleton object
	 * since it's stateless.
	 * 
	 * @param keys
	 *            the list of keys, for which we want to retrieve the instances.
	 * @return the list of Characters corresponding to the given keys
	 */
	@Override
	public CompletionStage<List<Character>> load(List<UUID> keys) {
		// We use supplyAsync() of values here for maximum parellisation
		return CompletableFuture.supplyAsync(() -> dataFetchersDelegateCharacter.batchLoader(keys));
	}

	/**
	 * The name for this {@link BatchLoaderDelegate}, as ot is stored in the {@link DataLoaderRegistry}. <BR/>
	 * The BatchLoader can then be retrieved by this command, in a DataFetchDelegate implementation:<BR/>
	 */
	@Override
	public String getName() {
		return "Character";
	}

}
