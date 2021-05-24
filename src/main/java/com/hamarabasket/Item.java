/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hamarabasket;



/**
 *
 * @author gaura
 */
public class Item {
    private int sellBy;
    private int quality;
    private String name ;

    Item(String name, int sellBy, int quality) {
        this.name = name;
        this.sellBy = sellBy; 
        this.quality = quality;
    }
    
    

    /**
     * @return the sellBy
     */
    public int getSellBy() {
        return sellBy;
    }

    /**
     * @param sellBy the sellBy to set
     */
    public void setSellBy(int sellBy) {
        this.sellBy = sellBy;
    }

    /**
     * @return the quality
     */
    public int getQuality() {
        return quality;
    }

    /**
     * @param quality the quality to set
     */
    public void setQuality(Item item , int quality) {
     //   int quality = item.getQuality() - qualityToDecrease;
        if(quality >= 50) {
            this.quality = 50);
        }
        else if(quality < 0 ) {
            this.quality = 0;
        }
        else {
        this.quality = quality;
        }        
    }
    
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    public void increaseQuality (int value) {
        this.quality = this.quality + value;    
    }
    
    public void decreaseQuality (Item item , int value) {
        
        
        if(item.getSellBy() < 0 ){
            int quality = this.quality - 2; 
            this.setQuality(quality);
        }
        
        this.quality = this.quality - value;
    
    }
    
    public void decreaseSellBy() {
         -- this.sellBy ;
    }
    
    public String toString() {
        return "\n " + this.getName() +" Sell By " + this.sellBy + " Quality " + this.quality + " \n "; 
    }
    
}
