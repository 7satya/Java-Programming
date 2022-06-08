import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
@Deprecated

public class Reflections {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<?> c;
        try {
            c = Class.forName("DemoTest");

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        Object obj;
        try {
            obj = c.newInstance();

        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        Method method;
        try {
            method = c.getDeclaredMethod("sampleMethod", (Class<?>[]) null);

        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
        method.setAccessible(true);

        try {
            method.invoke(obj, (Object[]) null);

        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }


//        Now it is for Factorial class
        Class<?> newClass = Class.forName("FunctionClass");
        Object getObj = newClass.newInstance();

        Method fun = newClass.getDeclaredMethod("factorial", int.class);

        fun.setAccessible(true);
        System.out.println(fun.invoke(getObj, 5));



//        Functions from different module
        Class<?> bclass = Class.forName("Implementation.Factorialmpl");
        Object bObj = bclass.newInstance();
        Method bmethod = bclass.getDeclaredMethod("getNames", String.class);

        bmethod.setAccessible(true);
        System.out.println(bmethod.invoke(bObj, "satya"));


        Class<?> allClass = Class.forName("Implementation.Factorialmpl");
        Object objects = allClass.newInstance();
        Method[] methods = allClass.getMethods();

        for(Method m : methods) {
            m.setAccessible(true);

        }

//        end main
    }
}

class DemoTest {
    private void sampleMethod() {
        System.out.println("hello");
    }
}
