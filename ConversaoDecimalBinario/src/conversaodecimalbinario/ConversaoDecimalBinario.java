/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversaodecimalbinario;

import EstruturaDadosPilha.Pilha;
import java.util.Scanner;

/**
 *
 * @author eliezer
 */
public class ConversaoDecimalBinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        
  
   int bin[]=new int [7];
   int aux;
        System.out.println("Digite o numero a ser convertido");
         int numero = new Scanner(System.in).nextInt();
         
         for(aux = 7;aux>=0; aux--){
             if(numero % 2==0){
                 numero=numero/2;
                 
             }
                 else{
                         bin[aux]=1;
                         numero=numero/2;
                         }  
                 
             
         
    }
         for(aux=0;aux<=7; aux++){
             System.out.println("Resultado" +bin[aux]);
         }
             
         }
    
}
