package br.com.fatec;

public class Professor extends Pessoa {
  String diciplina;
  public Professor(String nome, Telefone telefone, String diciplina) {
    super(nome, telefone);
	this.diciplina = diciplina;
  }
  void exclusivoProfessor() {
	  System.out.println("Algo que somente o professor faz/sabe fazer:");
	  System.out.println("Reprovar...");
  }
}
