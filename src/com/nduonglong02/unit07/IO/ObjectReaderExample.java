package com.nduonglong02.unit07.IO;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ObjectReaderExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ObjectInputStream input = null;
        File folder = new File("D:/JavaCoreSitenIo");

        input = new ObjectInputStream(
                new FileInputStream(new File(folder, "my_object")));

        Object obj = input.readObject();
        Method method = obj.getClass().getMethod("run", new Class[0]);
        method.invoke(obj, new Object[0]);
        // close input
    }
}
