/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Repository.IShapeRepository;
import Repository.ShapeRepository;
import view.Menu;

/**
 *
 * @author This PC
 */
public class ManageShape extends Menu<String>{
    
    private IShapeRepository isr= new ShapeRepository();
    
    public ManageShape(String title, String[] s){
        super(title, s);
    }
    
    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                isr.printResult(1);
                break;
            case 2:
                isr.printResult(2);
                break;
            case 3:
                isr.printResult(3);
                break;
            case 4:
                System.exit(0);
                break;
        }
    }
    
}
