/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.consoles;

/**
 *
 * @author emeris
 */
public class Consoles implements iConsole
{
    public String deviceType;
    public String storeName;
    public int salesAmount;
    
    public Consoles(String dev, String sto, int sal)
    {
        deviceType = dev;
        storeName = sto;
        salesAmount = sal;

    }
    @Override
    public String getConsoleType()
    {
        return deviceType + " ";
    }
    @Override 
    public String getStore()
    {
        return storeName + " ";
        
    }
    @Override 
    public int getTotalSales()
    {
        return salesAmount;
    }
    
}
