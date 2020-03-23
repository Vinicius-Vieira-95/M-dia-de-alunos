package Alunos;

import java.util.ArrayList;
import java.util.List;


public class MainAluno {

	public static void main(String[] args) {
		
		Aluno a1 = new AlunoGraduacao("João", 8.1, 9.2, 7.3, "PH");
		Aluno a3 = new AlunoGraduacao("Marcos", 1.1, 2.0, 5.3, "PH");
		System.out.println(a1);
		System.out.println(a3);
		
		Aluno a2 = new AlunoDePos("Jose", 10.0, 8.3, 6.2, "PH");
		System.out.println(a2);
		
		Diciplina d1 = new Diciplina("POO");
		d1.adicionarAluno(a1, a2);
		
		d1.listarAlunosAprovados("ambos");
		
		List<Aluno>alunos = new ArrayList<Aluno>();
		
		for(Aluno aluno : alunos) {
			
			System.out.println(alunos);
			
		}
		
		
		
		
	}

}
