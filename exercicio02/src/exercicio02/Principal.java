package exercicio02;

import java.util.Scanner;

public class Principal{
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno:");
        String nome = scanner.nextLine();

        System.out.println("Digite a matéria do aluno:");
        String materia = scanner.nextLine();

        System.out.println("Digite a sigla da matéria:");
        String siglaMateria = scanner.nextLine();

        System.out.println("Digite o período que está cursando:");
        String periodo = scanner.nextLine();

        System.out.println("Digite a idade do aluno:");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer após a leitura de int

        System.out.println("Digite a matrícula do aluno:");
        String matricula = scanner.nextLine();
        
        
       
        Aluno aluno = new Aluno(nome, materia, siglaMateria, periodo, idade, matricula);

        System.out.println("\nDados do aluno:");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Matéria: " + aluno.getMateria());
        System.out.println("Sigla da Matéria: " + aluno.getSiglaMateria());
        System.out.println("Período: " + aluno.getPeriodo());
        System.out.println("Idade: " + aluno.getIdade());
        System.out.println("Matrícula: " + aluno.getMatricula());

        scanner.close();
    }
}
