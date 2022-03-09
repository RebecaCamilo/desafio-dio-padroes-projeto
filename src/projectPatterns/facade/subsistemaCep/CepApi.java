package projectPatterns.facade.subsistemaCep;

public class CepApi {
	
	private static CepApi cep = new CepApi();
	
	private CepApi() {
		super();
	}
	
	public static CepApi getInstancia() {
		return cep;
	}
	
	public String recuperaCidade(String cep) {
		return "Manaus";
	}
	
	public String recuperaEstado(String cep) {
		return "Amazonas";
	}

}
