package edu.ufp.inf.lp2.util_generics;


/**
 * This class may store any object inside. The methods of this class accept or return an Object,
 * so we may pass whatever object, provided that it is not a primitive type.
 *
 * However, there is no way to verify, at compile time, how the class will be used.
 *
 * @author rui
 */
public class BoxObject {

    private Object object;

    public BoxObject(Object object) {
        this.object=object;
    }

    public void set(Object object) { this.object = object; }
    public Object get() { return object; }


    /**
     *
     * @param args
     */
    public static void main(String args[]){
        BoxObject bo1 = new BoxObject("Ola");
        BoxObject bo2 = new BoxObject(new Integer(10));

        //Cast is mandatory...
        String s1 = (String)bo1.get();
        System.out.println("bo1 content="+s1);

        //Class is mandatory here too...
        int i1 = (int)bo2.get();
        System.out.println("bo2 content="+i1);

        //Class cast exception...
        i1 = (int)bo1.get();
        System.out.println("bo1 content="+i1);
    }
}
