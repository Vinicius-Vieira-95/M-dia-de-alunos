package Alunos;

import java.util.ArrayList;

//Crie classe Aluno que possui um nome String e um vetor de três notas como atributo.


public abstract class Aluno {
	
	protected String nome;
	protected ArrayList<Double>notas;
	
	// Faça um construtor para inicializar o nome e as notas no vetor 
	
	public Aluno(String nome, Double n1, Double n2, Double n3) {
		
		this.setNome(nome);
		
		this.notas = new ArrayList<>();
		this.notas.add(n1);
		this.notas.add(n2);
		this.notas.add(n3);
		
	}
	
	//Faça um método de get e set para o atributo nome.

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//Essa classe possui um método “calcularMediaGeral”, que calcula e retorna o valor da média geral do aluno, porém a implementação do método fica a cargo de cada tipo de aluno 

	public abstract Double calcularMediaGral();
	
	public String toString() {
		return "Aluno {  nome = " + nome + " Notas = " + notas + "Média = " + calcularMediaGral() +"}";
		
	}
}
