package com.juaracoding;
import java.util.Scanner;
public class Gaji {

        public String gajiBersih(double gaji) {
            Scanner scanner = new Scanner(System.in);

            if (gaji > 700) {
                // Jika gaji di atas 700, maka pengguna harus membayar pajak
                double pajak = 0.1 * gaji; // Misalnya, pajak sebesar 10%
                double gajiBersih = gaji - pajak;
                System.out.println("Anda harus membayar pajak sebesar " + pajak + " dan gaji bersih Anda adalah " + gajiBersih);
                return "Kena Pajak";
            } else {
                // Jika gaji di bawah atau sama dengan 700, pengguna tidak membayar pajak
                System.out.println("Anda tidak harus membayar pajak dan gaji bersih Anda adalah " + gaji);
                return "Kena Pajak";
            }

        }
}
