/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktic.geometry.bases;

/**
 *
 * @author Aurel
 */
public abstract class CircularShape extends Shape{
    //field
    private double radius; //simpan radius atau jari-jari
    protected static final int PI_NUMERATOR = 22;//pembilang untuk nilai Pi
    protected static final int PI_DENOMINATOR = 7;//penyebut untuk nilai Pi
    
    //constructor default
    public CircularShape(){}
    
    //untuk menetapkan nilai radius
    public void setRadius(double inputRadius){
        this.radius = inputRadius;
    }
    
    //mengambil dan mengembalikan nilai radius
    public double getRadius(){
        return radius;
    }
}
