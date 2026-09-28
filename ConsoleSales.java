/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.consoles;

/**
 *
 * @author emeris
 */
public class ConsoleSales extends Consoles 
{
    public ConsoleSales(String dev, String sto, int sal)
    {
        super(dev, sto, sal);
    }
    public void PrintReportMethod()
    {
        System.out.println("Console Type:" + getConsoleType());
        System.out.println("Store Name: " + getStore());
        System.out.println("Total Sales:" + getTotalSales());
    }
            
    
}
