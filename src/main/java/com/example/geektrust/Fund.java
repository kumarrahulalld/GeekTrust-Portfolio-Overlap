package com.example.geektrust;

import java.util.HashSet;

public class Fund {
    public Fund()
    {

    }
    public String getName() {
        return name;
    }

    public Fund setName(String name) {
        this.name = name;
        return this;
    }

    public HashSet<Stock> getStocks() {
        return stocks;
    }
    public void addStock(String stockName)
    {
        this.stocks.add(new Stock().setName(stockName));
    }

    public Fund setStocks(HashSet<Stock> stocks) {
        this.stocks = stocks;
        return this;
    }
    public Boolean isStockValid(Stock stock)
    {
        return stocks.contains(stock);
    }

    private String name;
    private HashSet<Stock> stocks;

}
