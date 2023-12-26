package org.example.test;

import java.util.Comparator;
import java.util.List;

import org.example.domain.Book;

public class ListTest {
	private List<Book> bookList;
	public void setBookList(List<Book> bookList) {
		this.bookList=bookList;		
	}

	public void addBooks(Book[] arr) {
		if(this.bookList!=null) {
			if(arr != null) {
				for(Book book : arr)
					this.bookList.add(book);
			}
		}
	}

	public void findBook(int nextInt) {
		if (this.bookList != null) {
			Book key = new Book();
			key.setId(nextInt);
			if (this.bookList.contains(key)) {
				int index = this.bookList.indexOf(key);
				System.out.println("Book found at index.:"+index);
				System.out.println(this.bookList.get(index));
			}
		}
		else
			System.out.println("Book NOT found !");
	}

	public void removeBook(int nextInt) {
		if (this.bookList != null) {
			Book key = new Book();
			key.setId(nextInt);
			if (this.bookList.contains(key)) {
				this.bookList.remove(key);
				System.out.println("Book removed!");
			}
		}
		else
			System.out.println("Book NOT found !");
		
	}

	public void printBooks(Comparator<Book> comparator) {
		if (this.bookList != null) {
			this.bookList.sort(comparator);
			this.bookList.forEach(System.out::println);
		}		
	}

	public void addBook(Book acceptRecord) {
		if(this.bookList!=null) {
			this.bookList.add(acceptRecord);
			System.out.println("Added the book successfully!");
		}
		else
			System.out.println("Book not added.");
	}

}
