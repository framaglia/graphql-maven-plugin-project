/**
 * 
 */
package org.graphql.maven.plugin.samples.server;

import java.util.UUID;

import javax.annotation.Resource;

import org.graphql.maven.plugin.samples.server.jpa.CharacterRepository;
import org.graphql.maven.plugin.samples.server.jpa.HumanRepository;
import org.springframework.stereotype.Component;

import graphql.schema.DataFetchingEnvironment;

/**
 * @author EtienneSF
 */
@Component
public class MutationTypeDataFetchersDelegateImpl implements MutationTypeDataFetchersDelegate {

	@Resource
	HumanRepository humanRepository;
	@Resource
	CharacterRepository characterRepository;

	@Override
	public Human createHuman(DataFetchingEnvironment dataFetchingEnvironment, String name, String homePlanet) {
		Human human = new Human();
		human.setName(name);
		human.setHomePlanet(homePlanet);
		humanRepository.save(human);
		return human;
	}

	@Override
	public Character addFriend(DataFetchingEnvironment dataFetchingEnvironment, String idCharacter, String idFriend) {
		// First, we add the friend
		characterRepository.addFriend(UUID.fromString(idCharacter), UUID.fromString(idFriend));

		// Then we return the expected character. Please note that this get() call can throw a NoSuchElementException,
		// if the idCharacter doesn't exist. The generated code properly handles this error.
		// (Ok, yes, here, if the idCharacter is wrong, the previous query would already have sent an exception... :) )
		return characterRepository.findById(UUID.fromString(idCharacter)).get();
	}

}
