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
public class Rectangle implements IShapeRepository{
    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    
    public void setLength(double dai) {
        if (dai < 0) {
            length = 0;
        } else {
            length = dai;
        }
    }

    public void setWidth(double rong) {
        if (rong < 0) {
            width = 0;
        } else {
            width = rong;
        }
    }
   
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double getPerimeter() {
        return (length+width)*2;
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public void printResult(int type) {
    }
   

   
}
