package Hierarquiadeclasse;

public class EX1objeto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EX1classecachorro xxx = new EX1classecachorro("Ti�o","latido", "corre",52,"n�o sobe em �rvores","cachorro");
		EX1classecavalo yyy = new EX1classecavalo("pocot�","relinxo","corre", 12,"n�o sobe em �rvores","cavalo");
		EX1classepregui�a zzz =new EX1classepregui�a("presidente","indefinido","n�o corre",65,"sobe em �rvores","preguica");
	System.out.println(xxx.getNome());
	System.out.println(yyy.getIdade());
	System.out.println(zzz.getDevecorrer());
	}
}
