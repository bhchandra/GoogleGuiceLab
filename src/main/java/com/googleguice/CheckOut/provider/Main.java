/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.googleguice.CheckOut.provider;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.googleguice.guice.module.DiscountModule;

/**
 *
 * @author MITRA
 */
public class Main {
    
    
    public static void main(String[] args) {
        
        Injector guice = Guice.createInjector(new DiscountModule());
        CheckoutService service = guice.getInstance(CheckoutService.class);
        service.checkOut(250.0);
        
    }   
        

}
