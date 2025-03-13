package Variaveis;

/*### Exercício 1: Declaração e Atribuição de Variáveis ###

1. Crie uma variável do tipo `int` chamada `idade` e atribua o valor 25 a ela.
2. Crie uma variável do tipo `double` chamada `salario` e atribua o valor 2500.50 a ela.
3. Crie uma variável do tipo `String` chamada `nome` e atribua seu nome a ela (por exemplo, "Carlos").
4. Crie uma variável do tipo `boolean` chamada `estudante` e atribua o valor `true` a ela. 

public class Main {
    public static void main(String[] args){
        // Declaração e atribuição de variáveis
        int idade = 25;
        double salario = 2500.50;
        String nome = "Alex";
        boolean estudante = true;
        
        // Impressão dos valores das variáveis
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Nome: " + nome);
        System.out.println("É estudante: " + estudante);
    }
}
*/

/*### Exercício 2: Manipulação de Variáveis ###

1. Crie duas variáveis inteiras `a` e `b`, e atribua os valores 5 e 10 a elas. Depois, crie uma variável `soma` que seja a soma de `a` e `b`. Imprima o valor de `soma` no console.
2. Crie uma variável `precoProduto` do tipo `double` e atribua o valor 50.75 a ela. Depois, crie uma variável `desconto` do tipo `double` com valor 5.50. Calcule e imprima o valor final do produto após o desconto, subtraindo `desconto` de `precoProduto`.

public class Main {
    public static void main(String[] args) {
        // Primeira parte do exercício: soma de a e b
        int a = 5;
        int b = 10;
        int soma = a + b;
        System.out.println("A soma de a + b é: " + soma);
        
        // Segunda parte do exercício: cálculo do preço com desconto
        double precoProduto = 50.75;
        double desconto = 5.50;
        double precoFinal = precoProduto - desconto;
        System.out.println("O preço final do produto com desconto é: R$ " + precoFinal);
    }
}

*/

/*
### Exercício 3: Concatenando Strings ###

1. Crie uma variável `nome` do tipo `String` e atribua o valor "Maria". Crie outra variável `mensagem` do tipo `String` que concatene a frase "Olá, " com o valor de `nome`, e imprima a variável `mensagem` no console. 

public class Main {
    public static void main(String[] args) {
    
    String nome = "Maria";
    String mensagem = "Óla, ";
    System.out.println(mensagem + nome);
       
    }
}

 */

 /*
  ### Exercício 4: Usando Variáveis Booleanas ###

1. Crie uma variável `estaChovendo` do tipo `boolean` e atribua o valor `false`. Depois, crie uma condicional (`if`) para imprimir "Leve um guarda-chuva" caso `estaChovendo` seja `true`, e "Não precisa de guarda-chuva" caso contrário.

public class Main {
    public static void main (String[] args){
        boolean estaChovendo = false;
        
        // Verificando se está chovendo
        if (estaChovendo) {
            System.out.println("Leve um guarda-chuva");
        } else {
            System.out.println("Não precisa de guarda-chuva");
        }
    }
}

*/

/*
 ### Exercício 5: Variáveis e Tipos Diferentes

1. Crie uma variável `altura` do tipo `float` e atribua o valor 1.75 a ela.
2. Crie uma variável `cidade` do tipo `String` e atribua o nome de sua cidade.
3. Crie uma variável `peso` do tipo `double` e atribua o valor 70.5 a ela. Calcule e imprima o índice de massa corporal (IMC), usando a fórmula `IMC = peso / (altura * altura)`.

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        // Declaração das variáveis
        double altura = 1.75;
        String cidade = "Salvador";
        double peso = 70.5;
        
        // Cálculo do IMC (peso dividido pela altura ao quadrado)
        double imc = peso / (altura * altura);

        // Criando um objeto DecimalFormat para formatar o resultado
        DecimalFormat df = new DecimalFormat("#.##");
        
        // Impressão do IMC com 2 casas decimais
        System.out.println("Seu IMC é: " + df.format(imc));
    }
}

 */