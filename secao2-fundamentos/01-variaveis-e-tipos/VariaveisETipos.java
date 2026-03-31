/**

* ============================================================
* ```
       VARIÁVEIS E TIPOS PRIMITIVOS EM JAVA
  ```
* ============================================================
*
* 📌 1) O QUE SÃO VARIÁVEIS?
*
* Variável é um espaço na memória utilizado para armazenar dados
* que podem ser usados e manipulados durante a execução do programa.
*
* Exemplo:
* int idade = 25;
*
* ---
* 🧠 2) REGRAS PARA CRIAR VARIÁVEIS
*
* * Não pode começar com número
* * Não pode conter espaços
* * Não pode usar palavras reservadas (ex: int, class, etc)
* * Deve começar com letra minúscula (boa prática)
* * Use nomes significativos
*
* ❌ errado: int x;
* ✅ correto: int idadeUsuario;
*
* ---
* 🔢 3) TIPOS PRIMITIVOS EM JAVA
*
* Java possui 8 tipos primitivos:
*
* boolean → verdadeiro ou falso (true / false)
*
* byte    → números inteiros pequenos (-128 a 127)
* short   → números inteiros médios (-32.768 a 32.767)
* int     → números inteiros (mais usado)
* long    → números inteiros grandes
*
* float   → números decimais (menor precisão)
* double  → números decimais (mais preciso - padrão)
*
* char    → um único caractere (ex: 'A')
*
* ---
* 🧠 4) DETALHES IMPORTANTES
*
* ✔ double é o padrão para números decimais
*
* ✔ float precisa do sufixo 'f'
* Exemplo:
* float valor = 10.5f;
*
* ✔ long precisa do sufixo 'L'
* Exemplo:
* long numero = 10000000000L;
*
* ✔ char usa aspas simples (' ')
* ✔ String usa aspas duplas (" ")
*
* ---
* ⚠️ 5) ERROS COMUNS
*
* * Esquecer o 'f' no float
* * Esquecer o 'L' no long
* * Usar int para números muito grandes
* * Confundir char com String
*
* ❌ char letra = "A";
* ✔ char letra = 'A';
*
* ---
* 🧪 6) EXEMPLO PRÁTICO
*
* Neste exemplo usamos todos os tipos primitivos:
*
* ============================================================
  */
  
public class VariaveisETipos {
    public static void main(String[] args) {
        // boolean
        boolean ativo = true;

        // inteiros
        byte idadePequena = 100;
        short numeroCurto = 1000;
        int idade = 25;
        long populacao = 8000000000L;

        // decimais
        float precoFloat = 10.5f;
        double altura = 1.75;

        // caractere
        char genero = 'M';

        // saída de dados
        System.out.println("Boolean: " + ativo);
        System.out.println("Byte: " + idadePequena);
        System.out.println("Short: " + numeroCurto);
        System.out.println("Int: " + idade);
        System.out.println("Long: " + populacao);
        System.out.println("Float: " + precoFloat);
        System.out.println("Double: " + altura);
        System.out.println("Char: " + genero);
    }
}