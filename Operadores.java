/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadores;

/**
 *@author Freddye Pontes Nunes <11211202211@alunos.umc.br>
 * @author Gabriel Boschi Tanikawa <11211100784@alunos.umc.br>
 */
public class Operadores {

    float v1,v2;

    public Operadores(float v1, float v2)
    {
        this.v1 = v1;
        this.v2 = v2;
    }
    //metodo de operadores aritméticos de adicao
    public float adicao(float v1, float v2)
    {
    return v1+v2;    
    }
    //metodo de operadores aritméticos de subtracao
    public float subtracao(float v1, float v2)
    {
    return v1-v2;    
    }
    //metodo de operadores aritméticos de multiplicacao
    public float Multiplicacao(float v1, float v2)
    {
    return v1*v2;    
    }
    //metodo de operadores aritméticos de divisao
    public float divisao(float v1, float v2)
    {
    return v1/v2;    
    }
    //metodo de operadores aritméticos de módulo
     public float modulo(float v1, float v2)
    {
    return v1%v2;
    
    }
     //metodo de operadores atribuicao de modulo
     public float metadasoma (float v1, float v2)
     {
         return v1=((v1+=v2)/2);
     }
     //metodo de operadores comparacao de igual 
     public String neutro(float v1)
     {if(v1==0)
         {
             return "numero é 0";
         }
         else
         {
             return "é diferente de 0";
         }
     }
     //metodo de operadores logicos de E
     public String criadores1 (String nome,String rgm )
     {
         if(nome == "GabrielBoschiTanikawa" && rgm=="11211100784")
         {
             return "criador do progama";
         }
         else
         {
         return "nome invalido" ;   
         }
     }
     //metodo de operadores logicos de E
      public String criadores2 (String nome,String rgm )
     {
         if(nome == "FreddyPonteNunes " && rgm=="11211202211")
         {
             return "criador do progama";
         }
         else
         {
         return "nome invalido" ;   
         }
     }
}
