/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.consolesales;

/**
 *
 * @author Student
 */
public class ConsoleSales {

//ConsoleSales extends Console 

    // Constructor
    public ConsoleSales(String consoleType, String store, int totalSales) {
        super(consoleType, store, totalSales);
    }

    // Print report
    public void printReport() {

        System.out.println();
        System.out.println("CONSOLE SALES REPORT");
        System.out.println("********************");
        System.out.println();

        System.out.println("CONSOLE TYPE: " + getConsoleType());
        System.out.println("STORE: " + getStore());
        System.out.println("TOTAL SALES: " + getTotalSales());
    }
}