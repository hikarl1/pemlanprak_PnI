/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktic.geometry.shapes;
import praktic.geometry.bases.CircularShape;
import praktic.geometry.interfaces.TwoDimensional;

/**
 *
 * @author Aurel
 */
public class Circle extends CircularShape implements TwoDimensional{
    public Circle(){}//constructor default
    
    public Circle(double radius){
        setName("Circle");//menetapkan nama bentuk menjadi "Circle"
        setRadius(radius);//menetapkan radius lingkaran
    }
    
    //menghitung luas lingkaran
    @Override
    public double getArea(){
        return ((double)PI_NUMERATOR/PI_DENOMINATOR) * Math.pow(getRadius(), 2);
    }
    
    //menghitung keliling lingkaran
    @Override
    public double getPerimeter(){
        return ((double)PI_NUMERATOR/PI_DENOMINATOR) * 2 * getRadius();
    }
    
    //mencetak informasi lingkaran (nama, luas, keliling)
    @Override
    public void printInfo(){
        System.out.printf("%-16s: %s%n%-16s: %s%n%-16s: %s%n",
                "Name", getName(),
                "Area", getArea(),
                "Perimeter", getPerimeter());
    }
}
