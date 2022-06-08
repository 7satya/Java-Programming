package Reflection;

//JVM ---> Main thread ----> class loading ---->
// data, method and everything of that class

import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Method;

public class Reflection {

    public Reflection(){}

    Class reflectClass = PrivateMethodClass.class;
    String className = reflectClass.getName();
}
