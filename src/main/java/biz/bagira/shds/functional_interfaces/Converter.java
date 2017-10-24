package biz.bagira.shds.functional_interfaces;


@FunctionalInterface
public interface Converter<F,T> {

    T convert(F from);
}
