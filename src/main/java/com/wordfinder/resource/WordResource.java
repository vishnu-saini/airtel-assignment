package com.wordfinder.resource;

import java.util.Stack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wordfinder.constant.ResponseType;
import com.wordfinder.responsebean.RootResponse;
import com.wordfinder.responsebean.WordResponse;
import com.wordfinder.service.WordService;

// TODO: Auto-generated Javadoc
/**
 * The Class WordResource.
 */
@CrossOrigin
@RestController
@RequestMapping("commonwords")
public class WordResource {

	/** The word service. */
	@Autowired
	private WordService wordService;

	/**
	 * Find words.
	 *
	 * @return the root response
	 * @throws Exception the exception
	 */
	@RequestMapping(method = RequestMethod.GET, params = {}, produces = MediaType.APPLICATION_JSON_VALUE)
	public RootResponse<WordResponse> findWords() throws Exception {
		return new RootResponse<WordResponse>(ResponseType.SUCCESS,
				new WordResponse(wordService.findCommonWords(new Stack<>())));
	}

	/**
	 * Find words from files.
	 *
	 * @param filePaths the file paths
	 * @return the root response
	 * @throws Exception the exception
	 */
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public RootResponse<WordResponse> findWordsFromFiles(@RequestBody Stack<String> filePaths) throws Exception {
		System.out.println(filePaths);
		return new RootResponse<WordResponse>(ResponseType.SUCCESS,
				new WordResponse(wordService.findCommonWords(filePaths)));
	}

}
