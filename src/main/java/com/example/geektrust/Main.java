package com.example.geektrust;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Portfolio portfolio=new Portfolio();
        StockData stockData=new StockData();
        try {
            FileInputStream fis = new FileInputStream(args[0]);
            Scanner sc = new Scanner(fis);
            while (sc.hasNextLine()) {
                String inputLine = sc.nextLine();
                String[] commandData = inputLine.split(" ");
                switch (commandData[0]) {
                    case "CURRENT_PORTFOLIO":
                        for (int i = 1; i < commandData.length; i++)
                            portfolio.addFund(commandData[i], stockData);
                        break;
                    case "CALCULATE_OVERLAP":
                        Fund firstFund = stockData.getFundByName(commandData[1]);
                        if (firstFund == null)
                            System.out.println("FUND_NOT_FOUND");
                        else {
                            for (Fund fund : portfolio.getCurrentPortfolio()) {
                                if (!fund.getName().equals(commandData[1])) {
                                    portfolio.calculateOverlap(firstFund, fund);
                                }
                            }
                        }
                        break;
                    case "ADD_STOCK":
                        String stockName="";
                        for(int i=2;i< commandData.length;i++) {
                            stockName += commandData[i];
                            if(i!=commandData.length-1)
                                stockName+=" ";
                        }
                        portfolio.addStock(stockName, commandData[1], stockData);
                        break;
                }
            }
            sc.close();
        } catch (IOException e) {
            System.out.println("FILE_NOT_FOUND");
        }
    }
}
