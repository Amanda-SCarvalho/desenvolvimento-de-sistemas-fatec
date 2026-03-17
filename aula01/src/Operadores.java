import java.util.Scanner; // Importação necessária para o Scanner

public class Operadores { // Convenção: Classes começam com letra Maiúscula
    public static void main(String[] args) { // String com S maiúsculo
        
        // 1. OPERADORES ARITMÉTICOS
        // ===
        int a = 10;
        int b = 3;
        
        System.out.println("=== ARITMÉTICOS ===");
        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão inteira: " + (a / b)); // resultado inteiro
        System.out.println("Resto: " + (a % b));

        // 2. OPERADORES DE COMPARAÇÃO
        // ===
        System.out.println("\n=== COMPARAÇÃO ===");
        System.out.println("a é igual a b: " + (a == b));
        System.out.println("a é diferente de b: " + (a != b));
        System.out.println("a é maior que b: " + (a > b));
        System.out.println("a é menor que b: " + (a < b));
        System.out.println("a é maior ou igual a b: " + (a >= b));
        System.out.println("a é menor ou igual a b: " + (a <= b));

        // 3. OPERADORES LÓGICOS
        // ===
        boolean temCarteira = true;
        int idade = 20;

        System.out.println("\n=== LÓGICOS ===");
        System.out.println("Pode dirigir (idade >= 18 E tem carteira): " + (idade >= 18 && temCarteira));
        System.out.println("Pode dirigir (idade < 18 OU tem carteira): " + (idade < 18 || temCarteira));
        System.out.println("Não possui carteira (negação): " + (!temCarteira));

        // 4. OPERADORES DE ATRIBUIÇÃO
        // ===
        int x = 10;
        System.out.println("\n=== ATRIBUIÇÃO ===");
        System.out.println("Valor inicial de x: " + x);
        
        x += 5; // x = x + 5
        System.out.println("Somando 5 ao valor de x: " + x);
        
        x -= 3; // x = x - 3
        System.out.println("Subtraindo 3 do valor de x: " + x);
        
        x *= 2; // x = x * 2
        System.out.println("Multiplicando x por 2: " + x);
        
        x /= 4; // x = x / 4
        System.out.println("Dividindo x por 4: " + x);
        
        x %= 3; // x = x % 3
        System.out.println("Resto da divisão de x por 3: " + x);

        // 5. OPERADORES BITWISE
        // ===
        int num1 = 5; // 0101 em binário
        int num2 = 3; // 0011 em binário
        
        System.out.println("\n=== BITWISE ===");
        System.out.println("E bit a bit (&): " + (num1 & num2));
        System.out.println("OU bit a bit (|): " + (num1 | num2));
        System.out.println("OU exclusivo (XOR ^): " + (num1 ^ num2));
        System.out.println("Inversão (NOT ~): " + (~num1));
        System.out.println("Deslocamento para esquerda (<<): " + (num1 << 1));
        System.out.println("Deslocamento para direita (>>): " + (num1 >> 1));

        
        // 6. EXTRA (incremento/decremento)
        // ====
        int contador = 5;

        System.out.println("\n=== INCREMENTO / DECREMENTO ===");
        System.out.println("Valor inicial: " + contador);

        // Pós-incremento: usa o valor atual e DEPOIS soma 1
        System.out.println("contador++: " + (contador++)); 
        System.out.println("Após contador++: " + contador);

        // Pré-incremento: soma 1 e DEPOIS usa o valor
        System.out.println("++contador: " + (++contador)); 

        // BOA PRÁTICA (Scanner)
        // ====
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\nDigite um numero:");
        
        // Em Java, o método é nextInt (com I maiúsculo)
        int numero = scanner.nextInt(); 
        
        System.out.println("Número digitado: " + numero);

        scanner.close(); // Importante para liberar memória!
    }
}