package praktikum;

import java.util.Scanner;
import java.util.ArrayList;

public class mesin {

    public static void main(String[] args) {
        try {
            ArrayList<String> jenis = new ArrayList<String>();
            ArrayList<String> asal = new ArrayList<String>();
            ArrayList<String> toping = new ArrayList<String>();

            Transaksi arabic = new Transaksi();
            arabic.setJenis("Arabic");
            arabic.setAsal("Timur Tengah");
            jenis.add(arabic.getJenis());
            asal.add(arabic.getAsal());

            Transaksi robusta = new Transaksi();
            robusta.setJenis("Robusta");
            robusta.setAsal("Eropa");
            jenis.add(robusta.getJenis());
            asal.add(robusta.getAsal());

            Transaksi flores = new Transaksi();
            flores.setJenis("Flores");
            flores.setAsal("Asia");
            jenis.add(flores.getJenis());
            asal.add(flores.getAsal());

            toping top = new toping();
            top.setToping("Milk");
            toping.add(top.getToping());
            top.setToping("Boba");
            toping.add(top.getToping());

            for (int a = 0; a < jenis.size(); a++) {
                int b = a + 1;

                System.out.println("Menu kopi : " + b + " " + jenis.get(i) + " berasal " + asal.get(i));
            }

            for (int i = 0; i < toping.size(); i++) {
                int j = i + 1;
                System.out.println("Pilihan toping : " + j + " " + toping.get(i));
            }

            Scanner dam = new Scanner(System.in);
            System.out.print("Masukkan pilihan kopi anda :");
            int damJenis = dam.nextInt() - 1;
            System.out.print("Masukkan pilihan toping anda :");
            int damtoping = dam.nextInt() - 1;

            System.out.println("Pesanan anda adalah kopi " + jenis.get(damJenis) + " yang berasal dari " + asal.get(damJenis) + " menggunakan toping " + toping.get(damtoping));
        } catch (Exception e) {

        }
    }

}
