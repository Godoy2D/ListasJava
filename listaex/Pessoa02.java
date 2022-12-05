package listaex;

public class Pessoa02 {

	String[] nome = { "Jailson", "José", "Isaque" };
	int[] idade = { 37, 19, 30 };
	String[] profissao = { "Professor", "Administrador", "Pelezeiro" };
	
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++){
		
		Pessoa cadastro01 = new Pessoa();

		System.out.println("O nome da pessoa é :" + cadastro01.nome[i]);
		System.out.println("A idade da pessoa é :" + cadastro01.idade[i]);
		System.out.println("A profissão da pessoa é :" + cadastro01.profissao[i]);

    	}
	}
}
