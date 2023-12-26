package org.example.main;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;

import org.example.domain.Account;
import org.example.domain.Customer;
import org.example.test.MapTest;

public class Program {
	private static Scanner sc = new Scanner(System.in);
	private static Account[] getKeys( ) {
		Account[] arr = new Account[ 5 ];
		arr[ 0 ] = new Account( 4627,"Saving", 10000.50f);
		arr[ 1 ] = new Account( 1930,"Current",20000.50f);
		arr[ 2 ] = new Account( 5629,"Loan",30000.50f);
		arr[ 3 ] = new Account( 9356,"Pention",40000.50f);
		arr[ 4 ] = new Account( 7485,"PPF",50000.50f);
		return arr;
	}
	private static Customer[] getValues( ) {
		Customer[] arr = new Customer[ 5 ];
		arr[ 0 ] = new Customer("Chetan","chetan@gmail.com","9527325202");
		arr[ 1 ] = new Customer("Ganesh","ganesh@gmail.com","9527325202");
		arr[ 2 ] = new Customer("Saishwar","saishwar@gmail.com","9527325202");
		arr[ 3 ] = new Customer("Anup","anup@gmail.com","9527325202");
		arr[ 4 ] = new Customer("Mahesh","mahesh@gmail.com","9527325202");
		return arr;
	}
	public static void acceptRecord( int[] accountNumber ) {
		if( accountNumber != null ) {
			System.out.print("Enter account number	:	");
			accountNumber[ 0 ] = sc.nextInt();
		}
	}
	private static void printRecord(Customer value) {
		if( value != null )
			System.out.println( value );
		else
			System.out.println("Account not found");
	}
	private static void printRecord(boolean removedStatus) {
		if( removedStatus )
			System.out.println("Entry is removed.");
		else
			System.out.println("Account not found");
	}
	private static int menuList( ) {
		System.out.println("0.Exit.");
		System.out.println("1.Add Entry.");
		System.out.println("2.Find Customer.");
		System.out.println("3.Remove Entry.");
		System.out.println("4.Print Entries.");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	public static void main(String[] args) {
		int choice;
		int[] accountNumber = new int[ 1 ];
		MapTest test = new MapTest();
		//test.setMap( new Hashtable<>() );
		//test.setMap( new HashMap<>());
		//test.setMap( new LinkedHashMap<>());
		test.setMap(new TreeMap<>());
		while( ( choice = Program.menuList( ) ) != 0 ) {
			switch( choice ) {
			case 1:
				Account[] keys = Program.getKeys();
				Customer[] values = Program.getValues();
				test.addEntries( keys, values );
				break;
			case 2:
				Program.acceptRecord(accountNumber);
				Customer value =  test.findCustomer( accountNumber[ 0 ] );
				Program.printRecord( value );
				break;
			case 3:
				Program.acceptRecord(accountNumber);
				boolean removedStatus =  test.removeEntry( accountNumber[ 0 ] );
				Program.printRecord( removedStatus );
				break;
			case 4:
				test.printEntries( );
				break;
			}
		}
	}
}
