/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abe.fantasypl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Abraham
 */
public class mainApp {
    public static void main(String Args[]) throws IOException
    {
      
       ArrayList<Player> Players = new ArrayList();
       Players = jsonPull.extractData();  
       Collections.sort(Players, new sortPlayers());
       System.out.println("firstName secondName currentValue selectedByPercent transferIn transferOut netTransfer");
       for(Player P : Players)
       {
       System.out.println(P.firstName +" "+ P.secondName +" "+P.currentValue+" "+ P.selectedByPercent + " " + P.transferIn +" "+ P.transferOut +" "+ "\n");
       }
       
    }
   
      
}
