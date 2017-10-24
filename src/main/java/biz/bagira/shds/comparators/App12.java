package biz.bagira.shds.comparators;


import biz.bagira.shds.constructor_reference.User;
import biz.bagira.shds.constructor_reference.UserFactory;

import java.util.Comparator;

public class App12 {

    public static void main(String[] args) {
        Comparator<User> userComparator = (a, b) -> a.getFirstName().compareTo(b.getFirstName());
        UserFactory<User> factory = User::new;

        User user1 = factory.create("Ivan", "Ivanov");
        User user2 = factory.create("Vasilij", "Petrov");
        User user3 = factory.create("Vasilij", "Petrov");
        System.out.println(userComparator.compare(user2, user3));   //0
        System.out.println(userComparator.compare(user1, user2));   //13 < 0
        System.out.println(userComparator.reversed().compare(user1, user2));   //13 > 0

    }


}
