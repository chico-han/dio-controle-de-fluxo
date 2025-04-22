import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = scanner.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = scanner.nextInt();

        try {
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro: Não é válido letras, apenas números! " + e.getMessage());
        } finally {
            scanner.close();
        }
    }


    static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        } else {
            int quantidade = parametroDois - parametroUm;
            System.out.println("Número de interações na tela: " + quantidade); 
            for (int i = 0; i < quantidade; i++) {
                System.out.println("Imprimindo o número: " + (i+1));
                
            }
        }
    }
}
