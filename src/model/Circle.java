/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import Repository.IShapeRepository;

/**
 *
 * @author This PC
 */
public class Circle  implements IShapeRepository{

    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setR(double radius) {
        if (radius < 0) {
            radius = 0;
        } else {
            radius = radius;
        }
    }

    public double getR() {
        return radius;
    }

    @Override
    public double getPerimeter() {
        return radius*2*Math.PI;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public void printResult(int type) {
    }

}

