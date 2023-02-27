import java.util.Scanner;

public class test {
    public static void main(String[] args) {


        double a = 1.5;
        double b = 3.5;
        double c = 5.9;
        for (int i = 0; i < 5; i++) {
          double dou =  tinhChuVi(a, b, c);
            System.out.println("dou" +dou);
        }

        tinhChuVi(1.5, 2.5, 5.6);

    }

    //    public static void tinhChuVi(double a, double b, double c) {
//
//        double chuVi = a + b + c;
//        System.out.println(chuVi);
//
//    }
    public static double tinhChuVi(double a, double b, double c) {

        double chuVi = a + b + c;
        System.out.println("chuvi" +chuVi);
        return chuVi;

    }

}
