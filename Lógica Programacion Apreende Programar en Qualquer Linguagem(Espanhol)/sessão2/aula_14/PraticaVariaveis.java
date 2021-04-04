package sessão2.aula_14;

public class PraticaVariaveis {
    public static void main(String[] args) {
        int n1 = 2, n2 = 5, n3 = 0;
        n3 = n2 - n1;
        n2 = 2;
        n1 = n3 + n2;
        n3 = n2 * n3;
        n2 = n3 / n1;

        
        System.out.println("O valor da n1 é " + n1);
        System.out.println("O valor da n2 é " + n2);
        System.out.println("O valor da n3 é " + n3);

    }
}