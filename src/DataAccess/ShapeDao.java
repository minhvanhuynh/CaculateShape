/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataAccess;

import Repository.IShapeRepository;
import model.Circle;
import model.Rectangle;
import model.Triangle;
import view.Validation;

/**
 *
 * @author This PC
 */
public class ShapeDao {
    
    private static ShapeDao instance= null;
    private Validation validation;
    
    public ShapeDao(){
        validation= new Validation();
    }
    public static ShapeDao Instance(){
        if(instance==null){
            synchronized (ShapeDao.class) {
                if(instance==null){
                    instance= new ShapeDao();
                }                
            }
        }
        return instance;
    }
    
    public void printResult(int type){
        IShapeRepository isr;
        switch (type) {
            case 1:                
                double width= validation.checkInputDouble("Please input width of Rectangle: ");
                double length= validation.checkInputDouble("Please input length of Rectangle: ");
                isr= new Rectangle(length, width);
                System.out.println("----- Rectangle -----");
                System.out.print("Width: "+width);
                System.out.println("");
                System.out.print("Length: "+length);
                System.out.println("");
                System.out.print("Area: "+isr.getArea());
                System.out.println("");
                System.out.print("Perimeter: "+isr.getPerimeter());
                System.out.println("");
                break;
            case 2:
                double radius= validation.checkInputDouble("Please input radius of Circle: ");
                isr= new Circle(radius);
                System.out.println("----- Circle -----");
                System.out.print("Radius: "+radius);
                System.out.println("");
                System.out.print("Area: "+isr.getArea());
                System.out.println("");
                System.out.print("Perimeter: "+isr.getPerimeter());
                System.out.println("");
                break;
            case 3:
                double a= validation.checkInputDouble("Please input side A of Triangle:");
                double b= validation.checkInputDouble("Please input side B of Triangle:");
                double c= validation.checkInputDouble("Please input side C of Triangle:");
                isr= new Triangle(a, b, c);
                System.out.println("----- Triangle");
                System.out.print("Side A: "+a);
                System.out.println("");
                System.out.print("Side B: "+b);
                System.out.println("");
                System.out.print("Side C: "+c);
                System.out.println("");
                System.out.print("Area: "+isr.getArea());
                System.out.println("");
                System.out.print("Perimeter: "+isr.getPerimeter());
                System.out.println("");
                break;               
        }
    }
}
