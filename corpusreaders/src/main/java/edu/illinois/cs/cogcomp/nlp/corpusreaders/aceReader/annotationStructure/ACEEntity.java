/**
 * This software is released under the University of Illinois/Research and
 *  Academic Use License. See the LICENSE file in the root folder for details.
 * Copyright (c) 2016
 *
 * Developed by:
 * The Cognitive Computation Group
 * University of Illinois at Urbana-Champaign
 * http://cogcomp.cs.illinois.edu/
 */
package edu.illinois.cs.cogcomp.nlp.corpusreaders.aceReader.annotationStructure;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ACEEntity  implements Serializable {
	
	public String classEntity;//CLASS;
	public String id;//ID;
	public String type;//TYPE;
	public String subtype;//SUBTYPE;

	public List<ACEEntityMention> entityMentionList = new ArrayList<ACEEntityMention>();
}
