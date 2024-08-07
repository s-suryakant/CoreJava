/*
    Program to return current system date.
 */
package SupplierInterfaceDemo;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierDemo1 {
    public static void main(String[] args) {

        Supplier<Date> s = () -> new Date();

        System.out.println(s.get());
    }
}
