package Alunos;

import java.util.ArrayList;

//Crie classe Aluno que possui um nome String e um vetor de tr�s notas como atributo.


public abstract class Aluno {
	
	protected String nome;
	protected ArrayList<Double>notas;
	
	// Fa�a um construtor para inicializar o nome e as notas no vetor 
	
	public Aluno(String nome, Double n1, Double n2, Double n3) {
		
		this.setNome(nome);
		
		this.notas = new ArrayList<>();
		this.notas.add(n1);
		this.notas.add(n2);
		this.notas.add(n3);
		
	}
	
	//Fa�a um m�todo de get e set para o atributo nome.

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//Essa classe possui um m�todo �calcularMediaGeral�, que calcula e retorna o valor da m�dia geral do aluno, por�m a implementa��o do m�todo fica a cargo de cada tipo de aluno 

	public abstract Double calcularMediaGral();
	
	public String toString() {
		return "Aluno {  nome = " + nome + " Notas = " + notas + "M�dia = " + calcularMediaGral() +"}";
		
	}
}
