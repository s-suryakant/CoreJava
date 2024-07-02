/*
    Supplier to generate 6 digit OTP.
 */
package SupplierInterfaceDemo;

import java.util.function.Supplier;

public class SupplierDemo3 {
    public static void main(String[] args) {

        Supplier<String> s = () ->{
            String otp = "";
            for (int i = 0; i < 6; i++) {
                otp += (int)(Math.random()*10);
            }
            return otp;
        };

        System.out.println(s.get());
    }
}
