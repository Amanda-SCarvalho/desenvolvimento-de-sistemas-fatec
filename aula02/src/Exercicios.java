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

    // 15. Leia um ângulo em radianos para graus. G = R × 180 / π (π = 3.14)
    public static void ex15(Scanner sc) {
        System.out.println("Angulo em Radianos: ");
        double r = sc.nextDouble();
        double g = r * 180 / 3.14;
        System.out.printf("%.2f equivale a %.2f graus\n", r, g);
    }

    // 16. Leia um valor em polegadas e converta em centimetros. C = P × 2.54
    public static void ex16(Scanner sc) {
        System.out.println("Comprimento em polegadas: ");
        double p = sc.nextDouble();
        double c = p * 2.54;
        System.out.printf("%.2f equivale a %.2f centimetros\n", p, c);
    }

    // 16. Leia um valor em centimetros e converta para polegadas. P = C / 2.54
    public static void ex17(Scanner sc) {
        System.out.println("Comprimento em centimetros: ");
        double c = sc.nextDouble();
        double p = c / 2.54;
        System.out.printf("%.2f equivale a %.2f polegadas\n", p, c);
    }

    // 17. Leia um volume em metros cubicos e converta para litros. L = 1000 * M
    public static void ex18(Scanner sc) {
        System.out.println("Volume em metros cúbicos: ");
        double mc = sc.nextDouble();
        double l = 1000 * mc;
        System.out.printf("%.2f equivale a %.2f litros%n", mc, l);
    }

    // 18. Leia um volume em litros e converta para metros cubicos. M = l /1000
    public static void ex19(Scanner sc) {
        System.out.println("Volume em Litros: ");
        double l = sc.nextDouble();
        double mc = l / 1000;
        System.out.printf("%.2f equivale a %.2f metros cúbicos%n", l, mc);
    }

    // 19.Leia uma massa em quilogramas e converta para libras. L = K/ 0.45
    public static void ex20(Scanner sc) {
        System.out.println("Massa em quilogramas: ");
        double m = sc.nextDouble();
        double l = m / 0.45;
        System.out.printf("%.2f equivale a %.2f libras\n", m, l);
    }
    // 20. Leia uma massa em quilogramas e converta para libras.
    // Fórmula: L = K / 0.45

    // 21. Leia uma massa em libras e converta para quilogramas.
    // Fórmula: K = L × 0.45
    public static void ex21(Scanner sc) {
        System.out.println("Massa em libras: ");
        double l = sc.nextDouble();
        double k = l * 0.45;
        System.out.printf("%.2f libras equivale a %.2f kg\n", l, k);
    }

    // 22. Leia um comprimento em jardas e converta para metros.
    // Fórmula: M = 0.91 × J
    public static void ex22(Scanner sc) {
        System.out.println("Comprimento em jardas: ");
        double j = sc.nextDouble();
        double m = 0.91 * j;
        System.out.printf("%.2f jardas equivale a %.2f metros\n", j, m);
    }

    // 23. Leia um comprimento em metros e converta para jardas.
    // Fórmula: J = M / 0.91
    public static void ex23(Scanner sc) {
        System.out.println("Comprimento em metros: ");
        double m = sc.nextDouble();
        double j = m / 0.91;
        System.out.printf("%.2f metros equivale a %.2f jardas\n", m, j);
    }

    // 24. Leia uma área em metros quadrados e converta para acres.
    // Fórmula: A = M × 0.000247
    public static void ex24(Scanner sc) {
        System.out.println("Área em m²: ");
        double m = sc.nextDouble();
        double a = m * 0.000247;
        System.out.printf("%.2f m² equivale a %.6f acres\n", m, a);
    }

    // 25. Leia uma área em acres e converta para metros quadrados.
    // Fórmula: M = A × 4048.58
    public static void ex25(Scanner sc) {
        System.out.println("Área em acres: ");
        double a = sc.nextDouble();
        double m = a * 4048.58;
        System.out.printf("%.6f acres equivale a %.2f m²\n", a, m);
    }

    // 26. Leia uma área em metros quadrados e converta para hectares.
    // Fórmula: H = M × 0.0001
    public static void ex26(Scanner sc) {
        System.out.println("Área em m²: ");
        double m = sc.nextDouble();
        double h = m * 0.0001;
        System.out.printf("%.2f m² equivale a %.4f hectares\n", m, h);
    }

    // 27. Leia uma área em hectares e converta para metros quadrados.
    // Fórmula: M = H × 10000
    public static void ex27(Scanner sc) {
        System.out.println("Área em hectares: ");
        double h = sc.nextDouble();
        double m = h * 10000;
        System.out.printf("%.2f hectares equivale a %.2f m²\n", h, m);
    }

    // 28. Leia três valores e apresente a soma dos quadrados deles.
    public static void ex28(Scanner sc) {
        System.out.println("Digite três números:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double soma = a * a + b * b + c * c;
        System.out.println("Soma dos quadrados: " + soma);
    }

    // 29. Leia quatro notas, calcule a média aritmética e imprima o resultado.
    public static void ex29(Scanner sc) {
        System.out.println("Digite quatro notas:");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double n4 = sc.nextDouble();
        double media = (n1 + n2 + n3 + n4) / 4;
        System.out.println("Média: " + media);
    }

    // 30. Leia um valor em reais e a cotação do dólar. Imprima o valor em dólares.
    public static void ex30(Scanner sc) {
        System.out.println("Valor em reais: ");
        double real = sc.nextDouble();
        System.out.println("Cotação do dólar: ");
        double dolar = sc.nextDouble();
        double resultado = real / dolar;
        System.out.println("Valor em dólares: " + resultado);
    }

    // 31. Leia um número inteiro e imprima seu antecessor e sucessor.
    public static void ex31(Scanner sc) {
        int n = sc.nextInt();
        System.out.println("Antecessor: " + (n - 1));
        System.out.println("Sucessor: " + (n + 1));
    }

    // 32. Leia um número inteiro e imprima a soma do sucessor do triplo com o
    // antecessor do dobro.
    public static void ex32(Scanner sc) {
        int n = sc.nextInt();
        int resultado = (3 * n + 1) + (2 * n - 1);
        System.out.println("Resultado: " + resultado);
    }

    // 33. Leia o lado de um quadrado e calcule sua área.
    public static void ex33(Scanner sc) {
        double lado = sc.nextDouble();
        System.out.println("Área: " + (lado * lado));
    }

    /*
     * 34. Leia o raio de um círculo e calcule sua área.
     * Fórmula: A = π × r2 (π = 3.141592)
     */
    public static void ex34(Scanner sc) {
        double r = sc.nextDouble();
        double area = 3.141592 * r * r;
        System.out.println("Área do círculo: " + area);
    }

    /*
     * 35. Leia os catetos (a e b) de um triângulo e calcule a hipotenusa.
     * Fórmula: h = √(a2 + b2)
     */
    public static void ex35(Scanner sc) {
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double h = Math.sqrt(a * a + b * b);
        System.out.println("Hipotenusa: " + h);
    }

    /*
     * 36. Leia altura e raio de um cilindro e calcule seu volume.
     * Fórmula: V = π × r2 × h
     */
    public static void ex36(Scanner sc) {
        double r = sc.nextDouble();
        double h = sc.nextDouble();
        double v = 3.14 * r * r * h;
        System.out.println("Volume: " + v);
    }

    // 37. Leia o valor de um produto e aplique 12% de desconto.
    public static void ex37(Scanner sc) {
        double valor = sc.nextDouble();
        double desconto = valor * 0.88;
        System.out.println("Com desconto: " + desconto);
    }

    // 38. Leia o salário e calcule o novo salário com aumento de 25%.
    public static void ex38(Scanner sc) {
        double salario = sc.nextDouble();
        double novo = salario * 1.25;
        System.out.println("Novo salário: " + novo);
    }

    /*
     * 39.Divida R$ 780.000,00 entre três ganhadores:
     * • 1o: 46%
     * • 2o: 32%
     * • 3o: restante
     */
    public static void ex39() {
        double total = 780000;
        System.out.println("1º: " + total * 0.46);
        System.out.println("2º: " + total * 0.32);
        System.out.println("3º: " + total * 0.22);
    }

    // 40.Um encanador recebe R$ 30,00/dia. Calcule o salário líquido com desconto
    // de 8%.
    public static void ex40(Scanner sc) {
        int dias = sc.nextInt();
        double salario = dias * 30;
        double liquido = salario * 0.92;
        System.out.println("Salário líquido: " + liquido);
    }

    // 41. Leia valor da hora e horas trabalhadas. Adicione 10% ao salário final.
    public static void ex41(Scanner sc) {
        System.out.println("Valor da hora: ");
        double valorHora = sc.nextDouble();
        System.out.println("Horas trabalhadas: ");
        double horas = sc.nextDouble();

        double salario = valorHora * horas;
        double finalSalario = salario * 1.10;

        System.out.println("Salário final: " + finalSalario);
    }

    /*
     * 42. Leia o salário-base.
     * o Gratificação: +5%
     * o Imposto: −7%
     */
    public static void ex42(Scanner sc) {
        System.out.println("Salário base: ");
        double salario = sc.nextDouble();

        double gratificacao = salario * 1.05;
        double finalSalario = gratificacao * 0.93;

        System.out.println("Salário final: " + finalSalario);
    }

    /*
     * 43. Para vendas:
     * • À vista: 10% de desconto
     * • Parcelado (3x): sem juros
     * • Comissão à vista: 5% sobre valor com desconto
     * • Comissão parcelada: 5% sobre valor total
     */
    public static void ex43(Scanner sc) {
        System.out.println("Valor do produto: ");
        double valor = sc.nextDouble();

        double vista = valor * 0.9;
        double parcela = valor;

        double comissaoVista = vista * 0.05;
        double comissaoPrazo = parcela * 0.05;

        System.out.println("À vista: " + vista);
        System.out.println("Parcelado (3x): " + parcela);
        System.out.println("Comissão à vista: " + comissaoVista);
        System.out.println("Comissão parcelada: " + comissaoPrazo);
    }

    // 44.Calcule quantos degraus são necessários para atingir uma altura desejada.
    public static void ex44(Scanner sc) {
        System.out.println("Altura do degrau: ");
        double degrau = sc.nextDouble();

        System.out.println("Altura desejada: ");
        double altura = sc.nextDouble();

        int quantidade = (int) (altura / degrau);

        System.out.println("Quantidade de degraus: " + quantidade);
    }

    // 45.Converta uma letra maiúscula para minúscula usando ASCII.
    public static void ex45(Scanner sc) {
        System.out.println("Digite uma letra maiúscula: ");
        char letra = sc.next().charAt(0);

        char minuscula = (char) (letra + 32);

        System.out.println("Minúscula: " + minuscula);
    }

    // 46. Leia um número de 3 dígitos e imprima-o invertido.
    public static void ex46(Scanner sc) {
        int num = sc.nextInt();

        int c = num / 100;
        int d = (num % 100) / 10;
        int u = num % 10;

        System.out.println("" + u + d + c);
    }

    // 47. Leia um número de 4 dígitos e imprima um dígito por linha.
    public static void ex47(Scanner sc) {
        int num = sc.nextInt();

        System.out.println(num / 1000);
        System.out.println((num % 1000) / 100);
        System.out.println((num % 100) / 10);
        System.out.println(num % 10);
    }

    // 48.Converta segundos em horas, minutos e segundos.
    public static void ex48(Scanner sc) {
        int total = sc.nextInt();

        int h = total / 3600;
        int m = (total % 3600) / 60;
        int s = total % 60;

        System.out.println(h + "h " + m + "m " + s + "s");
    }

    // 49.Calcule o horário final de um experimento (hora inicial + duração em
    // segundos).
    public static void ex49(Scanner sc) {
        System.out.println("Hora inicial (0-23): ");
        int h = sc.nextInt();

        System.out.println("Minuto inicial: ");
        int m = sc.nextInt();

        System.out.println("Segundo inicial: ");
        int s = sc.nextInt();

        System.out.println("Duração em segundos: ");
        int duracao = sc.nextInt();

        int total = h * 3600 + m * 60 + s + duracao;

        int hFinal = (total / 3600) % 24;
        int mFinal = (total % 3600) / 60;
        int sFinal = total % 60;

        System.out.println("Horário final: " + hFinal + ":" + mFinal + ":" + sFinal);
    }

    // 50.Calcule o ano de nascimento com base na idade e no ano atual.
    public static void ex50(Scanner sc) {
        System.out.println("Idade: ");
        int idade = sc.nextInt();

        System.out.println("Ano atual: ");
        int ano = sc.nextInt();

        int nascimento = ano - idade;

        System.out.println("Ano de nascimento: " + nascimento);
    }

    /*
     * 51. Leia coordenadas (x, y) e calcule a distância até (0, 0).
     * Fórmula: d = √(x2 + y2)
     */
    public static void ex51(Scanner sc) {
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        double d = Math.sqrt(x * x + y * y);

        System.out.println("Distância: " + d);
    }

    // 52.Divida um prêmio proporcionalmente ao valor apostado por três amigos.
    public static void ex52(Scanner sc) {
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double total = a + b + c;
        double premio = 1000; // pode ajustar

        System.out.println("A: " + (premio * (a / total)));
        System.out.println("B: " + (premio * (b / total)));
        System.out.println("C: " + (premio * (c / total)));
    }

    /*
     * 53.Calcule o custo para cercar um terreno:
     * o Entrada: comprimento (c), largura (l) e preço por metro (p)
     * o Fórmula: custo = 2 × (c + l) × p
     */
    public static void ex53(Scanner sc) {
        System.out.println("Comprimento: ");
        double c = sc.nextDouble();

        System.out.println("Largura: ");
        double l = sc.nextDouble();

        System.out.println("Preço por metro: ");
        double p = sc.nextDouble();

        double custo = 2 * (c + l) * p;

        System.out.println("Custo total: " + custo);
    }
}
