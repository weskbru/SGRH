package modelo;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
	private int id;
	private String nome;
	private String descricao;
	private List<Funcionario> funcionarios; // Lista de funcionários no departamento
	private Funcionario responsavel; // Funcionário responsável pelo departamento

	public Departamento(int id, String nome, String descricao) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.funcionarios = new ArrayList<>();
	}

	@Override
	public String toString() {
		return "Departamento [id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", funcionarios="
				+ funcionarios + ", responsavel=" + responsavel + "]";
	}

	// Adicionar um funcionário ao departamento
	public void adicionarFuncionario(Funcionario funcionario) {
		funcionarios.add(funcionario);
	}

	// Remover um funcionário do departamento
	public void removerFuncionario(Funcionario funcionario) {
		funcionarios.remove(funcionario);
	}

	// Definir o responsável pelo departamento
	public void definirResponsavel(Funcionario funcionario) {
		this.responsavel = funcionario;
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public Funcionario getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Funcionario responsavel) {
		this.responsavel = responsavel;
	}

}
