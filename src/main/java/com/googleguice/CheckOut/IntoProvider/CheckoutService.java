/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.googleguice.CheckOut.IntoProvider;

import com.google.inject.Inject;
import com.googleguice.CheckOut.Discount.Discountable;

/**
 *
 * @author MITRA
 */
public class CheckoutService {
    
    private final Discountable discountable;
    
    
    @Inject
    public CheckoutService(Discountable discountable){
        this.discountable = discountable;
    }
    
    public double checkout(double shoppingCartTotal){
        final double totalAfterDiscount = shoppingCartTotal - (shoppingCartTotal*discountable.getDiscount());
        
        System.out.println("Into Provider: Shopping Cart Initially " + shoppingCartTotal + " with a discount of "
                            + discountable.getDiscount()*100 + " total is " + totalAfterDiscount      
        );
        
        
        
        return totalAfterDiscount;
    }
    
}

