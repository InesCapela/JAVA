package edu.ufp.inf.lp2.util_generics;

import java.util.ArrayList;

/**
 * @param <T> Use Bounded Type Parameter to restrict type parameter.
 * @author rjm
 */
public class OrderedArraylistExtensionGenerics<T extends Comparable<T>> extends ArrayList<T> {

    public OrderedArraylistExtensionGenerics(int dim) {
        super(dim);
    }

    public OrderedArraylistExtensionGenerics() {
        super();
    }

    //public void add(ComparableClone<T> c) {
    @Override
    public boolean add(T c) {
        if (this.isEmpty()) {
            super.add((T) c);
            return true;
        }
        int s = this.size();
        for (int i = 0; i < s; i++) {
            Comparable<T> ci = (Comparable<T>) this.get(i);
            if (ci.compareTo((T) c) > 0) {
                super.add(i, (T) c);
                return true;
            } else if (ci.compareTo((T) c) == 0) {
                return false;
            }
        }
        return super.add((T) c);
    }

    //public Object remove(ComparableClone<T> c) {
    //public Comparable<T> remove(Comparable<T> c) {
    public T remove(T c) {
        int s = this.size();
        for (int i = 0; i < s; i++) {
            //Comparable ci = this.get(i);
            T ci = this.get(i);
            if (ci.compareTo(c) == 0) {
                return (T) this.remove(i);
            }
        }
        return null;
    }

    //public Object remove(int i) {
    @Override
    public T remove(int i) {
        return (i >= 0 && i < this.size() ? super.remove(i) : null);
    }

    //public Object get(ComparableClone c)
    //public Comparable<T> get(Comparable<T> c) {
    public T get(T c) {
        int s = this.size();
        for (int i = 0; i < s; i++) {
            //Comparable ci = (Comparable) this.get(i);
            T ci = this.get(i);
            if (ci.compareTo(c) == 0) {
                //return (Comparable<T>) this.get(i);
                return super.get(i);
            }
        }
        return null;
    }

    public void list() {
        System.out.println(super.toString());
        /*
        for (T o : this) {
        System.out.print(o.toString());
        }*/
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        //Un-ordered array
        int[] ua = new int[]{2016, 2017, 2018, 2014, 2015};
        System.out.print("au[] = [");
        for (int i = 0; i < ua.length; i++) {
            if (i < (ua.length - 1)) {
                System.out.print(ua[i] + ", ");
            } else {
                System.out.print(ua[i]);
            }
        }
        System.out.println("]");

        //Ordered array
        OrderedArraylistExtensionGenerics<Integer> oaleg1 = new OrderedArraylistExtensionGenerics<>();
        for (int i : ua) {
            oaleg1.add(i);
        }
        oaleg1.list();

        OrderedArraylistExtensionGenerics<String> oaleg2 = new OrderedArraylistExtensionGenerics<>();
        oaleg2.add("primeira");
        oaleg2.add("ultima");
        oaleg2.add("alo");
        oaleg2.list();

    }
}
