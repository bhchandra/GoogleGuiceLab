/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.googleguice.CheckOut.Discount;

/**
 *
 * @author MITRA
 */
public class EarlyDiscount implements Discountable{

    @Override
    public double getDiscount() {
        return 0.25;
    }
    
}
