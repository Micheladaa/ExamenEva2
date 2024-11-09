/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg24550253_eva2examen;

import java.util.Scanner;

/**
 *
 * @author lamam
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner (System.in);
        
        int juego,cam;
        
        while(true){
            System.out.println("Elige una opcion: ");
            System.out.println("1.Piedra ");
            System.out.println("2.Papel");
            System.out.println("3.Tijera");
            System.out.println("4.Ninguna");
            juego = captu.nextInt();
            
            if(juego==4){
                System.out.println("Decidiste no jugar");
                break;
            }
             int usuario = juego - 1;//La computadora daba valores entre 0 y 3

            
            cam = (int) (Math.random() * 3); 

            
            System.out.println("Elegiste: " + juego);
            System.out.println("La computadora eligió: " + cam);

            
            if (usuario == cam) {
                System.out.println("EMPATE");
            } else if ((usuario == 0 && cam == 2) || (usuario == 1 && cam == 0) ||(usuario == 2 && cam == 1)) { 
                System.out.println("GANASTE");
            } else {
                System.out.println("PERDISTE");
        }
      
            
        }
    }
    
}
