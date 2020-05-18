package edu.ufp.inf.lp2.util_generics;

/**
 * A generic type is a generic class/interface that is parameterized over types.
 * <p>
 * On a generic version of the BoxObject class, we could use one or more Ts (types):
 * BoxGeneric<T1, T2, T3>
 * <p>
 * A type variable can be any non-primitive type: any class type, any interface
 * type, any array type, another type variable.
 * <p>
 * The most commonly used type parameter names are:
 * E - Element (used extensively by the Java Collections Framework),
 * K - Key,
 * N - Number,
 * T - Type,
 * V - Value,
 * S, U, V etc. - 2nd, 3rd, 4th types
 *
 * @param <T> the generic type parameter of the value being boxed.
 * @author rui
 */
public class BoxGeneric<T> {

    // T stands for generic "Type"
    private T t;

    public BoxGeneric(T t) {
        this.t = t;
    }

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    /**
     * Declare a bounded type parameter (restrict types that can be used as
     * type arguments through a parameterized type).
     * <p>
     * The extends is used in a general sense to mean  "extends" (as in classes)
     * or "implements" (as in interfaces).
     *
     * @param <U>
     * @param u
     */
    public <U extends Number> void inspect(U u) {
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }


    /**
     * @param args
     */
    public static void main(String[] args) {
        //Now BoxGeneric<T> is a parameterized type.
        //Being <Integer> the type argument (inside the diamond operator)
        BoxGeneric<Integer> integerBox = new BoxGeneric<Integer>(10);

        //Now we have type checking... compile an error
        //BoxGeneric<Float> floatBox = new BoxGeneric<Float>("OLA");
        BoxGeneric<Float> floatBox = new BoxGeneric<>(10.0f);

        System.out.println("BoxGenericObject->main(): integerBox = " + integerBox.get());
        System.out.println("BoxGenericObject->main(): floatBox = " + floatBox.get());

        integerBox.set(18);
        System.out.println("BoxGenericObject->main(): integerBox = " + integerBox.get());

        //Again type checking... error when using a different type declared in the generic
        //floatBox.set(18);
        System.out.println("BoxGenericObject->main(): floatBox = " + floatBox.get());

        //Print some info about the classes of the objects
        integerBox.inspect(18);
        floatBox.inspect(10.0f);

        //The generic must be a sub-type of Number... error if not!
        //integerBox.inspect("some text"); //Compile error
    }
}
