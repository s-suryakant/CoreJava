package PrimitiveFuncionalInterfaces;

import java.util.function.IntSupplier;

public class PrimitiveSupplierDemo {
    public static void main(String[] args) {

        IntSupplier s = () -> (int)(Math.random()*10);

        String otp = "";
        for (int i = 0; i < 6; i++) {
            otp += s.getAsInt();
        }

        System.out.println("Generated OTP: " + otp);
    }
}
