package com.wordfinder.exception;

// TODO: Auto-generated Javadoc
/**
 * The Class WordFinderApplicationException.
 */
public class WordFinderApplicationException extends Exception {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -761982813124377039L;

	/**
	 * Instantiates a new word finder application exception.
	 */
	public WordFinderApplicationException() {
		super("There is some issue in our webservice, please reach out to our support team");
	}

	/**
	 * Instantiates a new word finder application exception.
	 *
	 * @param message the message
	 * @param cause the cause
	 * @param enableSuppression the enable suppression
	 * @param writableStackTrace the writable stack trace
	 */
	public WordFinderApplicationException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	/**
	 * Instantiates a new word finder application exception.
	 *
	 * @param message the message
	 * @param cause the cause
	 */
	public WordFinderApplicationException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Instantiates a new word finder application exception.
	 *
	 * @param message the message
	 */
	public WordFinderApplicationException(String message) {
		super(message);
	}

	/**
	 * Instantiates a new word finder application exception.
	 *
	 * @param cause the cause
	 */
	public WordFinderApplicationException(Throwable cause) {
		super(cause);
	}

}