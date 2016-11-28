//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: StockTest

package com.cobble.cs.lab13;

public class StockTest {

    public static void main(String[] args) {
        Stock oracleStock = new Stock("ORCL", "Oracle Corporation");
        oracleStock.setPreviousClosingPrice(34.5);
        oracleStock.setCurrentPrice(34.35);
        System.out.printf("%s's percent change is %f", oracleStock.getName(), oracleStock.getChangePercent());
    }
}