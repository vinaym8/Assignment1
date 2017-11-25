package com.actionbazaar.persistence;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="bidder")
@PrimaryKeyJoinColumn(name="user_Id")
public class Bidder extends User{
	
	@Column(name="bidderId")
	private int bidderId;

	public Bidder() {
		
	}
	
	

	public Bidder(int bidderId) {
		super();
		this.bidderId = bidderId;
	}



	public int getBidderId() {
		return bidderId;
	}

	public void setBidderId(int bidderId) {
		this.bidderId = bidderId;
	}
	
	
	
	
	
	
	//@OneToMany
	//@JoinColumn(name="bidder_id")
	//private Set<Bid>bids;

	//public Set<Bid> getBids() {
	//	return bids;
	//}

	//public void setBids(Set<Bid> bids) {
	//	this.bids = bids;
	//}
	
	

}
