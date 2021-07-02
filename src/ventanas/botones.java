/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

/**
 *
 * @author ricardo-eclipse
 */


import javax.swing.*;

public class botones {
    
    public static void main(String[] args) {
        
        JFrame panel = new JFrame("panel de botones xd"); // clase que crea una ventana 
        
        
        
        //botones inicio
        JButton botonUno = new JButton("Boton uno"); //clase que crea un boton
        
        JButton botonDos = new JButton("Boton dos");
        
        JButton botonTres = new JButton("Boton tres");
        

        JButton botonCuatro = new JButton("Boton cuatro");
        JButton botonCinco = new JButton("Boton cinco");
        JButton botonSeis = new JButton("Boton seis");
        JButton botonSiete = new JButton("Boton siete");
        JButton botonOcho = new JButton("Boton Ocho");
        
        
        //final botones
        
          //medidas botones
        botonUno.setBounds(0,0,1000,50); // se da la ubicacion del boton
                         //width,height,anchoboton,largoboton 
                         
       
         botonDos.setBounds(0,50,200,350);
         botonTres.setBounds(200,50,300,175);
         botonCuatro.setBounds(500,50,300,175);
         botonCinco.setBounds(800,50,200,350);
         botonSeis.setBounds(200,225,300,175);
         botonSiete.setBounds(500,225,300,175);
         botonOcho.setBounds(0,400,1000,50);
        panel.add(botonUno);
        panel.add(botonDos);
        panel.add(botonTres);
        panel.add(botonCuatro);
        panel.add(botonCinco);
        panel.add(botonSeis);
        panel.add(botonSiete);
        panel.add(botonOcho);
        panel.setSize(1000,480); //se define el tamaño que tendrá el panel 
        panel.setLayout(null);
        panel.setVisible(true);
        
        
    }
        
    
    
}
