/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade5;

/**
 *
 * @author Matheus
 */
public class Operadores {

    float v1,v2;
    
    public Operadores (float v1, float v2){
        this.v1 = v1;
        this.v2 = v2;
        
    }
    
    public float adicao (float v1, float v2){
        return v1+v2;
    }
    
     public float subtracao (float v1, float v2){
        return v1-v2;
    }
      public float multiplicacao (float v1, float v2){
        return v1*v2;
        
    }
       public float divisao (float v1, float v2){
        return v1/v2;
    }
       public float atribuicao (float v1, float v2){
           return v1 = (3 *(v1 *=v2));
       }
        public String logico (String nome, String sobrenome){
            if(nome != "Matheus"  && sobrenome != "Meirielli")
              return "Nome Inválido";
            else
                 return "Nome Valido";     
        }
        public String comparativo (float v1){
            if( v1 > 100)
              return "Numero maior que 100";
            else
                 return "Numero menor que 100";     
        }
    }
        
    

