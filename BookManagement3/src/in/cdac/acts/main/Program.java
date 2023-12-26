package in.cdac.acts.main;

import java.util.HashSet;
import java.util.Scanner;

//import java.util.TreeSet;

import in.cdac.acts.comp.mainMenu;
import in.cdac.acts.domain.Book;
import in.cdac.acts.test.SetTest;

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

	private static Book acceptBook() {
		System.out.print("Enter Book id.:");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Book name.:");
		String name = sc.nextLine();
		System.out.print("Enter Author name.:");
		String author = sc.nextLine();
		System.out.print("Enter publisher name.:");
		String publisher = sc.nextLine();
		System.out.print("Enter Book price.:");
		float price = sc.nextFloat();

		Book book = new Book(id, name, author, publisher, price);
		return book;
	}

// public
//	public enum mainMenu {
//		EXIT, ADD_BOOKS, ADD_BOOK, FIND_BOOKS, REMOVE_BOOKS, PRINT_BOOKS;
//	}

	private static void aaceptRecord(int[] bookId) {
		if (bookId != null)
			System.out.println("Enter book Id : ");
		bookId[0] = sc.nextInt();

	}

	private static void printRecord(Book book) {
		if (book != null)
			System.out.println(book.toString());
		else
			System.out.println("Book not Found");
	}

	private static void printRecord(boolean removedStatus) {
		if (removedStatus)
			System.out.println("Book removed");
		else
			System.out.println("Book not Found");
	}

	private static mainMenu menuList() {
		System.out.println("0.Exit");
		System.out.println("1.Add Book(s)");
		System.out.println("2.Add Book");
		System.out.println("3.Find Book");
		System.out.println("4.remove book");
		System.out.println("5.PRINT bOOKS ");
		System.out.println("6.Enter your choice : ");
		return mainMenu.values()[sc.nextInt()];

	}

	@SuppressWarnings("incomplete-switch")
	public static void main(String[] args) {
		mainMenu choice;
		int[] bookId = new int[1];
		SetTest test = new SetTest();
		//test.setBookList(new TreeSet<>());
		test.setBookList(new HashSet<>());
		while ((choice = Program.menuList()) != mainMenu.EXIT) {
			switch (choice) {
			case ADD_BOOKS:
				test.addBooks(Program.getArray());
				test.printBooks();
				break;
			case ADD_BOOK:
				test.addBook(Program.acceptBook());
				test.printBooks();
				break;
			case FIND_BOOKS:
				Program.aaceptRecord(bookId);
				Book book = test.findBook(bookId[0]);
				Program.printRecord(book);
				break;
			case REMOVE_BOOKS:
				Program.aaceptRecord(bookId);
				boolean removedStatus = test.removeBook(bookId[0]);
				Program.printRecord(removedStatus);
				test.printBooks();
				break;
			case PRINT_BOOKS:
				test.printBooks();
				break;

			}

		}

	}

}

