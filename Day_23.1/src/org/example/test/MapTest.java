package org.example.test;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.example.domain.Account;
import org.example.domain.Customer;

public class MapTest {
	private Map<Account, Customer> map;
	public void setMap(Map<Account, Customer> map) {
		this.map = map;
	}
	public void addEntries(Account[] keys, Customer[] values) {
		if( this.map != null ) {
			for( int index = 0; index < keys.length; ++ index ) {
				Account key = keys[ index ];
				Customer value = values[ index ];
				this.map.put(key, value);
			}
		}
	}
	public Customer findCustomer(int accountNumber) {
		if( this.map != null ) {
			Account key = new Account();
			key.setNumber(accountNumber);
			if( this.map.containsKey(key)) {
				Customer value = this.map.get(key);
				return value;
			}
		}
		return null;
	}
	public boolean removeEntry(int accountNumber) {
		if( this.map != null ) {
			Account key = new Account();
			key.setNumber(accountNumber);
			if( this.map.containsKey(key)) {
				this.map.remove(key);
				return true;
			}
		}
		return false;
	}
	public void printEntries() {
		if( this.map != null ) {
			Set<Entry<Account, Customer>> entries = this.map.entrySet();
			for (Entry<Account, Customer> entry : entries) {
				Account key = entry.getKey();
				Customer value = entry.getValue();
				System.out.println(key+" "+value);
			}
		}
	}
}
