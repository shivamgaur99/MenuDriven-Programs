package org.example.Main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

import org.example.domain.Book;
import org.example.test.ListTest;
import org.example.utils.AuthorComparator;
import org.example.utils.IdComparator;
import org.example.utils.MainMenu;
import org.example.utils.NameComparator;
import org.example.utils.PriceComparator;
import org.example.utils.PublisherComparator;
import org.example.utils.SubMenu;

public class Program {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		MainMenu choice; SubMenu subChoice;
		ListTest test = new ListTest();
		test.setBookList(new ArrayList<>());
		while((choice = Program.menuList()) != MainMenu.EXIT) {
			switch(choice) {
			case ADD_BOOKS:
				test.addBooks(Program.getArry());
				break;
			case ADD:
				test.addBook(Program.acceptRecord());
				break;
			case FIND:
				System.out.println("Enter book id to search");
				 test.findBook( sc.nextInt() );
				 break;
			case REMOVE:
				System.out.println("Enter book id to remove");
				 test.removeBook( sc.nextInt() );
				 break;
			case SORT:
				while((subChoice = Program.subMenuList()) != SubMenu.EXIT) {
					Comparator<Book> comparator = null;
					switch( subChoice ) {
					case BYID:
						comparator = new IdComparator();
						break;
					case BYNAME:
						comparator = new NameComparator();
						break;
					case BYAUTHOR:
						comparator = new AuthorComparator();
						break;
					case BYPUBLISHER:
						comparator = new PublisherComparator();
						break;
					case BYPRICE:
						comparator = new PriceComparator();
						break;
					}
					test.printBooks(comparator);
				}
			}
		}

	}
	private static Book acceptRecord() {
		System.out.print("Enter Book id.:");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Book name.:");
		String name = sc.nextLine();
		System.out.print("Enter Author name.:");
		String author = sc.nextLine();
		System.out.print("Enter publisher name.:");
		String p = sc.nextLine();
		System.out.print("Enter Book price.:");
		float price = sc.nextFloat();
		
		Book b = new Book(id,name,author,p,price);
		return b;
		
	}
	private static SubMenu subMenuList() {
		System.out.println("0.Exit");
		System.out.println("1.Compare By book id");
		System.out.println("2.Compare By book name");
		System.out.println("3.Compare By book author");
		System.out.println("4.Compare By book publisher");
		System.out.println("5.Compare By book price");
		System.out.print("Enter choice	:	");
		return SubMenu.values()[sc.nextInt()];
	}
	private static Book[] getArry() {
		Book[] arr = new Book[ 10 ];
		arr[ 0 ] = new Book(1083, "The Alchemist", "Paulo Coelho", "HarperCollins", 901.14f);
		arr[ 1 ] = new Book(461, "The Da Vinci Code", "Dan Brown", "Doubleday", 1065.13f);
		arr[ 2 ] = new Book(932, "Harry Potter and the Philosopher's Stone", "J.K. Rowling", "Bloomsbury", 819.14f);
		arr[ 3 ] = new Book(1159, "The Hunger Games", "Suzanne Collins", "Scholastic Press", 737.15f);
		arr[ 4 ] = new Book(691, "The Girl with the Dragon Tattoo", "Stieg Larsson", "Norstedts Förlag", 1229.13f);
		arr[ 5 ] = new Book(115, "The Lord of the Rings", "J.R.R. Tolkien", "George Allen & Unwin", 1639.11f);
		arr[ 6 ] = new Book(574, "The Catcher in the Rye", "J.D. Salinger", "Little, Brown and Company", 983.14f);
		arr[ 7 ] = new Book(230, "The Fault in Our Stars", "John Green", "Dutton Books", 1147.13f);
		arr[ 8 ] = new Book(864, "Gone Girl", "Gillian Flynn", "Crown Publishing Group", 901.14f);
		arr[ 9 ] = new Book(383, "Pride and Prejudice", "Jane Austen", "T. Egerton, Whitehall", 655.15f);
		return arr;
	}
	private static MainMenu menuList() {
		System.out.println("0.Exit");
		System.out.println("1.Add Book(s)");
		System.out.println("2.Add Book");
		System.out.println("3.Find Book");
		System.out.println("4.Remove Book");
		System.out.println("5.Print Books[Sorted]");
		System.out.print("Enter choice	:	");
		
		return MainMenu.values()[sc.nextInt()];
	}

}
