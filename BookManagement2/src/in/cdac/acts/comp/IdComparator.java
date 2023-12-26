package in.cdac.acts.comp;

import java.util.Comparator;

import in.cdac.acts.domain.Book;

public class IdComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		return o1.getId()- o2.getId();
	}

}
