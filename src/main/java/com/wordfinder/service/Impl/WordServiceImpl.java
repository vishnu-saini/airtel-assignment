package com.wordfinder.service.Impl;

import java.util.Set;
import java.util.Stack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import com.wordfinder.aspect.Loggable;
import com.wordfinder.dao.WordFinderDao;
import com.wordfinder.exception.WordFinderApplicationException;
import com.wordfinder.exception.WordFinderBusinessException;
import com.wordfinder.service.WordService;

// TODO: Auto-generated Javadoc
/**
 * The Class WordServiceImpl.
 */
@Service
public class WordServiceImpl implements WordService {

	/** The word finder dao. */
	@Autowired
	WordFinderDao wordFinderDao;

	/** The message source. */
	@Autowired
	MessageSource messageSource;

	/* (non-Javadoc)
	 * @see com.wordfinder.service.WordService#findCommonWords(java.util.Stack)
	 */
	@Override
	@Loggable
	public Set<String> findCommonWords(Stack<String> fileNames)
			throws WordFinderBusinessException, WordFinderApplicationException {
		return wordFinderDao.findCommonWords(fileNames);
	}

}
