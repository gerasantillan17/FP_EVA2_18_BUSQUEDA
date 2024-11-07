/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_18_busqueda;

import java.util.Scanner;

/**
 *
 * @author gerar
 */
public class EVA2_18_BUSQUEDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[]datos={10, 50, 85, 73, 11, 25, 43, 5, 0, 6};
       int valor, posi=-1;
       Scanner captu = new Scanner(System.in);
       valor = captu.nextInt();
       System.out.println("Valor a buscar:");
       valor = captu.nextInt();
       for(int i=0; i<datos.length; i++){
           if(valor == datos[i]){
               posi=i;
               break;
           }
       }
       if(posi ==-1)
           System.out.println("VALOR NO ENCONTRADO");
    else
           System.out.println("VALOR ENCONTRADO");
    }
    }    

