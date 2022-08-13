package com.example.geektrust;

import java.util.Objects;

public class Stock {
    private String name;

    public Stock() {
    }

    public String getName() {
        return name;
    }

    public Stock setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stock stock = (Stock) o;
        return Objects.equals(name, stock.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
