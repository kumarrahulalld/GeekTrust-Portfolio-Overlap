package com.example.geektrust;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StockDataTest {

    @Test
    void isFundNameValid() {
        StockData stockData=new StockData();
        assertFalse(stockData.isFundNameValid("Invalid Fund"));
        assertTrue(stockData.isFundNameValid("AXIS_BLUECHIP"));
    }

    @Test
    void addStock() {
        StockData stockData=new StockData();
        Fund fund=stockData.getFundByName("AXIS_BLUECHIP");
        fund.addStock("Invalid");
        Fund updatedFund=stockData.getFundByName("AXIS_BLUECHIP");
        assertTrue(fund.equals(updatedFund));
    }

    @Test
    void getFundByName() {
        StockData stockData=new StockData();
        assertNull(stockData.getFundByName("Invalid Fund"));
        assertNotNull(stockData.getFundByName("AXIS_BLUECHIP"));
    }

    @Test
    void getStockByFundName() {
        StockData stockData=new StockData();
        Fund fund=stockData.getFundByName("AXIS_BLUECHIP");
        assertNull(stockData.getStockByFundName("Invalid"));
        assertNotNull(stockData.getStockByFundName("AXIS_BLUECHIP"));
    }
}