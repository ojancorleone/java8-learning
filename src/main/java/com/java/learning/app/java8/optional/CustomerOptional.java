package com.java.learning.app.java8.optional;

import java.util.Optional;

public class CustomerOptional {

    public void nullCheck(Customer customer){
        /*
         * Java 7 Implementation
         *   String name = customer.getName();
         *         if(name == null){
         *             name = "";
         *         }
        * */
        /**
         * Java 8 Implementation
         * */
        String name = Optional.ofNullable(customer.getName())
                .orElse("");

    }

    public void ifLogic(){

    }
}
