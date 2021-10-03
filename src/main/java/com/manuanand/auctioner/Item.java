package com.manuanand.auctioner;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Item {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	private String title;

	private String description;
	
	private Integer sellerId;
	
	private double startingPrice;

	private double outrightBuyPrice;

	private Integer currentWinningUserId;
	
	private double currentPrice;
	
	private Date auctionStartTime;
	
	private Date auctionEndTime;
	
	private Boolean isActive;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getSellerId() {
		return sellerId;
	}

	public void setSellerId(Integer sellerId) {
		this.sellerId = sellerId;
	}

	public double getStartingPrice() {
		return startingPrice;
	}

	public void setStartingPrice(double startingPrice) {
		this.startingPrice = startingPrice;
	}

	public double getOutrightBuyPrice() {
		return outrightBuyPrice;
	}

	public void setOutrightBuyPrice(double outrightBuyPrice) {
		this.outrightBuyPrice = outrightBuyPrice;
	}

	public Integer getCurrentWinningUserId() {
		return currentWinningUserId;
	}

	public void setCurrentWinningUserId(Integer currentWinningUserId) {
		this.currentWinningUserId = currentWinningUserId;
	}

	public double getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}

	public Date getAuctionStartTime() {
		return auctionStartTime;
	}

	public void setAuctionStartTime(Date auctionStartTime) {
		this.auctionStartTime = auctionStartTime;
	}

	public Date getAuctionEndTime() {
		return auctionEndTime;
	}

	public void setAuctionEndTime(Date auctionEndTime) {
		this.auctionEndTime = auctionEndTime;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
}