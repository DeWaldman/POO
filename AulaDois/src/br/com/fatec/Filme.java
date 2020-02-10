package br.com.fatec;

public class Filme {
	
  public String nome, genero, origem;
  public Elenco elenco ;
  
  public Filme(String nome, String genero, String origem, Elenco elenco) {
	this.nome = nome; this.genero = genero; this.origem = origem; this.elenco = elenco;  
  }
}
