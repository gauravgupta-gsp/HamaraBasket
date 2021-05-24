/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hamarabasket;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gaura
 */
public class RetailShopTest {
    
    public RetailShopTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
//    @BeforeAll
//    public static void setUpClass() {
//    }
//    
//    @AfterAll
//    public static void tearDownClass() {
//    }
//    
//    @BeforeEach
//    public void setUp() {
//    }
//    
//    @AfterEach
//    public void tearDown() {
//    }

    public void testMangoMethod() {
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");

        String MANGOES = "mangoes";
        Item mango = new Item(MANGOES, 5, 5);     
        RetailShop retailShop = new RetailShop();
        retailShop.dailyTask(mango);
        assertEquals(mango.getSellBy(), 4);        
        assertEquals(mango.getQuality(), 4);              
        
        
    }
    
    public void testIndianWine() {
        String INDIAN_WINE ="Indian Wine";
        Item indianWine = new Item(INDIAN_WINE, 5, 47);
        RetailShop retailShop = new RetailShop();
        retailShop.dailyTask(indianWine);
        assertEquals(indianWine.getSellBy(), 4);        
        assertEquals(indianWine.getQuality(), 48);              
        
    }
    public void testMovieTicket() {
        String MOVIE_TICKET ="Movie Tickets";
        Item movieTicket = new Item(MOVIE_TICKET, 7, 4);
        RetailShop retailShop = new RetailShop();
        retailShop.dailyTask(movieTicket);
        assertEquals(movieTicket.getSellBy(), 6);        
        assertEquals(movieTicket.getQuality(), 6);              
        
    }
    public void testMovieTicketLessThan5Days() {
        String MOVIE_TICKET ="Movie Tickets";
        Item movieTicket = new Item(MOVIE_TICKET, 5, 4);
        RetailShop retailShop = new RetailShop();
        retailShop.dailyTask(movieTicket);
        assertEquals(movieTicket.getSellBy(), 4);        
        assertEquals(movieTicket.getQuality(), 7);              
        
    }
    public void testForestHoney() {
        String FOREST_HONEY ="Forest Honey";
        Item forestHoney = new Item(FOREST_HONEY, 0, 4);        
        RetailShop retailShop = new RetailShop();
        retailShop.dailyTask(forestHoney);
        assertEquals(forestHoney.getSellBy(), 0);        
        assertEquals(forestHoney.getQuality(), 4);              
        
    }
    
    @org.junit.jupiter.api.Test
    public void testdailyTask(Item item ) {
        Item mango = new Item("MANGOES", 5, 5);
        RetailShop retailShop = new RetailShop();
        retailShop.dailyTask(mango);
        assertEquals(mango.getSellBy(), 4);        
    }
    
    
    
}
