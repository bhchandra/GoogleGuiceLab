/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.googleguice.CheckOut.freeProvider;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;
import com.googleguice.CheckOut.Discount.Discountable;
import com.googleguice.guice.inject.DiscountModule;

/**
 *
 * @author MITRA
 */


        
    
public class CheckoutService {

    private final Provider<Discountable> discountable;

    @Inject
    public CheckoutService(Provider<Discountable> discountable) {
        this.discountable = discountable;
    }

    public double checkOut(double shoppingTotal) {
        final double discount = discountable.get().getDiscount();
        final double totalAfterDiscount = shoppingTotal - (shoppingTotal * discount);

        System.out.println("Free Provider: Shopping Cart Initially " + shoppingTotal + " with a discount of "
                + discount * 100 + " total is " + totalAfterDiscount
        );

        return totalAfterDiscount;

    }
    
    
}

    