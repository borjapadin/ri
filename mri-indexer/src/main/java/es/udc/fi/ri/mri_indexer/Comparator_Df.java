package es.udc.fi.ri.mri_indexer;

import java.util.Comparator;

public class Comparator_Df implements Comparator <ListTermInfo> {

	@Override
	public int compare(ListTermInfo a, ListTermInfo b) {
		 return (int) Math.signum(b.getDf() - a.getDf());
	}

}
