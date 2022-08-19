package com.example.geektrust;

import java.util.HashSet;

public class Fund {
    public Fund(String name,HashSet<Stock> stocks)
    {
        this.name=name;
        this.stocks=stocks;
    }
    public String getName() {
        return name;
    }
    public HashSet<Stock> getStocks() {
        return stocks;
    }
    public void addStock(String stockName)
    {
        this.stocks.add(new Stock(stockName));
    }
    public Boolean isStockValid(Stock stock)
    {
        return stocks.contains(stock);
    }

    private String name;
    private HashSet<Stock> stocks;

}
