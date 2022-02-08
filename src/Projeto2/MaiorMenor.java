package Projeto2;

public class MaiorMenor {

		public static void maior(CadastroAluno[]cadastrandoAluno) {
			double maior=cadastrandoAluno[0].nota;
			for(int i=1; i<cadastrandoAluno.length; i++) {
				if(cadastrandoAluno[i].nota >maior) {
					maior = cadastrandoAluno[i].nota;
				}
			}
			System.out.println("A maior nota é: "+maior);
		}
		
		public static void menor(CadastroAluno[]cadastrandoAluno) {
			double menor=cadastrandoAluno[0].nota;
			for(int i=1; i<cadastrandoAluno.length; i++) {
				if(cadastrandoAluno[i].nota <menor) {
					menor = cadastrandoAluno[i].nota;
				}
			}
			System.out.println("A menor nota é: "+menor);
		}
			

}
