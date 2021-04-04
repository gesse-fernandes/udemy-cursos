package sessão2.aula_15;

public class EstruturaSwitch {
    public static void main(String[] args) {
        char nota = '8';

        switch (nota) {
            case '5':
                System.out.println("Suficiente");
                break;
                case '6':
                System.out.println("Bem");
                break;
                case '7':
                System.out.println("Notavel");
                break;
                case '8':
                      System.out.println("Notavel melhor");
                      
                      break;
                  case '9':
                      System.out.println("Parabéns");
                      break;
        
                  default:
                    System.out.println("Suspendido");
                break;
        }
    }
}
