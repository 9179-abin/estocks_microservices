package com.estocks.estockscommandapi.commands;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

public class RegisterCompanyCommand {

	@TargetAggregateIdentifier
	private final String companyCode;
	private final String companyName;
	private final String companyCeo;
	private final Integer turnover;
	private final String website;
	private final String stockExchange;
	private final Float stockPrice;

	public RegisterCompanyCommand(String companyCode, String companyName, String companyCeo, Integer turnover,
			String website, String stockExchange, Float stockPrice) {
		this.companyCode = companyCode;
		this.companyName = companyName;
		this.companyCeo = companyCeo;
		this.turnover = turnover;
		this.website = website;
		this.stockExchange = stockExchange;
		this.stockPrice = stockPrice;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public String getCompanyName() {
		return companyName;
	}

	public String getCompanyCeo() {
		return companyCeo;
	}

	public Integer getTurnover() {
		return turnover;
	}

	public String getWebsite() {
		return website;
	}

	public String getStockExchange() {
		return stockExchange;
	}

	public Float getStockPrice() {
		return stockPrice;
	}

	@Override
	public String toString() {
		return "RegisterCompanyCommand [companyCode=" + companyCode + ", companyName=" + companyName + ", companyCeo="
				+ companyCeo + ", turnover=" + turnover + ", website=" + website + ", stockExchange=" + stockExchange
				+ ", stockPrice=" + stockPrice + "]";
	}

}
