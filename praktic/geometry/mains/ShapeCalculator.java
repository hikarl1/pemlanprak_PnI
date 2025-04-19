/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktic.geometry.mains;

import praktic.geometry.bases.*;
import praktic.geometry.interfaces.*;
import praktic.geometry.shapes.*;

import java.util.Scanner;
/**
 *
 * @author Aurelia Callysta Mamahit - 245150700111024
 *                                                       ___   ___        
    // | |     //   / / //   ) )  //   / /  / /          / /    // | | 
   //__| |    //   / / //___/ /  //____    / /          / /    //__| | 
  / ___  |   //   / / / ___ (   / ____    / /          / /    / ___  | 
 //    | |  //   / / //   | |  //        / /          / /    //    | | 
//     | | ((___/ / //    | | //____/ / / /____/ / __/ /___ //     | | 
 */
public class ShapeCalculator {
    public static void main(String[] args){
        //scanner
        Scanner main = new Scanner(System.in);
        
        //pewarna tulisan 
        String HIJAU = "\u001B[32m";
        String RESET = "\u001B[0m";
        
        //format input
        String garis = HIJAU+"======================================"+RESET;
        String radius = String.format("%-16s%-2s", "Enter radius", ":");
        String side = String.format("%-16s%-2s", "Enter side", ":");
        String edge = String.format("%-16s%-2s", "Enter edge", ":");
        String mass = String.format("%-16s%-2s", "Enter mass", ":");
        
        //format output utk Volume dan berat Cube and Sphere
        String kub = String.format("%-16s%-2s", "Cube's volume", ":");
        String sph = String.format("%-16s%-2s", "Sphere's volume", ":");
        String wei = String.format("%-16s%-2s", "Weight", ":");
        
        //Menampilkan header program
        System.out.println(garis);
        System.out.println("Shape Calculator");
        System.out.println("AURELIA CALLYSTA MAMAHIT");
        System.out.println("245150700111024");
        System.out.println(garis);
        
        //CIRCLE
        System.out.println("2D Circle");
        System.out.println(garis);
        System.out.print(radius);//menampilkan format input radius lingkaran
        double rc = main.nextDouble();//input radius lingkaran
        CircularShape circle = new Circle(rc);//membuat objek Circle
        System.out.println(garis);
        circle.printInfo();//menampilkan info lingkaran
        System.out.println(garis);
        
        //SQUARE
        System.out.println("2D Square");
        System.out.println(garis);
        System.out.print(side);//menampilkan format input sisi
        double s = main.nextDouble();//input sisi persegi
        Shape square = new Square(s);//membuat objek Square
        System.out.println(garis);
        square.printInfo();//cetak info persegi
        System.out.println(garis);
        
        //CUBE
        System.out.println("3D Weightable Cube");
        System.out.println(garis);
        System.out.print(edge);//menampilkan format input rusuk
        double e = main.nextDouble();//input nilai rusuk kubus
        System.out.print(mass);
        double m = main.nextDouble();//input nilai massa kubus
        Shape cube = new Cube(e, m);//membuat objek Cube
        System.out.println(garis);
        cube.printInfo();//cetak info kubus
        System.out.println(garis);
        
        //SPHERE
        System.out.println("3D Weightable Sphere");
        System.out.println(garis);
        System.out.print(radius);//menampilkan format input radius untuk bola
        double rs = main.nextDouble();//input jari-jari bola
        System.out.print(mass);
        double ms = main.nextDouble();//input massa bola
        CircularShape sphere = new Sphere(rs, ms);//membuat objek Sphere
        System.out.println(garis);
        sphere.printInfo();// menampilkan info bola
        System.out.println(garis);
        
        //Cube and Sphere Volume & Weight
        System.out.println("Volume of Cube and Sphere");
        System.out.println("POLYMORPHISM: INTERFACE");
        System.out.println(garis);
        System.out.print(edge);//menampilkan format input rusuk kubus
        double ej = main.nextDouble();//input rusuk kubus
        System.out.print(radius);//menampilkan format input radius bola
        double rad = main.nextDouble();//input radius bola
        System.out.print(mass);//menampilkan format input massa 
        double mes = main.nextDouble();//input massa untuk kubus dan bola
        System.out.println(garis);
        
        //objek untuk hitung volume kubus dan bola menggunakan interface ThreeDimensional
        ThreeDimensional cub = new Cube(ej, mes);
        ThreeDimensional spher = new Sphere(rad, mes);
        
        //objek hitung berat menggunakan interface Weightable
        Weightable kubus = new Cube(ej, mes);
        
        // print out hasil Volume dan berat
        System.out.print(kub);
        System.out.println(cub.getVolume());
        System.out.print(sph);
        System.out.println(spher.getVolume());
        System.out.print(wei);
        System.out.println(kubus.getWeight());
        System.out.println(garis);
        
    }
}
