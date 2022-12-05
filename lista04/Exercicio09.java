package lista04;

// 9) Ler o valor correspondente ao salário mensal (variável SM) de um
//    trabalhador e também o valor do percentual de reajuste (variável PR)
//    a ser atribuído. Apresentar o valor do novo salário (variável NS).


public class Exercicio09 {

	public static void main(String[] args) 
		// TODO Auto-generated method stub
		int main()

		{

		   double SM = 0, PR = 0, NS = 0;

		 

		 printf("Informe seu salário\n", NS);

		 scanf("%lf", &SM);

		 

		 printf("Informe o percentual de reajuste\n", NS);

		 scanf("%lf", &PR);

		 

		/* o resultado dessa operação é a porcentagem. Por exemplo, se quiser 10% de 1 mil reais o resultado será 100 */

		NS = SM*PR/100;

		//sabendo que NS é o seu acréscimo, basta somar o valor com o salário

		printf("Este é o seu novo salário: %.2f", SM+NS);

		// %.2f limita o total de casas decimais após o 'ponto'. Se colocar %.3f o output será "100.000".

		return 0;

		}
		private void scanf(String string, double sM) {
			// TODO Auto-generated method stub
			
		}
		private void printf(String string, double d) {
			// TODO Auto-generated method stub
			
		}