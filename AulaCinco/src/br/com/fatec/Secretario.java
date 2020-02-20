package br.com.fatec;

public class Secretario extends Pessoa{
    public String HorarioTrabalho;
	public Secretario(String nome, Telefone telefone, String HorarioTrabalho) {
		super(nome, telefone);
		this.HorarioTrabalho = HorarioTrabalho;
	};
	
	@Override
	public void imprimaInfo() {
	  super.imprimaInfo();
	}

}
