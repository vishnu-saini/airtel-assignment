package com.wordfinder.dao.impl;

import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Set;
import java.util.Stack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.wordfinder.dao.WordFinderDao;
import com.wordfinder.dao.utils.FileLoader;
import com.wordfinder.exception.WordFinderApplicationException;
import com.wordfinder.resource.WordResource;

// TODO: Auto-generated Javadoc
/**
 * The Class WordFinderDaoImpl.
 */
@Repository
public class WordFinderDaoImpl implements WordFinderDao {

	/** The logger. */
	private final Logger logger = LoggerFactory.getLogger(WordResource.class);

	/* (non-Javadoc)
	 * @see com.wordfinder.dao.WordFinderDao#findCommonWords(java.util.Stack)
	 */
	@Override
	public Set<String> findCommonWords(Stack<String> fileNames) throws WordFinderApplicationException {

		Set<String> wordBucket1;
		Set<String> wordBucket2;
		try {
			wordBucket1 = FileLoader.load(fileNames.pop());
			while (!fileNames.isEmpty()) {
				wordBucket2 = FileLoader.load(fileNames.pop());
				Iterator<String> iterator1 = wordBucket1.iterator();
				while (iterator1.hasNext()) {
					String word1 = iterator1.next();
					Iterator<String> iterator2 = wordBucket2.iterator();
					boolean isFound = false;
					while (iterator2.hasNext()) {
						String word2 = iterator2.next();
						
						/*remove special character */
						word1 = word1.replaceAll("[~!@#$%^&*]","");
						word2 = word2.replaceAll("[~!@#$%^&*]","");
						
						if (word1.equalsIgnoreCase(word2)) {
							System.out.println(word1);
							isFound = true;
							break;
						}
					}

					if (!isFound) {
						iterator1.remove();
					}
				}
			}

		} catch (FileNotFoundException e) {
			throw new WordFinderApplicationException("File not present on the server");
		}
		logger.info("Common words are : " + wordBucket1);
		return wordBucket1;
	}

}
