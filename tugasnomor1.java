package Pertemuan7;
import java.util.Scanner;
public class tugasnomor1 { 
    public static boolean sejajar(double a, double b, double d, double e) {
        return (a * e == b * d);
    }
    public static boolean tegakLurus(double a, double b, double d, double e) {
        return (a * d + b * e == 0);
    }
    public static double jarakSejajar(double a, double b, double c, double f) {
        return Math.abs(c - f) / Math.sqrt(a * a + b * b);
    } 
    public static double sudutAntarGaris(double a, double b, double d, double e) {
        double tanTheta = Math.abs((a * e - b * d) / (a * d + b * e));
        double theta = Math.atan(tanTheta);
        return Math.toDegrees(theta);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan koefisien a, b, dan c untuk garis l_1: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        System.out.print("Masukkan koefisien d, e, dan f untuk garis l_2: ");
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        if (sejajar(a, b, d, e)) {
            double jarak = jarakSejajar(a, b, c, f);
            System.out.println("Garis-garis tersebut sejajar.");
            System.out.printf("Jarak antara kedua garis: %.2f\n", jarak);
        } 
        else if (tegakLurus(a, b, d, e)) {
            System.out.println("Garis-garis tersebut tegak lurus.");
        } 
        else {
            double sudut = sudutAntarGaris(a, b, d, e);
            System.out.println("Garis-garis tersebut berpotongan.");
            System.out.printf("Sudut antara kedua garis: %.2f derajat\n", sudut);
        }
        input.close();
    }
}
