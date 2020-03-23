package Alunos;

public class AlunoDePos  extends Aluno{

	private String orientador;
	private Double resultado;
	
	public AlunoDePos(String nome, Double n1, Double n2, Double n3, String orientador) {
		super(nome, n1, n2, n3);
		
		this.orientador = orientador;	
		
	}

	// Média ponderada.
	
	@Override
	public Double calcularMediaGral() {
		
		this.resultado = ((2*notas.get(0)) + (3*notas.get(1)) + (5*notas.get(2)))/(2+3+5);
		
		return this.resultado; 
	}

	public String getOrientador() {
		return orientador;
	}

	public void setOrientador(String orientador) {
		this.orientador = orientador;
	}

	public Double getResultado() {
		return resultado;
	}

	public void setResultado(Double resultado) {
		this.resultado = resultado;
	}
	
	

}
