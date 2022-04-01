/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atv_5;

/**
 *
 * @author Pedro Ferreira martins <"11201100435@alunos.umc.br">
 * @author Raphael Ninomiya <"1121110998@alunos.umc.br">
 * @author Victor Ferreira Silva <"11211100596@alunos.umc.br">
 */
public class Operadores 
{   
    
//   Métodos:
    
    public float adicao(float v1, float v2)
    {
        return v1+v2;
    } 
    
    public float subtracao (float v1, float v2)
    {
        return v1 - v2;
    }
    
    public float multiplicacao (float v1, float v2)
    {
        return v1 * v2;
    }
    
    public float divisao (float v1, float v2)
    {
        return v1 / v2;
    }
    
    public float resto_div (float v1, float v2)
    {
        return v1 % v2;
    }
    
    
//    Métodos de atribuição:
    
    public float atrib_soma(float v1, float v2)
    {
        return v1 += v2;
    }
    
    public float atrib_sub(float v1, float v2)
    {
        return v1 -= v2;
    }
    
    public float atrib_mult(float v1, float v2)
    {
        return v1 *= v2;
    }
    
    public float atrib_div(float v1, float v2)
    {
        return v1 /= v2;
    }
    
    public float atrib_resto(float v1, float v2)
    {
        return v1 %= v2;
    }
    
//    Métodos de lógica:
    
    public float comparacao(float v1, float v2, float v3, float v4)
    {
        if(v1==v2 && v3==v4)
        {
            System.out.println("Os números "+v1+" e "+v2+" são iguais, assim como "+v3+" e "+v4+".");
        }
        else if(v1==v2)
        {
            System.out.println("Apenas os números "+v1+" e "+v2+" são iguais.");
        }
        else if(v3==v4)
        {
            System.out.println("Apenas os números "+v3+" e "+v4+" são iguais.");
        }
        else
        {
            System.out.println("Nenhum número se repete.");
        }
        return 0;
    }
    
    public float OU(float v1, float v2, float v3, float v4)
    {
        if(v1==v2 | v1==v3 | v1==v4)
        {
            System.out.println("O primeiro número ("+v1+") é igual a pelo menos um outro número fornecido.");
        }
        else
        {
            System.out.println("O primeiro número ("+v1+") não é igual a nenhum outro número fornecido.");
        }
        return 0;
    }
    
    public float unless(float v1)
    {
        if(!(v1>=100))
        {
            System.out.println("O número fornecido é menor igual que 100.");
        }
        else
        {
            System.out.println("O número fornecido é maior que 100.");
        }
        return 0;
    }
    
    
}
