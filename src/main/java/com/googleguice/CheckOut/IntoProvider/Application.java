/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.googleguice.CheckOut.IntoProvider;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

/**
 *
 * @author MITRA
 */
public class Application {
    
    private final CheckoutService checkoutService;
    
    @Inject
    public Application(CheckoutService checkoutService){
        this.checkoutService = checkoutService;
    }
    
    void start(){
        checkoutService.checkout(100D);
    }
    
    public static void main(String[] args) {
        Injector guiceInjector = Guice.createInjector(new DiscountGuiceModule());
        Application app = guiceInjector.getInstance(Application.class);
        app.start();
    }
}
