package com.googleguice.CheckOut;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.googleguice.CheckOut.Service.CheckOutService;
import com.googleguice.guice.module.DiscountModule;

public final class App {
    private App() {
    }

    /**
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        
        Injector guice = Guice.createInjector(new DiscountModule());
        CheckOutService service = guice.getInstance(CheckOutService.class);
        
        service.checkout(100);
        
    }
}
