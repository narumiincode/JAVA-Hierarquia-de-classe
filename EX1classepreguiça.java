package Hierarquiadeclasse;

public class EX1classepregui�a extends EX1superclasseanimal{
	
	private String preguica;
	
	public EX1classepregui�a(String nome, String emitesom, String devecorrer,int idade,String sobeemarvore, String preguica)
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