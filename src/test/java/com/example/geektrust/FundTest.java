package com.example.geektrust;

import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class FundTest {

    @Test
    void getStocks() {
        Fund fund=new Fund("",null);
        assertNull(fund.getStocks());
    }

    @Test
    void addStock() {
        Fund fund=new Fund("TestFund",new HashSet<>());
        fund.addStock("Invalid Stock");
        assertNotNull(fund.getStocks());
    }

    @Test
    void isStockValid() {
        Fund fund=new Fund("TestFund",new HashSet<>());
        fund.addStock("Invalid Stock");
        Stock stock=new Stock("Invalid Stock");
       assertTrue(fund.isStockValid(stock));
    }
}