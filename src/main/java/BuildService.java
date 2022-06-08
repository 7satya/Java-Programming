import Implementation.Abbreviation;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class BuildService {
    public static void main(String[] args) throws NoSuchMethodException {

//        Abbreviation color = Abbreviation.COLOR;

        for(Abbreviation abb : Abbreviation.values()) {
            System.out.print(abb.name());
            System.out.println(" : " +abb.getValue());
        }

        Class c = null;
        try {
            c = Class.forName("Implementation.Factorialmpl");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        Object Ojb = null;
        try {
            Ojb = c.newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        Method method = c.getDeclaredMethod("getFactorial", int.class);
        method.setAccessible(true);
        try {
            System.out.println(method.invoke(Ojb, 5));
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }


        System.out.println("Methods :");
        Method[] method1 = c.getDeclaredMethods();
        for (Method m : method1) {
            m.setAccessible(true);
            System.out.println(m);
        }

    }
}
