package com.example.geektrust;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PortfolioTest {

    @Test
    void getCurrentPortfolio() {
        Portfolio portfolio=new Portfolio();
        assertEquals(0,portfolio.getCurrentPortfolio().size());
    }
}