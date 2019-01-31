package lesson05.functionalInterfaces;

/**
 * @author spasko
 */
@FunctionalInterface
public interface TestInterface<T, V> {
	V doSome(T t);
}
