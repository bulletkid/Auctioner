package com.manuanand.auctioner;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Bid {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	private Integer itemId;

	private Integer bidderId;
	
	private Date biddingTime;

	// Must be greater than current price/starting price for bid to be accepter
	private double bidPrice;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public Integer getBidderId() {
		return bidderId;
	}

	public void setBidderId(Integer bidderId) {
		this.bidderId = bidderId;
	}

	public double getBidPrice() {
		return bidPrice;
	}

	public void setBidPrice(double bidPrice) {
		this.bidPrice = bidPrice;
	}

	public Date getBiddingTime() {
		return biddingTime;
	}

	public void setBiddingTime(Date biddingTime) {
		this.biddingTime = biddingTime;
	}
	
}