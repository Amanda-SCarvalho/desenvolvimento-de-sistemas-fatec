import java.util.Scanner;
/* https://github.com/faleite/java/tree/main/maratona-java/src/academy/devdojo/maratonajavaClasse 
 public → nome do arquivo obrigatoriamente igual
 Classe sem public → nome pode ser diferenteSo pode existir uma classe public por arquivo
 
 Definição - Tipos não primitivos em Java
 Os tipos não primitivos (ou tipos de referencia) 
 são aqueles que não armazenam o valor diretamente,mas sim uma referência (endereço) para um 
 objeto na memoria.
 
 Classe public → nome do arquivo obrigatoriamente igual
 Classe sem public → nome pode ser diferente
 Só pode existir uma classe public por arquivo  */

 public class NaoPrimitivos {
    public static void main(String[] args) {
        // String (classe)
        String nome ="Java";
        
        // Array (vetor)
        int[] numeros = { 1, 2, 3, 4, 5 };
        // Objeto Scanner
        Scanner scanner = new Scanner(System.in);
        // Exibindo valores
        System.out.println("Nome:"+ nome);
        System.out.println("Primeiro número do array:" + numeros[0]);
        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();
        System.out.println("Idade digitada:" + idade);
        scanner.close();
    }
}