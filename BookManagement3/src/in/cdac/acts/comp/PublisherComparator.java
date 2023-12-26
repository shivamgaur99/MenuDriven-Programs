package in.cdac.acts.comp;

import java.util.Comparator;

import in.cdac.acts.domain.Book;

public class PublisherComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		
		return  o1.getPublisher().compareTo(o2.getPublisher());
	}

}
