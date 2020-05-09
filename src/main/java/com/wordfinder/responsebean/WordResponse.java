
package com.wordfinder.responsebean;

import java.util.Set;

// TODO: Auto-generated Javadoc
/**
 * The Class WordResponse.
 */
public class WordResponse {

	/** The word count. */
	private int wordCount;

	/** The common words. */
	private Set<String> commonWords;

	/**
	 * Instantiates a new word response.
	 */
	public WordResponse() {
	}

	/**
	 * Instantiates a new word response.
	 *
	 * @param commonWords the common words
	 */
	public WordResponse(Set<String> commonWords) {
		super();
		this.wordCount = commonWords.size();
		this.setCommonWords(commonWords);
	}

	/**
	 * Gets the word count.
	 *
	 * @return the word count
	 */
	public int getWordCount() {
		return wordCount;
	}

	/**
	 * Sets the word count.
	 *
	 * @param wordCount the new word count
	 */
	public void setWordCount(int wordCount) {
		this.wordCount = wordCount;
	}

	/**
	 * Gets the common words.
	 *
	 * @return the common words
	 */
	public Set<String> getCommonWords() {
		return commonWords;
	}

	/**
	 * Sets the common words.
	 *
	 * @param commonWords the new common words
	 */
	public void setCommonWords(Set<String> commonWords) {
		this.commonWords = commonWords;
	}



}