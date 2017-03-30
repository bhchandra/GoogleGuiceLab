/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.googleguice.CheckOut.freeProvider;

import com.googleguice.CheckOut.Discount.Discountable;

/**
 *
 * @author MITRA
 */
public class NoDiscount implements Discountable{

    @Override
    public double getDiscount() {
        
        return 0.0;

    }
    
}
