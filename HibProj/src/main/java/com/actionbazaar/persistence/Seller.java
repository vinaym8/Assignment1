package com.actionbazaar.persistence;

import java.math.BigDecimal;
//import java.util.Set;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="seller")

@PrimaryKeyJoinColumn(name="user_id")
public class Seller extends User {
	
	@Column(name="max_items")
	private Long maxItemsAllowed;
	@Column(name="commision_rate")
	private BigDecimal commisionRate;
	
	//@OneToMany
	//@JoinColumn(name="seller_id")
	//private Set<Item>items;

	public Seller() {
		
	}
	
	

	public Seller(Long maxItemsAllowed, BigDecimal commisionRate) {
		super();
		this.maxItemsAllowed = maxItemsAllowed;
		this.commisionRate = commisionRate;
	}



	public Long getMaxItemsAllowed() {
		return maxItemsAllowed;
	}

	public void setMaxItemsAllowed(Long maxItemsAllowed) {
		this.maxItemsAllowed = maxItemsAllowed;
	}

	public BigDecimal getCommisionRate() {
		return commisionRate;
	}

	public void setCommisionRate(BigDecimal commisionRate) {
		this.commisionRate = commisionRate;
	}

	/*public Set<Item> getItems() {
		return items;
	}

	public void setItems(Set<Item> items) {
		this.items = items;
	}*/
	
	
	
	

}
