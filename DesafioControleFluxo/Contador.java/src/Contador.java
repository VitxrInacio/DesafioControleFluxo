import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {

		Scanner terminal = new Scanner(System.in);

		System.out.println("Digite o primeiro parametro");
		int parametroUm = terminal.nextInt();

		System.out.println("Digite o segundo parametro");
		int parametroDois = terminal.nextInt();
		
		try {
            if (parametroUm > parametroDois){
                
                throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro");

            }
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println(exception.getMessage());
		}finally{
            //Fecha o objeto Scanner para evitar vazamentos de recursos
            terminal.close();
        }
		
	}
    static void contar(int parametroUm, int parametroDois) {
        // Loop para imprimir números a partir do primeiro até o segundo parâmetro
        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println("Imprimindo o numero " + i);
        }
    }
}
// Classe que define uma exceção personalizada
        class ParametrosInvalidosException extends Exception {
            public ParametrosInvalidosException(String message) {
                super(message);
            }
        }
