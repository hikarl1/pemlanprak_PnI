/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktic.geometry.shapes;
import praktic.geometry.bases.CircularShape;
import praktic.geometry.interfaces.ThreeDimensional;
import praktic.geometry.interfaces.Weightable;
/**
 *
 * @author Aurel
 */
public class Sphere extends CircularShape implements ThreeDimensional,Weightable{
    private double mass;//simpan nilai massa
    
    public Sphere(){}//constructor default
    
    public Sphere(double radius, double mass){
        setName("Sphere");//menetapkan nama menjadi "Sphere"
        setRadius(radius);//menetapkan nilai radius
        this.mass = mass;//menetapkan nilai massa
    }
    
    //method hitung luas permukaan bola
    @Override
    public double getSurfaceArea(){
        return 4 * ((double)PI_NUMERATOR/PI_DENOMINATOR) * Math.pow(getRadius(), 2);
    }
    
    //method hitung volume bola
    @Override
    public double getVolume(){
        return 4.0/3 * ((double)PI_NUMERATOR/PI_DENOMINATOR) * Math.pow(getRadius(), 3);
    }
    
    //method hitung berat bola
    @Override
    public double getWeight(){
        return mass * G;
    }
    
    //cetak info terkait bola (nama, luas permukaan, volume, berat)
    @Override
    public void printInfo(){
        System.out.printf("%-16s: %s%n%-16s: %s%n%-16s: %s%n%-16s: %s%n",
                "Name", getName(),
                "Surface Area", getSurfaceArea(),
                "Volume", getVolume(),
                "Weight", getWeight());
    }
}
