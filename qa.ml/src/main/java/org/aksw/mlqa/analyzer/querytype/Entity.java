package org.aksw.mlqa.analyzer.querytype;

import java.util.ArrayList;
import java.util.List;

import org.apache.jena.rdf.model.Resource;

public class Entity implements Comparable<Entity> {
	public String label = "";
	public String type = "";
	public List<Resource> uris = new ArrayList<Resource>();
	public List<Resource> posTypesAndCategories = new ArrayList<Resource>();

	@Override
	public String toString() {
		return label + " (" + uris.get(0) + ")";
	}

	@Override
	public int compareTo(Entity o) {
		int thisLength = label.length();
		int otherLength = o.label.length();
		if (thisLength < otherLength) {
			return -1;
		}
		if (thisLength > otherLength) {
			return 1;
		}
		return 0;
	}

}
