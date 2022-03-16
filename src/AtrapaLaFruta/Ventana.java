package AtrapaLaFruta;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

public class Ventana extends JPanel{
	
	public int ancho=500;
	public int alto=300;
	
	public Ventana(){
		setPreferredSize(new Dimension(ancho,alto));
		setBackground(Color.white);
	}

	public void dibujarEscenario(ArrayList<Elemento> elementos, int WIDTH, int HEIGHT) {     
		  char[][] escenarioTextual = new char[WIDTH][HEIGHT];  
		  for (int i = 0; i < WIDTH; i++) {     
		    for (int j = 0; j < HEIGHT; j++) {           
		      if (j==0) {              
		        escenarioTextual[i][j] = '#';           
		      }else {              
		        escenarioTextual[i][j] = ' ';          
		       }        
		    }     
		  }     
		  for (Elemento elemento: elementos) {      
		      escenarioTextual[elemento.posicionX][elemento.posicionY] = elemento.getSimbolo();         
		  }     
		  for (int y =HEIGHT - 1; y >= 0; y--) {        
		    for (int x = 0; x < WIDTH; x++) {           
		      if (y==0) {              
		        System.out.printf("#");           
		      }else {
		        System.out.printf(Character.toString(escenarioTextual[x][y]));           
		      }        
		    }        
		    System.out.printf("\n");     
		  }  
		}
	
}
