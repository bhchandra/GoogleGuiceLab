/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.googleguice.guice.inject;

import com.google.inject.Provider;
import com.googleguice.CheckOut.Discount.Discountable;
import com.googleguice.CheckOut.Discount.EarlyDiscount;
import com.googleguice.CheckOut.Discount.NightDiscount;
import com.googleguice.CheckOut.freeProvider.NoDiscount;
import java.time.LocalTime;
import java.util.function.Predicate;

/**
 *
 * @author MITRA
 */
public class DiscountProvider implements Provider<Discountable>{

    
    Predicate<Integer> isEarlyMorning = hour -> (hour >= 5 && hour <= 9);
    Predicate<Integer> isLateNight = hour -> (hour >= 0 && hour <= 4);
    
    @Override
    public Discountable get() {
        
        int hour = LocalTime.now().getHour();
        
        if (isEarlyMorning.test(hour)){
            return new EarlyDiscount();
        }
        else if (isLateNight.test(hour)) {
            return new NightDiscount();
        }
        
        return new NoDiscount();
    }
    
    
    
}
