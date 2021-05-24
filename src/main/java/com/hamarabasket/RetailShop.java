/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hamarabasket;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.Spring;

/**
 *
 * @author gaura
 */
public class RetailShop {
    String MANGOES = "mangoes";
    String INDIAN_WINE ="Indian Wine";
    String MOVIE_TICKET ="Movie Tickets";
    String FOREST_HONEY ="Forest Honey";
    
    static ArrayList <Item> arrayListExceptional = new ArrayList ();
    
    public void initialize() {
        arrayListExceptional.add(new Item(MANGOES, 5, 5));
        arrayListExceptional.add(new Item(INDIAN_WINE, 5, 47));
        arrayListExceptional.add(new Item(MOVIE_TICKET, 7, 4));
        arrayListExceptional.add(new Item(FOREST_HONEY, 0, 4));
        
        
    }
    public void dailyTask(Item item ) {
        if(!item.getName().equals( FOREST_HONEY) ) {
                item.setSellBy( item.getSellBy() - 1);
        }
        
        if(item.getName().equals(MOVIE_TICKET) || item.getName().equals(INDIAN_WINE) || item.getName().equals(FOREST_HONEY) ){         
            if(item.getName().equals(INDIAN_WINE )) {
                int quality = item.getQuality();
                item.setQuality(item, quality + 1);
            } 
            else if(item.getName().equals(MOVIE_TICKET )) {
                int sellByValue = item.getSellBy();
                int quality = item.getQuality();
                
                if(sellByValue > 0 ) { // then only value increases
                    if(sellByValue < 10 && sellByValue > 5) {
                        item.setQuality( item, quality + 2);                        
                    } 
                    else if (sellByValue <= 5) {
                        item.setQuality( item, quality + 3); 
                    }                       
                }
            }
            else if(item.getName().equals(FOREST_HONEY )) {
                
            }
            else {
             System.out.print("Nothing ");
            }
        }    
        else {
               int quality = item.getQuality();
                item.setQuality(item, quality - 1);            
        }
//        System.out.println(item.toString()); 
    }
    
    public static void main(String args[]) {
        
        RetailShop retailShop = new RetailShop();
        retailShop.initialize();
//        Item item = new Item ();

         Timer timer = new Timer();
        long delay = 5 * 1000 ;
        long intervalPeriod = delay;
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                Iterator<Item> itemListIterator = arrayListExceptional.iterator();
                
                while(itemListIterator.hasNext()) {
                    
                    Item currentItem = itemListIterator.next();
                       retailShop.dailyTask(currentItem );   
                    System.out.println(currentItem.toString()); 
//                      System.out.println(arrayListExceptional.toString());  
                      
                }
                System.out.println("Timer clicked");
                System.out.println("*********************");
                
//                     Iterator 
//                     decrease sell by value 
            }
        }, delay, intervalPeriod);

     
    }
}
