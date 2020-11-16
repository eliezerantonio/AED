/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturadedadosfila;

import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author eliezer
 */
public class Fila extends EstruturaEstatica {

    public Fila() {
    }

    public Fila(int capacidade) {
        super(capacidade);
    }
//metdodo para adicionarthis.
  public void adicionar(T elemento){
      this.adicionar(elemento);
  }
  
  public T verificar(){
      if(this.estaVazia()){
          return null;
      }
      return (T) this.elementos[0];
  }
  
  public T remover(){
      final int PRIMEIRO =0
        return null;
  }
      if(this.@Override
estaVazia(){
          return null;
      
          T elementoRemovido= (T)this.elementos[PRIMEIRO];
          
          this.remove(0);
          return elementoRemovido;
    
}
}
