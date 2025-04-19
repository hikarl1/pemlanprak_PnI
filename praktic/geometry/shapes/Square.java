/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktic.geometry.shapes;
import praktic.geometry.bases.Shape;
import praktic.geometry.interfaces.TwoDimensional;
/**
 *
 * @author Aurel
 */
public class Square extends Shape implements TwoDimensional{
    //field
    private double side;// simpan nilai sisi
    
    public Square(){}//constructor default
    
    public Square(double side){
        setName("Square");//set nama menjadi "Square"
        this.side = side;//menetapkan nilai sisi
    }
    
    //method hitung luas 
    @Override
    public double getArea(){
        return Math.pow(side, 2);
    }
    
    //method hitung keliling persegi
    @Override
    public double getPerimeter(){
        return side * 4;
    }
    
    //cetak info Square (nama, luas, keliling)
    @Override
    public void printInfo(){
        System.out.printf("%-16s: %s%n%-16s: %s%n%-16s: %s%n",
                "Name", getName(),
                "Area", getArea(),
                "Perimeter", getPerimeter());
    }
}
