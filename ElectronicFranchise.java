/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.electronicfranchise;
import java.util.Scanner;

/**
 *
 * @author emeris
 */
public class ElectronicFranchise {

    public static void main(String[] args) {
        String [][] sales = new String [4][4];
        
        // Row 0: Headers
        sales [0][1] = "PS5";
        sales [0][2] = "XBOX";
        sales [0][3] = "SWITCH"; 
        
        //Row 1: Cape Town
        sales [1][0] = "Cape Town";
        sales [1][1] = "1000";
        sales [1][2] = "2000";
        sales [1][3] = "3000";
        
        //Row 2: Port Elizabeth
        sales [2][0] = "Port Elizabeth";
        sales [2][1] = "2000";
        sales [2][2] = "3000";
        sales [2][3] = "4000";
        
        //Row 3: Pretoria
        sales [3][0] = "Pretoria";
        sales [3][1] = "1500";
        sales [3][2] = "1100";
        sales [3][3] = "1200";
        
        System.out.println("-----------------------------------------");
        System.out.println("Gaming Console Report");
        System.out.println("-----------------------------------------");
        
        for(int row = 0; row < sales.length; row++);
        {
        for (int col = 0; col < sales[row].length; col++);
        {
            
        {
        System.out.print(sales[row][col]+ "\t");
    }
        System.out.println();
        
        double[] rowTotals = new double [sales.length];
    
}
        for(int row = 0; row < sales.length; row++);
    }
    double total= 0;
    for (int col = 0; col < sales[row].length; col++)
    {
        
    total+= sales[row][col];
}
    rowTotals[row] = total;
    
    System.out.println("City with the most sales: Port Elizabeth");
     {
         
     }
    
}
}
