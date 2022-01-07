import java.util.Scanner;

public class MarketCalculator {
    public static void main(String[] args) {
        /*
         *
         *  Kullanıcıdan manavdan almış olduğu meyve/sebzelerin kg değerini iste.
         *
         *  Toplam tutarı hesapla.
         *
         *  Armut: 2.14 TL / kg
         *  Elma: 3.67 TL / kg
         *  Domates: 1.11 TL / kg
         *  Muz: 0.95 TL / kg
         *  Patlıcan: 5.00 TL / kg
         *
         * */
        Scanner input = new Scanner(System.in);
        double armut, elma, domates, muz, patlican, toplam;
        System.out.print("Armut (kg): ");
        armut = input.nextDouble();
        System.out.print("Elma (kg): ");
        elma = input.nextDouble();
        System.out.print("Domates (kg): ");
        domates = input.nextDouble();
        System.out.print("Muz (kg): ");
        muz = input.nextDouble();
        System.out.print("Patlıcan (kg): ");
        patlican = input.nextDouble();
        toplam = (armut * 2.14) + (elma * 3.67) + (domates * 1.11) + (muz * 0.95) + (patlican * 5);
        System.out.print("Alışveriş Tutarınız: " + toplam + " TL");
    }
}


