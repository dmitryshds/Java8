package biz.bagira.shds.suppliers;


import biz.bagira.shds.constructor_reference.User;

import java.util.function.Supplier;

public class App10 {
    public static void main(String[] args) {
        Supplier<User> supplier = User::new;

        User user = supplier.get();
        System.out.println(user);    //User{firstName='null', lastName='null'}

    }
}
