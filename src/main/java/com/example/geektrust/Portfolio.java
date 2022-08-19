package com.example.geektrust;
import java.util.ArrayList;
import java.util.List;

public class Portfolio {
    private List<Fund> currentPortfolio=new ArrayList<>();

    public List<Fund> getCurrentPortfolio() {
        return currentPortfolio;
    }
    public void addStock(String stockName,String fundName,StockData stockData)
    {
        stockData.addStock(stockName,fundName);
    }
    public void addFund(String fundName,StockData stockData)
    {
        if(stockData.isFundNameValid(fundName))
        {
            this.currentPortfolio.add(new Fund(fundName,stockData.getStockByFundName(fundName)));
        }
        else
        {
            System.out.println("FUND_NOT_FOUND");
        }
    }
    public void calculateOverlap(Fund first,Fund second) {
        double matchedCount = 0;
        double totalCount;
        for (Stock stock : first.getStocks()) {
            if (second.isStockValid(stock))
                matchedCount++;
        }
        totalCount = first.getStocks().size() + second.getStocks().size();
        double calculatedOverlap = (2.0 * (matchedCount / totalCount) * 100.0);
        calculatedOverlap = Double.parseDouble(String.format("%.2f", calculatedOverlap));
        if (calculatedOverlap > 0) {
            String result = String.valueOf(calculatedOverlap);
            System.out.println(first.getName() + " " + second.getName() + " " + (result.length() == 5 || calculatedOverlap<10 ? result : result + "0") + "%");
        }
    }
}
