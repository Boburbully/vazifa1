package com.company;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//	// write your code her
////        Scanner kubk= new Scanner(System.in);
////
////
////        int a = kubk.nextInt();
////        int b = kubk.nextInt();
////
////        int h = kubk.nextInt();
////
////        int yuza = (a+b+h)/2;
////
////
////        System.out.println(yuza);
//
////
////    Scanner yuza = new Scanner(System.in);
////
////
////        int s = yuza.nextInt();
////        int h = yuza.nextInt();
////
////
////        int   yuza2 =(2*s)/h;
////
////
////    System.out.println(yuza2);
//
////        Scanner shar = new Scanner(System.in);
////
////        int r = shar.nextInt();
////
////        double yuza = Math.PI*r*r;
////        System.out.println(yuza);
//
//
//
////
////        Scanner  vaqt= new Scanner(System.in);
////
////        int s = vaqt.nextInt();
////        int v = vaqt.nextInt();
////
////        double yuza = s/v;
////        System.out.println(yuza);
//
//
//    Scanner konus = new Scanner(System.in);
//
//    int h = konus.nextInt();
//    int  r = konus.nextInt();
//
//
//    double hajm = (Math.PI*r*r*h*1/3);
//    System.out.println(hajm);
//
//
//
//
//        Scanner kuch = new Scanner(System.in);
//
//        int h = kuch.nextInt();
//        int  r = kuch.nextInt();
//
//
//        double hajm = (Math.PI*r*r*h*1/3);
//        System.out.println(hajm);
//

//
//        Scanner ogirlik = new Scanner(System.in);
//
//        int m = ogirlik.nextInt();
//
//
//
//
//            double j = m*9.8;
//
//        System.out.println(j);

//
//        Scanner kuch = new Scanner(System.in);
//
//        int m = kuch.nextInt();
//        int  t = kuch.nextInt();
//
//
//        double hajm = m*t;
//        System.out.println(hajm);





//        Scanner t = new Scanner(System.in);
//
//        int h = t.nextInt();
//        int  r = t.nextInt();
//
//
//        double hajm = h/r;
//        System.out.println(hajm);


    Scanner oy = new Scanner(System.in);
        System.out.println("raqam kiring");
        float  month = (float) oy.nextInt();


        if ( month >= 12 ){
            System.out.println("Soningizni xato kiritingiz! ");
        } else {
            if ( month == 12) {
                System.out.println(" the season is Winter  ");
            } else {
                if (month >= 9  ) {
                    System.out.println("the season is Autumn ");
                } else {
                    if (month >= 6) {
                        System.out.println("the season is Summer");
                    } else {
                        if (month >=3) {
                            System.out.println("the season is Spring");
                        } else {
                            if (month >=1) {
                                System.out.println("the season is Winter ");
                            } else {
                            System.out.println(" ERROR ");
                        }
                    }
                }
            }
        }



        }

    }
}
