package Hierarquiadeclasse;

public class EX1superclasseanimal {
	
	private String nome;
	private String emitesom;
	private String devecorrer;
	private String sobeemarvore;
	private int  idade;
	
	public EX1superclasseanimal(String nome, String emitesom,String devecorrer,int idade, String sobeemarvore)
	{
		this.nome=nome;
		this.emitesom=emitesom;
		this.devecorrer=devecorrer;
		this.sobeemarvore=sobeemarvore;
		this.idade=idade;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmitesom() {
		return emitesom;
	}

	public void setEmitesom(String emitesom) {
		this.emitesom = emitesom;
	}

	public String getDevecorrer() {
		return devecorrer;
	}

	public void setDevecorrer(String devecorrer) {
		this.devecorrer = devecorrer;
	}

	public String getSobeemarvore() {
		return sobeemarvore;
	}

	public void setSobeemarvore(String sobeemarvore) {
		this.sobeemarvore = sobeemarvore;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	
}
