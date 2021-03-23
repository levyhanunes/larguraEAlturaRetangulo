package Exercicio1.application;


import Exercicio1.entities.Rectangle;

import java.util.Locale; //import locale
import java.util.Scanner; //import scanner

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); //start scanner

        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();

        System.out.printf("Area = %.2f%n", rectangle.Area());
        System.out.printf("Perimeter = %.2f%n", rectangle.Perimeter());
        System.out.printf("Diagonal = %.2f%n", rectangle.Diagonal());

        sc.close(); //close scanner
    }
}
