package br.com.fatec;

public class Pessoa {
  public String nome;
  public Telefone telefone;
  
  public Pessoa(String nome, Telefone telefone) {
	  this.nome = nome;
	  this.telefone = telefone;
  }
  public void imprimaInfo() {
    System.out.println("Nome: "+nome+"\n"+"Telefone: "+telefone.numTelefone);
  }
}
