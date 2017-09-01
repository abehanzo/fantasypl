/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abe.fantasypl;

/**
 *
 * @author Abraham
 */
public class Player {
 String firstName;
 String secondName;
 int transferIn;
 int transferOut;
 int netTransfers;

   
  public Player(String firstName, String secondName, int transferIn, int transferOut) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.transferIn = transferIn;
        this.transferOut = transferOut;
        this.netTransfers = transferIn-transferOut;
    }
  public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getTransferIn() {
        return transferIn;
    }

    public int getTransferOut() {
        return transferOut;
    }
     public int getNetTransfers() {
        return netTransfers;
    }
 
}
