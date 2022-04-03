/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package operadores;

/**
 *
 * @author bosch
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        Operadores calculadora = new Operadores(0,0);
        
        System.out.println("o resultado é : " + calculadora.adicao(35, 5));
        
        System.out.println("o resultado é : " + calculadora.subtracao(35, 5));
        
        System.out.println("o resultado é : " + calculadora.Multiplicacao(35, 5));
        
        System.out.println("o resultado é : " + calculadora.divisao(35, 5));
        
        System.out.println("o resultado é : " + calculadora.modulo(35, 5));
        
        System.out.println("o resultado é : " + calculadora.metadasoma(35, 5));
        
        System.out.println("o resultado é : " + calculadora.neutro(35)); 
              
        System.out.println("o resultado é : " + calculadora.criadores1("GabrielBoschiTanikawa","11211100784"));
        
        System.out.println("o resultado é : " + calculadora.criadores2("FreddyPonteNunes ","11211202211"));
    }
}
