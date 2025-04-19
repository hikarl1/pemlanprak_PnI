/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktic.geometry.shapes;
import praktic.geometry.bases.Shape;
import praktic.geometry.interfaces.Weightable;
import praktic.geometry.interfaces.ThreeDimensional;
/**
 *
 * @author Aurel
 */
public class Cube extends Shape implements Weightable,ThreeDimensional{
    //field
    private double edge;//simpan nilai rusuk
    private double mass;//simpan nilai massa
    
    public Cube(){}//constructor default
    
    public Cube(double edge, double mass){
        setName("Cube");//menetapkan nama sebagai "Cube"
        this.edge = edge;//menetapkan nilai edge
        this.mass = mass;//menetapkan nilai mass
    }
    
    //method hitung luas permukaan kubus
    @Override
    public double getSurfaceArea(){
        return 6 * Math.pow(edge, 2);
    }
    
    //method hitung luas kubus
    @Override
    public double getVolume(){
        return Math.pow(edge, 3);
    }
    
    //method hitung berat kubus
    @Override
    public double getWeight(){ 
        return mass * G;
    }
    
    //cetak info terkait kubus (nama, luas permukaan, volume, berat)
    @Override
    public void printInfo(){
        System.out.printf("%-16s: %s%n%-16s: %s%n%-16s: %s%n%-16s: %s%n",
                "Name", getName(),
                "Surface Area", getSurfaceArea(),
                "Volume", getVolume(),
                "Weight", getWeight());
    }
}
