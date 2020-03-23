/**
 * 
 */
package Alunos;

import java.util.ArrayList;
import java.util.List;


/**
 * @author VINICIUS
 *
 */
public class Diciplina {

	private String nomeDisc;
	private ArrayList<Aluno>aluno;
	
	
	public Diciplina(String nomeDisc) {
	
		this.setNomeDisc(nomeDisc);
		this.aluno = new ArrayList<Aluno>();
	}
	
	public void adicionarAluno(Aluno aluno1, Aluno aluno2) {
		
		this.aluno.add(aluno1);
		this.aluno.add(aluno2);
	}
	
	public List<Aluno> listarAlunosAprovados(String tipo){
		
		List<Aluno>alunoAprovado = new ArrayList<Aluno>();
		
		for(Aluno aluno: aluno) {
			
			boolean alunoGraduacaoAprovado = aluno.calcularMediaGral() >= 6;
			boolean alunoDePosAprovado = aluno.calcularMediaGral() >= 7;
			boolean ambosAprovados = alunoGraduacaoAprovado && alunoDePosAprovado;
			
			if(tipo.equals("graduacao") && alunoGraduacaoAprovado) {
				
				alunoAprovado.add(aluno);
			}
			else if(tipo.equals("pos") && alunoDePosAprovado) {
				alunoAprovado.add(aluno);
			}
			else if(tipo.equals("ambos") && ambosAprovados) {
				alunoAprovado.add(aluno);
			}
			
		}
		
		return alunoAprovado;
		
	}

	public String getNomeDisc() {
		return nomeDisc;
	}

	public void setNomeDisc(String nomeDisc) {
		this.nomeDisc = nomeDisc;
	}
	
	

}
