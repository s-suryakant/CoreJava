/*
    Supplier to return random name.
 */
package SupplierInterfaceDemo;

import java.util.function.Supplier;

public class SupplierDemo2 {
    public static void main(String[] args) {

        Supplier<String> s = () ->{
            String[] name = {"Name-1", "Name-2","Name-3","Name-4"};
            int x = (int)(Math.random()*4);
            return name[x];
        };

        System.out.println(s.get());
    }
}
