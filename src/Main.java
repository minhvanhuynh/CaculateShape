
import controller.ManageShape;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author This PC
 */
public class Main {
    public static void main(String[] args) {
        String title= "=====Calculator Shape Program=====";
        String[] s= new String[] {"Calculator Rectangle", "Calculator Circle", "Calculator Triangle", "Exit"};
        new ManageShape(title, s).run();
    }
}
