//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: Stock

package com.cobble.cs.lab13;

public class Stock {

    /** Stores the symbol of the stock. */
    private String symbol;

    /** Stores the name of the stock. */
    private String name;

    /** Stores the previous closing price of the stock. */
    private double previousClosingPrice;

    /** Stores the current price of the stock. */
    private double currentPrice;

    /**
     * Creates a Stock with an empty symbol and name.
     */
    public Stock() {
        this("", "");
    }

    /**
     * Creates a Stock with a specified symbol and name.
     * @param symbol The symbol of the stock.
     * @param name The name of the stock.
     */
    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    /**
     * Gets the symbol of the Stock.
     * @return The current symbol of the Stock.
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * Sets the symbol of the Stock.
     * @param symbol The new symbol of the Stock.
     */
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    /**
     * Gets the name of the Stock.
     * @return The current name of the Stock.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the Stock.
     * @param name The new name of the Stock.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the previous closing price of the Stock.
     * @return The current closing price of the Stock.
     */
    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    /**
     * Sets the previous closing price of the Stock.
     * @param previousClosingPrice The new closing price of the Stock.
     */
    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    /**
     * Gets the current price of the Stock.
     * @return The current price of the Stock.
     */
    public double getCurrentPrice() {
        return currentPrice;
    }

    /**
     * Sets the current price of the Stock.
     * @param currentPrice The new current price of the Stock.
     */
    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    /**
     * Calculates the percent changed from previous closing price to the current price.
     * @return The percent changed from previous closing price to the current price.
     */
    public double getChangePercent() {
        return (Math.abs(previousClosingPrice - currentPrice) / previousClosingPrice) * 100;
    }
}