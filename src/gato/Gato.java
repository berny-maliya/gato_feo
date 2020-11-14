/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gato;

import java.util.Scanner;


public class Gato {
    public static boolean ganador(int matriz[][],int turno,boolean gameover,int ronda) {
        for (int i = 0; i < 3; i++) {
         if ((matriz[i][0]==turno)&&(matriz[i][1]==turno)&&(matriz[i][2]==turno)) {
            gameover=true;
             System.out.println("El ganador es el jugador "+turno);
        }   
        }
        
        for (int i = 0; i < 3; i++) {
         if ((matriz[0][i]==turno)&&(matriz[1][i]==turno)&&(matriz[2][i]==turno)) {
            gameover=true;
            System.out.println("El ganador es el jugador "+turno);
        }   
        }
       
             if ((matriz[0][0]==turno)&&(matriz[1][1]==turno)&&(matriz[2][2]==turno)) {
            gameover=true;
            System.out.println("El ganador es el jugador "+turno);
        }
        if ((matriz[0][2]==turno)&&(matriz[1][1]==turno)&&(matriz[2][0]==turno)) {
            gameover=true;
            System.out.println("El ganador es el jugador "+turno);
        }
        
        if (ronda==9) {
            System.out.println("Ya no hay movidas, es un empate...");
            gameover=true;
            
        }
        
        
        
        
        return gameover;
        
        
        
    }
    
    public static void valor(int matriz [][],int turno){
   
    
    int x,y;        
    Scanner leer= new Scanner (System.in);
    System.out.println("ingrese la coordenada X: ");
        x=leer.nextInt();
        System.out.println("ingrese la coordenada Y: ");
        y=leer.nextInt();
        if(matriz[y][x]!=0){  
        while((matriz[y][x]!=0)){
          System.out.println("¡Esa casilla ya esta ocupada!");
           System.out.println("ingrese la coordenada X: ");
        y=leer.nextInt();}
        System.out.println("ingrese la coordenada Y: ");
        x=leer.nextInt();
        }
        matriz[y][x]=turno;
}
    public static void impgato(int matriz[][]){
  // int[][] matriz = new int [3][3];
       // matriz[x][y]=turno;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               // matriz [i][j]=0;
                
                if (j<2) {
                 System.out.print(matriz [i][j]);   
                }else{
                    System.out.println(matriz [i][j]); 
                }

                if (j<2) {
                    System.out.print("|");
               
                }
                if((j==2)&&(i<2)){
                    System.out.println("-----");
                }
            }      
        }

    }
  
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner (System.in);
        System.out.println("inicia el juego del gato versión beta");
        System.out.println("ingrese las cordenadas tomando en cuenta que la esquina superior izquierda es 0,0");
        int turno= 1;
        int x,y;
       int ronda=1;
        boolean gameover = false;
        int[][] matriz = new int [3][3];
        //imprimir el gato
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               // matriz [i][j]=0;
                
                if (j<2) {
                 System.out.print(matriz [i][j]);   
                }else{
                    System.out.println(matriz [i][j]); 
                }

                if (j<2) {
                    System.out.print("|");
               
                }
                if((j==2)&&(i<2)){
                    System.out.println("-----");
                }
            }
            
        }
    
    while(gameover==false){
        valor(matriz,turno);
        impgato(matriz);
       gameover = ganador(matriz,turno,gameover,ronda);
        turno++;
        ronda++;
        if (turno==3) {
            turno=1;    
        }   
    }
    }
}


