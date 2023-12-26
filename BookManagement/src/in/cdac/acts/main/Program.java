package in.cdac.acts.main;

import java.util.ArrayList;
import java.util.Comparator;
//import java.util.LinkedList;
import java.util.Scanner;
//import java.util.Vector;

import in.cdac.acts.comp.AuthorComparator;
import in.cdac.acts.comp.IdComparator;
import in.cdac.acts.comp.NameComparator;
import in.cdac.acts.comp.PriceComparator;
import in.cdac.acts.comp.publisherComparator;
import in.cdac.acts.domain.Book;
import in.cdac.acts.test.ListTest;

public class Program {

	private static Scanner sc = new Scanner(System.in);

	private static Book[] getArray() {
		Book[] arr = new Book[10];
		arr[0] = new Book(1083, "The Alchemist", "Paulo Coelho", "HarperColins", 901.14f);
		arr[1] = new Book(461, "The Da Vinci Code", "Dan Brown", "Doubleday", 1065.13f);
		arr[2] = new Book(932, "Harry Potter and the Philosopher's Stone", "J.K. Rowling", "Bloomsbury", 819.14f);
		arr[3] = new Book(1159, "The Hunger Games", "Suzanne Collins", "Scholastic Press", 737.15f);
		arr[4] = new Book(691, "The Girl with the Dragon Tattoo", "Stieg Larsson", "Norstedts Förlag", 1229.13f);
		arr[5] = new Book(115, "The Lord of the Rings", "J.R.R. Tolkien", "George Allen & Unwin", 1639.11f);
		arr[6] = new Book(574, "The Catcher in the Rye", "J.D. Salinger", "Little, Brown and Company", 983.14f);
		arr[7] = new Book(230, "The Fault in Our Stars", "John Green", "Dutton Books", 1147.13f);
		arr[8] = new Book(864, "Gone Girl", "Gillian Flynn", "Crown Publishing Group", 901.14f);
		arr[9] = new Book(383, "Pride and Prejudice", "Jane Austen", "T. Egerton, Whitehall", 655.15f);
		return arr;
	}

	private static void aaceptRecord(int[] bookId) {
		if (bookId != null)
			System.out.println("Enter book Id : ");
		bookId[0] = sc.nextInt();

	}

	private static void printRecord(Book book) {
		if (book != null)
			System.out.println(book.toString());
		else
			System.out.println("book not found");
	}

	private static void printRecord(boolean removedStatus) {
		if (removedStatus)
			System.out.println("Book id removed");
		else
			System.out.println("book not found");
	}

	public static int menuList() {
		System.out.println("0.Exit");
		System.out.println("1.Add Book");
		System.out.println("2.Find Book");
		System.out.println("3.Remove Book");
		System.out.println("4.Print Books[sorted]");
		System.out.println("Enter your choice : ");
		return sc.nextInt();
	}

	public static int subMenuList() {
		System.out.println("0.Exit");
		System.out.println("1.Compare by Book id");
		System.out.println("2.Compare by Book name");
		System.out.println("3.Compare by Book author");
		System.out.println("4.Compare by Book publisher");
		System.out.println("5.Compare by Book price");
		System.out.println("Enter your choice : ");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		int choice;
		int[] bookId = new int[1];
		ListTest test = new ListTest();
		test.setBookList(new ArrayList<>());
		// test.setBookList(new Vector<>());
		// test.setBookList(new LinkedList<>());

		while ((choice = Program.menuList()) != 0) {
			switch (choice) {
			case 1:
				Book[] arr = Program.getArray();
				test.addBooks(arr);
				test.printBooks();
				;
				break;
			case 2:
				Program.aaceptRecord(bookId);
				Book book = test.findBooks(bookId[0]);
				Program.printRecord(book);
				break;
			case 3:
				Program.aaceptRecord(bookId);
				boolean removedStatus = test.removeBook(bookId[0]);
				Program.printRecord(removedStatus);
				break;
			case 4:
				while ((choice = Program.subMenuList()) != 0) {
					Comparator<Book> comparator = null;
					switch (choice) {
					case 1:
						comparator = new IdComparator();
						break;
					case 2:
						comparator = new NameComparator();
						break;
					case 3:
						comparator = new AuthorComparator();
						break;
					case 4:
						comparator = new publisherComparator();
						break;
					case 5:
						comparator = new PriceComparator();
						break;
					}
					test.printBooks(comparator);
				}
				break;
			}

		}

	}

}
