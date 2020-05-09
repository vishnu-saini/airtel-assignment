package com.wordfinder.aspect;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.wordfinder.exception.WordFinderApplicationException;

// TODO: Auto-generated Javadoc
/**
 * The Class DaoAspect.
 */
@Component
@Aspect
public class DaoAspect {

	/** The Constant logger. */
	private static final Logger logger = LoggerFactory.getLogger(DaoAspect.class);

	/**
	 * Do recovery actions.
	 *
	 * @param daoException the dao exception
	 * @throws WordFinderApplicationException the word finder application exception
	 */
	@AfterThrowing(pointcut = "within(com.incedo.booklib.service..*)", throwing = "daoException")
	public void doRecoveryActions(Exception daoException) throws WordFinderApplicationException {
		logger.debug(daoException.getStackTrace().toString());
		throw new WordFinderApplicationException();
	}

}