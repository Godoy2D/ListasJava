package lista07;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
		/*  Faça um algoritmo para ler um número que é um código de usuário. Caso este código seja
		 * diferente de um código armazenado internamente no algoritmo (igual a 1234) deve ser apresentada a mensagem
		 * ‘Usuário inválido!’. Caso o Código seja correto, deve ser lido outro valor que é a senha. Se esta senha estiver
		 * incorreta (a certa é 9999) deve ser mostrada a mensagem ‘senha incorreta’. Caso a senha esteja correta, deve ser
		 * mostrada a mensagem ‘Acesso permitido’.
		 */
		
		Scanner escopo = new Scanner (System.in);
		System.out.println("olá, digite sua senha:");
		
		String senhaUsuario = escopo.nextLine();
		
		String senha = "Brasil2022";
		
		if (senhaUsuario.equals(senha)) {
			
			System.out.println("acesso permitido!");

		}else {
			
			System.out.println("senha incorreta! por favor, digite a senha novamente:");
			
			String senhaUsuario2 = escopo.next();
			if (senhaUsuario2.equals(senha)) {
				
				System.out.println("acesso permitido!");
		
		}else {
			
			System.out.println("senha incorreta! Por favor, tente novamente em 05:00 minutos...");
			

		}
			escopo.close();
		}
		}
	}
