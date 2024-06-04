import java.util.Scanner;

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois); // Chamando o método contendo a lógica de contagem
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage()); // Imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro"); // Validar se
                                                                                                         // parametroUm
                                                                                                         // é MAIOR que
                                                                                                         // parametroDois
                                                                                                         // e lançar a
                                                                                                         // exceção
        }

        int contagem = parametroDois - parametroUm;

        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i); // Realizar o for para imprimir os números com base na
                                                            // variável contagem
        }
    }
}