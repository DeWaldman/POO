package br.com.fatec;

public class Aluno extends Pessoa {
  public String RA;
  public Aluno(String nome, Telefone telefone, String ra) {
	  super(nome, telefone);
	  this.nome = nome;
	  this.RA=ra;
  }
  
  @Override
  public void imprimaInfo() {
    super.imprimaInfo();
	System.out.println("RA: "+RA);
	}
}
