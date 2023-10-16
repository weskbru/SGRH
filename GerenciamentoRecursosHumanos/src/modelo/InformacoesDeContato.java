package modelo;

public class InformacoesDeContato {
	private String telefone;
	private String endereco;

	// Construtor
	public InformacoesDeContato(String telefone, String endereco) {
		this.telefone = telefone;
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "InformacoesDeContato [telefone=" + telefone + ", endereco=" + endereco + "]";
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
}
