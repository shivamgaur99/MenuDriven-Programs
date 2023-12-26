package org.example.utils;

import java.util.Comparator;

import org.example.domain.Book;

public class IdComparator implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		return o1.getId()-o2.getId();
	}

}
