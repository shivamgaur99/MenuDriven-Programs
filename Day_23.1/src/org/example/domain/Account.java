package org.example.domain;

public class Account implements Comparable<Account> {
	private int number;
	private String type;
	private float balance;
	public Account() {
		// TODO Auto-generated constructor stub
	}
	public Account(int number, String type, float balance) {
		this.number = number;
		this.type = type;
		this.balance = balance;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	@Override
	public int compareTo(Account other) {
		return this.number - other.number;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + number;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (number != other.number)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return String.format("%-10d%-15s%8.2f", this.number, this.type, this.balance);
	}
}
