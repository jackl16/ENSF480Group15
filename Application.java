//Application.java

//import GUI.*;
//import Models.*;
//import Controllers.*;
//import Views.*;
//import exceptions.*;
//import interfaces.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;


public class Application extends JPanel{



    public static void main(String args[]){
        JFrame frame = new JFrame("Property Rental Management System");
        frame.setSize(800,600);

        frame.setLayout(null);

        Button x= new Button("Testing");

        x.setBounds(50,50,80,30);


        frame.add(x);



        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);      
    }

}