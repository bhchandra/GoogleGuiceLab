/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.googleguice.CheckOut.IntoProvider;

import com.google.inject.AbstractModule;
import com.googleguice.CheckOut.Discount.Discountable;
import com.google.inject.multibindings.MapBinder;
import com.googleguice.CheckOut.Discount.EarlyDiscount;
import com.googleguice.CheckOut.Discount.NightDiscount;
import com.googleguice.CheckOut.Discount.NoDiscount;
import java.util.Dictionary;
import java.util.Random;

/**
 *
 * @author MITRA
 */
public class DiscountGuiceModule extends AbstractModule {

    @Override
    protected void configure() {

        MapBinder<Integer, Discountable> mapBinder
                = MapBinder.newMapBinder(
                        binder(),
                        Integer.class,
                        Discountable.class);

        mapBinder.addBinding(0).to(EarlyDiscount.class);
        mapBinder.addBinding(1).to(NightDiscount.class);
        mapBinder.addBinding(2).to(NoDiscount.class);

        bind(Random.class).toInstance(new Random());//guice does this automically by instantiating the defualt constructor.

        bind(Discountable.class).toProvider(DiscountableProvider.class);

    }

}
