import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ex16(scanner); /* Mude o numero conforme o exercicio */

        scanner.close();
    }

    // 1. Faça um programa que leia um número inteiro e o imprima.
    public static void ex01(Scanner sc) {
        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();
        System.out.println("O número digitado foi: " + num);
    }

    // 2. Faça um programa que leia um número real e o imprima.
    public static void ex02(Scanner sc) {
        System.out.print("Digite um número real: ");
        double num = sc.nextDouble();
        System.out.println("O número digitado foi: " + num);
    }

    // 3. Peça ao usuário para digitar três valores inteiros e imprima a soma deles.
    public static void ex03(Scanner sc) {
        System.out.println("Digite três números inteiros:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        System.out.println("Soma: " + (n1 + n2 + n3));
    }

    // 4. Leia um número real e imprima o resultado do quadrado desse número.
    public static void ex04(Scanner sc) {
        System.out.print("Digite um número: ");
        double num = sc.nextDouble();
        System.out.println("O quadrado é: " + (num * num));
    }

    // 5. Leia um número real e imprima a quinta parte desse número.
    public static void ex05(Scanner sc) {
        System.out.print("Digite um número: ");
        double num = sc.nextDouble();
        System.out.println("A quinta parte é: " + (num / 5));
    }

    // 6. Leia em Celsius e converta para Fahrenheit. F = C * (9/5) + 32
    public static void ex06(Scanner sc) {
        System.out.print("Graus Celsius: ");
        double c = sc.nextDouble();
        double f = c * (9.0 / 5.0) + 32.0;
        System.out.printf("%.1f°C equivale a %.1f°F\n", c, f);
    }

    // 7. Leia em Fahrenheit e converta para Celsius. C = 5 * (F - 32) / 9
    public static void ex07(Scanner sc) {
        System.out.print("Graus Fahrenheit: ");
        double f = sc.nextDouble();
        double c = 5.0 * (f - 32.0) / 9.0;
        System.out.printf("%.1f°F equivale a %.1f°C\n", f, c);
    }

    // 8. Kelvin para Celsius. C = K - 273.15
    public static void ex08(Scanner sc) {
        System.out.print("Kelvin: ");
        double k = sc.nextDouble();
        System.out.printf("%.2fK equivale a %.2f°C\n", k, (k - 273.15));
    }

    // 9. Celsius para Kelvin. K = C + 273.15
    public static void ex09(Scanner sc) {
        System.out.print("Celsius: ");
        double c = sc.nextDouble();
        System.out.printf("%.1f°C equivale a %.2fK\n", c, (c + 273.15));
    }

    // 10. km/h para m/s. M = K / 3.6
    public static void ex10(Scanner sc) {
        System.out.print("Velocidade em km/h: ");
        double kmh = sc.nextDouble();
        System.out.printf("%.2f km/h = %.2f m/s\n", kmh, (kmh / 3.6));
    }

    // 11. m/s para km/h. K = M * 3.6
    public static void ex11(Scanner sc) {
        System.out.print("Velocidade em m/s: ");
        double ms = sc.nextDouble();
        System.out.printf("%.2f m/s = %.2f km/h\n", ms, (ms * 3.6));
    }

    // 12. Milhas para Quilômetros. K = 1.61 * M
    public static void ex12(Scanner sc) {
        System.out.print("Distância em Milhas: ");
        double m = sc.nextDouble();
        System.out.printf("%.2f milhas = %.2f km\n", m, (1.61 * m));
    }

    // 13. Quilômetros para Milhas. M = K / 1.61
    public static void ex13(Scanner sc) {
        System.out.print("Distância em Quilômetros: ");
        double k = sc.nextDouble();
        System.out.printf("%.2f km = %.2f milhas\n", k, (k / 1.61));
    }

    // 14. Ângulo em graus para radianos. R = G * PI / 180
    public static void ex14(Scanner sc) {
        System.out.print("Ângulo em Graus: ");
        double g = sc.nextDouble();
        double r = g * 3.14 / 180;
        System.out.printf("%.2f° equivale a %.4f radianos\n", g, r);
    }

    //15. Leia um ângulo em radianos para graus. G = R × 180 / π (π = 3.14)
    public static void ex15(Scanner sc){
        System.out.println("Angulo em Radianos: ");
        double r = sc.nextDouble();
        double g = r * 180 / 3.14;
        System.out.printf("%.2f equivale a %.2f graus\n", r, g);
    }
    //16. Leia um valor em polegadas e converta em centimetros. C = P × 2.54
    public static void ex16(Scanner sc){
        System.out.println("Comprimento em polegadas: ");
        double p = sc.nextDouble();
        double c = p * 2.54;
        System.out.printf("%.2f equivale a %.2f centimetros\n", p, c);
    }
    //16. Leia um valor em centimetros e converta para polegadas. P = C / 2.54
    public static void ex17(Scanner sc){
        System.out.println("Comprimento em centimetros: ");
        double c = sc.nextDouble();
        double p = c / 2.54;
        System.out.printf("%.2f equivale a %.2f polegadas\n", p, c);
    }

    //Leia um volume em metros cubicos e converta para litros. L = 1000 * M
    public static void ex18( Scanner sc){
        System.out.println("Volume em metros cúbicos: ");
        double mc = sc.nextDouble();
        double l = 1000 * mc;
        System.out.printf("%.2f equivale a %.2f litros\n", mc, l);
    }
    //Leia um volume em litros e converta para metros cubicos. M = l /1000
    public static void ex19( Scanner sc){
        System.out.println("Volume em Litros: ");
        double l = sc.nextDouble();
        double mc = l / 1000;
        System.out.printf("%.2f equivale a %.2f metros cúbicos\n", l, mc);
    }
    //Leia uma massa em quilogramas e converta para libras. L = K/ 0.45
    public static void ex20( Scanner sc){
        System.out.println("Massa em quilogramas: ");
        double m = sc.nextDouble();
        double l = m / 0.45;
        System.out.printf("%.2f equivale a %.2f libras\n", m, l);
    }
}
