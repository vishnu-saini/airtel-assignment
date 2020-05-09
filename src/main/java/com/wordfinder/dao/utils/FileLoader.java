package com.wordfinder.dao.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// TODO: Auto-generated Javadoc
/**
 * The Class FileLoader.
 */
public class FileLoader {

	/**
	 * Load.
	 *
	 * @param f1 the f 1
	 * @return the sets the
	 * @throws FileNotFoundException the file not found exception
	 */
	public static Set<String> load(String f1) throws FileNotFoundException {
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(new File(f1));
		Set<String> out = new HashSet<String>();
		while (reader.hasNext()) {
			String temp = reader.nextLine();
			String[] sts = temp.split(" ");
			for (int i = 0; i < sts.length; i++) {
				if (sts[i] != "" && sts[i] != " " && sts[i] != "\n")
					out.add(sts[i]);
			}
		}
		return out;
	}
}
