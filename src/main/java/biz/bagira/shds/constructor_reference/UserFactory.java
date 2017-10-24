package biz.bagira.shds.constructor_reference;

/**
 * Created by Dmitriy on 23.10.2017.
 */
public interface UserFactory<P extends User> {
    P create(String firstName, String lastName);
}
