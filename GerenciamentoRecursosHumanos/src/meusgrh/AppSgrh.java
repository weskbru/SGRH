package meusgrh;

import modelo.Departamento;
import modelo.Funcionario;
import modelo.InformacoesDeContato;

public class AppSgrh {
	public static void main(String[] args) {
		// Criando departamentos
        Departamento departamentoRH = new Departamento(1, "Recursos Humanos", "Gerencia recursos humanos.");
        Departamento departamentoTI = new Departamento(2, "Tecnologia da Informacao", "Gerencia TI.");

        // Criando funcionários
        Funcionario funcionario1 = new Funcionario(1, "Joao", "Analista", "joao@email.com", departamentoRH);
        Funcionario funcionario2 = new Funcionario(2, "Maria", "Desenvolvedora", "maria@email.com", departamentoTI);

        // Adicionando informações de contato
        InformacoesDeContato contato1 = new InformacoesDeContato("123-456-7890", "Rua A, Cidade A");
        funcionario1.adicionarInformacoesDeContato(contato1);

        // Definindo responsável pelo departamento
        departamentoRH.definirResponsavel(funcionario1);
        departamentoTI.definirResponsavel(funcionario2);

        // Exibindo informações
        System.out.println("=========================================");
        System.out.println("          Sistema de Recursos Humanos");
        System.out.println("=========================================");
        System.out.println("Funcionario 1:\n" + funcionario1);
        System.out.println("-----------------------------------------");
        System.out.println("Funcionario 2:\n" + funcionario2);
        System.out.println("-----------------------------------------");
        System.out.println("Departamento RH:\n" + departamentoRH);
        System.out.println("-----------------------------------------");
        System.out.println("Departamento TI:\n" + departamentoTI);
        System.out.println("=========================================");
	}
}	
