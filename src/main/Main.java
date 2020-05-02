/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Надюха
 */
//import java.util.Arrays;
public class Main {

    /**this program converts an ordinary matrix into a transposed one. 
     * lines are filled with 0.
     * @param args the command line arguments
     * @return the transposed matrix
     */
    static int a = 4;
	static int b = 3;
	static int arA[][] = new int[a][b];
        
   public static void main(String[] args) {
		//початкова матриця
		for(int i = 0; i< a;i++)
		{
			for(int j = 0; j < b; j++)
			{
				System.out.print(i+" ");
				arA[i][j] = i;
			}
			System.out.println();
		}
		//транспонована матриця
		for(int i = 0; i< arA[0].length;i++)
		{
			for(int j = 0; j < (arA.length); j++)
				System.out.print(arA[j][i]+" ");
			System.out.println();
		}
		
	}
    }

