
package algoritmoestruturasdedados;
public class Cliente {
    public boolean tirarSenha;
   
   
  
  
public void tirarSenha(){
    this.tirarSenha=true;
}
  public  void entraNaFila (){
    if(this.tirarSenha==false){
        System.out.println(" Erro! primerio tire a sua senha e entra na fila ");
    }
    else {
        System.out.println("senha tirada ");
        
    }

  }

    public boolean getTirarSenha() {
        return tirarSenha;
    }

    public void setTirarSenha(boolean tirarSenha) {
        this.tirarSenha= tirarSenha;
    }

  
   

    
        
       
    
}
