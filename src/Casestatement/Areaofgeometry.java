package Casestatement;

import java.util.Scanner;


public class Areaofgeometry {
    public void triangle(double a,double b){
        double s =(a*b)/2;

        System.out.println("Area of triangle : "+s);

    }/*public void herionformalua(double s1,double s2,double s3){
        double S=(s1+s2+s3)/2;
        double area= (double) Math.sqrt(S*(S-1)*(S-2)*(S-3));
        System.out.println("The area of triangle :"+area);
    }*/
    public void Fahrenheittocelsius(double f){
        double c;
        c=((5*(f-32))/9.0);
        System.out.println("print temp  Fahrenheit :"+c);
    }
    public void celsiustoFahrenheit(double c){
        double f=((c*9)/5)+32;

        System.out.println("Print temp Celsius:"+f);
    }
public static void main(String[] args) {
        Areaofgeometry obj=new Areaofgeometry();
        obj.triangle(20.0,110.5);
       // obj.herionformalua(7,3,9);
        obj.Fahrenheittocelsius(98.6);
        obj.celsiustoFahrenheit(40);
    }

}
