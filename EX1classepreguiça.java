package Hierarquiadeclasse;

public class EX1classepreguiça extends EX1superclasseanimal{
	
	private String preguica;
	
	public EX1classepreguiça(String nome, String emitesom, String devecorrer,int idade,String sobeemarvore, String preguica)
	{
		super(nome,emitesom,devecorrer,idade,sobeemarvore);
		this.preguica=preguica;
	}

	public String getPreguica() {
		return preguica;
	}

	public void setPreguica(String preguica) {
		this.preguica = preguica;
	}

}