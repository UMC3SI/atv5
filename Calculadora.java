public class Calculadora {
    public static void main(String[] args) {
        Operadores resultado = new Operadores();


        System.out.println("O Resultado de 15+3 é igual a: " + resultado.adicao(15, 3));

        System.out.println("O Resultado  de 15-8 é igual a: " + resultado.subtracao(15, 8));

        System.out.println("O Resultado de 20-3 é igual a: " + resultado.multiplicacao(20, 3));

        System.out.println("O Resultado de 9-3 é igual a: " + resultado.divisao(9, 3));
    }}