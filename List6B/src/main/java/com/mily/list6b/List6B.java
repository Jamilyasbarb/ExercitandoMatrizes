/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mily.list6b;

import java.util.Scanner;


public class List6B {
    public static void main(String[] args) {
        
        Scanner t = new Scanner(System.in);
        
        //declarando vetores AB e matriz C
        int[] mA = new int[7];
        int[] mB = new int[7];
        int[][] mC = new int[7][2];
        
        //inicializando linha e coluna C
        int linhaC = 0;
        int colunaC = 0;
        
        System.out.println("----------DIGITE 7 NUMEROS PARA A----------\n");
        
        //coluna preenchida por A--------------
        for (int i = 0; i < 7; i++) {
            System.out.println("Digite um numero: ");
            mA[i] = t.nextInt();
            
            //colocandp valores A para C
            mC[linhaC][colunaC] = mA[linhaC];
            
            linhaC++;
        }
        //-------------------------------------
        
        //coluna preenchida por B--------------
        colunaC++;
        linhaC = 0;
        
        System.out.println("----------DIGITE 7 NUMEROS PARA B----------\n");
        for (int ib = 0; ib < 7; ib++) {
            System.out.println("Digite um numero: ");
            mB[ib] = t.nextInt();
            
            mC[linhaC][colunaC]= mB[linhaC];
            
            linhaC++;
        }
        //--------------------------------------
        
        colunaC = 0;
        linhaC = 0;
        
        //imprimindo resultado
        System.out.println("----------NUMEROS DIGITADOS----------\n");
        do{
            System.out.printf("%12d", mC[linhaC][colunaC]);
            
            colunaC++;
            
            if(colunaC == 2){
                linhaC++;
                colunaC = 0;
                System.out.println("\n");
            }
        }while(linhaC < 7);
       
    }
}
