package com.graphql_java_generator.client.domain.forum;

/**
 * @author generated by graphql-java-generator
 * @See https://github.com/graphql-java-generator/graphql-java-generator
 */
public class MutationTypeCreateBoard {

	Board createBoard;

	public void setCreateBoard(Board createBoard) {
		this.createBoard = createBoard;
	}

	public Board getCreateBoard() {
		return createBoard;
	}

	@Override
	public String toString() {
		return "MutationTypeCreateBoard {createBoard: " + createBoard + "}";
	}
}