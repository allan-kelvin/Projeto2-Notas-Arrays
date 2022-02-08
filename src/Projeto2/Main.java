package Projeto2;

public class Main {

public static void main(String[] args) {
	CadastroAluno cadastrandoAluno[] = new CadastroAluno[5];
	
	// POPULANDO OS ARRAYS
	CadastroAluno aluno1 = new CadastroAluno(1,"allan",4);
	CadastroAluno aluno2 = new CadastroAluno(2,"Marcos",8);
	CadastroAluno aluno3 = new CadastroAluno(3,"Antônio",7);
	CadastroAluno aluno4 = new CadastroAluno(4,"Lais",6);
	CadastroAluno aluno5 = new CadastroAluno(5,"Isa",5);

	
	cadastrandoAluno[0]=aluno1;
	cadastrandoAluno[1]=aluno2;
	cadastrandoAluno[2]=aluno3;
	cadastrandoAluno[3]=aluno4;
	cadastrandoAluno[4]=aluno5;
	
	// IMPRIMINDO 
	for(int i=0; i<cadastrandoAluno.length; i++) {
		System.out.println("ID: "+cadastrandoAluno[i].id);
		System.out.println("Aluno: "+cadastrandoAluno[i].nome);
		System.out.println("Nota: "+cadastrandoAluno[i].nota);
		System.out.println(" ");
	}
	
	// ACHANDO O MAIOR;
	MaiorMenor.maior(cadastrandoAluno);
	
	// ACHANDO O MENOR
	MaiorMenor.menor(cadastrandoAluno);
	
    }

}
