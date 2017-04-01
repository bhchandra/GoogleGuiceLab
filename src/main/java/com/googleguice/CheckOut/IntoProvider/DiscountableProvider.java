/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.googleguice.CheckOut.IntoProvider;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.googleguice.CheckOut.Discount.Discountable;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author MITRA
 */
public class DiscountableProvider implements Provider<Discountable> {

    private final Random random;
    private final Map<Integer, Discountable> mapBinder;

    @Inject
    public DiscountableProvider(Map<Integer, Discountable> mapBinder, Random random) {
        this.random = random;
        this.mapBinder = mapBinder;
    }

    @Override
    public Discountable get() {
        return mapBinder.get(random.nextInt(mapBinder.size()));

    }

}
