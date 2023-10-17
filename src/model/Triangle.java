/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import Repository.IShapeRepository;
import view.Validation;

/**
 *
 * @author This PC
 */
public class Triangle implements IShapeRepository{
    private double a, b, c;
    
    
    public Triangle() {       
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(double canhA) {
        if (canhA < 0) {
            a = 0;
        } else {
            a = canhA;
        }
    }

    public void setB(double canhB) {
        if (canhB < 0) {
            b = 0;
        } else {
            b = canhB;
        }
    }

    public void setC(double canhC) {
        if (canhC < 0) {
            c = 0;
        } else {
            c = canhC;
        }
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    @Override
    public double getPerimeter() {
        if (a + b > c && a + c > b && b + c > a) {
            double chuVi = a + b + c;
            return chuVi;
        } else {
            return 0;
        }
    }

    @Override
    public double getArea() {
        if (a + b > c && a + c > b && b + c > a) {
            double p = (a + b + c) / 2;
            double s = (Math.sqrt(p * (p - a) * (p - b) * (p - c)));
            return s;
        } else {
            return 0;
        }
    }

    @Override
    public void printResult(int type) {
    } 
    
}
