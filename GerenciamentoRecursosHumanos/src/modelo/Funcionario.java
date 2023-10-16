package modelo;

public class Funcionario {
	private int id;
	private String nome;
	private String cargo;
	private String email;

	
	
	
	
	public Funcionario(int id, String nome, String cargo, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.cargo = cargo;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", nome=" + nome + ", cargo=" + cargo + ", email=" + email + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
