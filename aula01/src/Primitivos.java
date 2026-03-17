public class Primitivos {
    public static void main(String[] args) {

        int age = 10;
        long numeroGrande = 10L;
        float numeroFracionario = 10.5f;
        double numeroDouble = 10.5;
        char inicial = '\u0041'; // (2 bytes) pode ser unicode
        boolean verdadeiro = true;
        boolean falso = false;
        short numeroPequeno = 10;
        byte numeroPequenoByte = 10;
        String nome = "Java"; // Tipo referência

        System.out.println("A idade é " + age + " anos");
        System.out.println("Número grande: " + numeroGrande);
        System.out.println("Número fracionario: " + numeroFracionario);
        System.out.println("Número double: " + numeroDouble);
        System.out.println("Número inicial: " + inicial);
        System.out.println("Número verdadeiro: " + verdadeiro);
        System.out.println("Número falso: " + falso);
        System.out.println("Número pequeno (Short): " + numeroPequeno);
        System.out.println("Número pequeno (Byte): " + numeroPequenoByte);
        System.out.println("Número: " + nome);
    }

   
    
}
