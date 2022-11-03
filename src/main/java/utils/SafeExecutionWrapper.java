package utils;

import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

public class SafeExecutionWrapper<T> {


    private Supplier<T> expression;
    private Map<Class, Function<Exception, T>> handlers;
    private Runnable finallyExpression;


}
