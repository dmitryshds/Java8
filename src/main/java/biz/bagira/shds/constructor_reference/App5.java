package biz.bagira.shds.constructor_reference;

public class App5 {
    public static void main(String[] args) {
        UserFactory<User> factory = User::new;

        User user = factory.create("Vasja", "Pupkin");
        System.out.println(user);   //User{firstName='Vasja', lastName='Pupkin'}
    }
}
