/*
    Supplier to generate random password
    Rules:
    Length should be 8 characters
    2,4,6,8 places only digits
    1,3,5,7 places only uppercase alphabet + @#$
 */
package SupplierInterfaceDemo;

import java.util.function.Supplier;

public class SupplierDemo4 {
    public static void main(String[] args) {

        Supplier<String> pwd = () ->{
            String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ#$@";
            Supplier<Integer> d = () -> (int)(Math.random() * 10);
            Supplier<Character> c = () -> symbols.charAt((int)(Math.random() * 29));
            String psw = "";
            for(int i=0; i<8; i++) {
                if(i%2 == 0) {
                    psw += d.get();
                } else {
                    psw += c.get();
                }
            }
            return psw;
        };

        System.out.println("Generated password: " + pwd.get());
        System.out.println("Generated password: " + pwd.get());
        System.out.println("Generated password: " + pwd.get());
        System.out.println("Generated password: " + pwd.get());

    }
}
