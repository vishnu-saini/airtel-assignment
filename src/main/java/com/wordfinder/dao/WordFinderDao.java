package com.wordfinder.dao;

import java.util.Set;
import java.util.Stack;

import com.wordfinder.exception.WordFinderApplicationException;

// TODO: Auto-generated Javadoc
/**
 * The Interface WordFinderDao.
 */
public interface WordFinderDao {

	/**
	 * Find common words.
	 *
	 * @param fileNames the file names
	 * @return the sets the
	 * @throws WordFinderApplicationException the word finder application exception
	 */
	public Set<String> findCommonWords(Stack<String> fileNames) throws WordFinderApplicationException;
}