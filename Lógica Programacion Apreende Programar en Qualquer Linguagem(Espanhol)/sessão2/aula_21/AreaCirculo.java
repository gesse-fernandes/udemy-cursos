package sessão2.aula_21;

import java.util.Scanner;

public class AreaCirculo {
    static double pi = Math.PI;
    public static void main(String[] args) {
        double raio;
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o valor do raio: ");
        raio = ler.nextDouble();
        double area = raio * raio * pi;
        System.out.println("Area do circulo é: " + area);
        ler.close();
    }
}
