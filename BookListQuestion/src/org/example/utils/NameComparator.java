package org.example.utils;

import java.util.Comparator;

import org.example.domain.Book;

public class NameComparator implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
