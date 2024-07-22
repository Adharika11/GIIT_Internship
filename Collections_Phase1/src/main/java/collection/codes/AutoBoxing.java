package collection.codes;

public class AutoBoxing {
    public static void main(String[] args) {
        float f = 1.16f;
        Float t =f;
        System.out.println("After autoboxing float: "+t);

        boolean b=true;
        Boolean bl=b;
        bl=false;
        System.out.println("After autoboxing boolean: "+bl);

    }


}
