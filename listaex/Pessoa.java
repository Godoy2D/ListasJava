package listaex;

public class Pessoa {

	String[] nome = { "Jailson", "José", "Isaque" };
	int[] idade = { 37, 19, 30 };
	String[] profissao = { "Professor", "Administrador", "Pelezeiro" };

	public static void main(String[] args) {
		
		Pessoa cadastro01 = new Pessoa();

		System.out.println("O nome da pessoa é :" + cadastro01.nome[0]);
		System.out.println("A idade da pessoa é :" + cadastro01.idade[0]);
		System.out.println("A profissão da pessoa é :" + cadastro01.profissao[0]);

		Pessoa cadastro02 = new Pessoa();

		System.out.println("O nome da pessoa é :" + cadastro02.nome[1]);
		System.out.println("A idade da pessoa é :" + cadastro02.idade[1]);
		System.out.println("A profissão da pessoa é :" + cadastro02.profissao[1]);

		Pessoa cadastro03 = new Pessoa();

		System.out.println("O nome da pessoa é :" + cadastro03.nome[2]);
		System.out.println("A idade da pessoa é :" + cadastro03.idade[2]);
		System.out.println("A profissão da pessoa é :" + cadastro03.profissao[2]);
		
    	}
	}

