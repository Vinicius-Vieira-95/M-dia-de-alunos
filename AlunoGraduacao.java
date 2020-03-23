package Alunos;

public class AlunoGraduacao extends Aluno {

	private String nomeCurso;
	private Double resultado;
	
	public AlunoGraduacao(String nome,Double n1, Double n2, Double n3, String nomecurso) {
		
		super(nome,n1,n2,n3);
		this.setNomeCurso(nomecurso);
	}

	
	//Média aritimedica.
	
	@Override
	public Double calcularMediaGral() {
		
		this.resultado = ((notas.get(0) + notas.get(1) + notas.get(2))/3);
		
		return resultado;
	}


	public Double getResultado() {
		return resultado;
	}


	public void setResultado(Double resultado) {
		this.resultado = resultado;
	}


	public String getNomeCurso() {
		return nomeCurso;
	}


	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

}
