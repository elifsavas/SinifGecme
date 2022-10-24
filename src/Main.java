
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fiz, trk, kim, mzk;
        double ort;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz:");
        mat = input.nextInt();
        if (mat > 100) {
            System.out.println("Hatalı Giriş Yaptınız!");
        }

        System.out.print("Fizik Notunuz:");
        fiz = input.nextInt();
        if (fiz > 100) {
            System.out.println("Hatalı Giriş Yaptınız!");
        }

        System.out.print("Türkçe Notunuz:");
        trk = input.nextInt();
        if (trk > 100) {
            System.out.println("Hatalı Giriş Yaptınız!");
        }

        System.out.print("Kimya Notunuz:");
        kim = input.nextInt();
        if (kim > 100) {
            System.out.println("Hatalı Giriş Yaptınız!");
        }

        System.out.print("Müzik Notunuz:");
        mzk = input.nextInt();
        if (mzk > 100) {
            System.out.println("Hatalı Giriş Yaptınız!");
        }

        if (mat > 100) {
            ort = (fiz + trk + kim + mzk) / 4;
        } else if (fiz > 100) {
            ort = (mat + trk + kim + mzk) / 4;
        } else if (trk > 100) {
            ort = (mat + fiz + kim + mzk) / 4;
        } else if (kim > 100) {
            ort = (mat + fiz + trk + mzk) / 4;
        } else if (mzk > 100) {
            ort = (mat + fiz + trk + kim) / 4;
        } else {
            ort = (mat + fiz + trk + kim + mzk) / 5;
        }


        if (ort > 55) {
            System.out.println("Tebrikler, Sınıfı Geçtiniz!");
        } else {
            System.out.println("Maalesef, sınıfta kaldınız!");
        }

        System.out.println("Ortalamanız:" + ort);
    }
}
