/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abe.fantasypl;

import java.util.Comparator;

/**
 *
 * @author Abraham
 */
 class sortPlayers implements Comparator<Player>
  {
    @Override
    public int compare(Player a, Player b)
    {
        return b.getNetTransfers() - a.getNetTransfers();
    } 
  }
