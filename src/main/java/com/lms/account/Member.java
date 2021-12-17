package com.lms.account;

import java.sql.Date;

import com.lms.entity.Person;

public class Member extends Account{
	private Date dateOfMembership;
	private int totalBooksCheckedout;
	
	public Member(String id, String password, AccountStatus status, Person person, Date dateOfMembership,
			int totalBooksCheckedout) {
		super(id, password, status, person);
		this.dateOfMembership = dateOfMembership;
		this.totalBooksCheckedout = totalBooksCheckedout;
	}
	
	public Date getDateOfMembership() {
		return dateOfMembership;
	}
	
	public void setDateOfMembership(Date dateOfMembership) {
		this.dateOfMembership = dateOfMembership;
	}
	
	public int getTotalBooksCheckedout() {
		return totalBooksCheckedout;
	}
	
	public void setTotalBooksCheckedout(int totalBooksCheckedout) {
		this.totalBooksCheckedout = totalBooksCheckedout;
	}
}
