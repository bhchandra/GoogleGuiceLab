/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.googleguice.guice.inject;

import com.google.inject.AbstractModule;
import com.googleguice.CheckOut.Discount.Discountable;
import com.googleguice.CheckOut.Discount.NightDiscount;

/**
 *
 * @author MITRA
 */
public class DiscountModule extends AbstractModule{

    @Override
    protected void configure() {
        bind(Discountable.class).to(NightDiscount.class);
    }
    
}
