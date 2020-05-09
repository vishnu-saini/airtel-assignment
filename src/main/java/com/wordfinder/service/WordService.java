package com.wordfinder.service;

import java.util.Set;
import java.util.Stack;

import com.wordfinder.exception.WordFinderApplicationException;
import com.wordfinder.exception.WordFinderBusinessException;

// TODO: Auto-generated Javadoc
/**
 * The Interface WordService.
 */
public interface WordService {

	/**
	 * Find common words.
	 *
	 * @param fileNames the file names
	 * @return the sets the
	 * @throws WordFinderBusinessException the word finder business exception
	 * @throws WordFinderApplicationException the word finder application exception
	 */
	public Set<String> findCommonWords(Stack<String> fileNames)
			throws WordFinderBusinessException, WordFinderApplicationException;
}
