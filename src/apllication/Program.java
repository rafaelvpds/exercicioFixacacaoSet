package apllication;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> turmaA = new HashSet<>();
		Set<Integer> turmaB = new HashSet<>();
		Set<Integer> turmaC = new HashSet<>();
		System.out.println("How many students for course A?");
		int numAlunos = sc.nextInt();
		for (int i = 0; i < numAlunos; i++) {
			System.out.println("Alunos: ");
			int codAluno = sc.nextInt();

			turmaA.add(codAluno);

		}

		System.out.println("How many students for course B?");
		numAlunos = sc.nextInt();

		for (int i = 0; i < numAlunos; i++) {
			int codAluno = sc.nextInt();

			turmaB.add(codAluno);
		}

		System.out.println("How many students for course c?");
		numAlunos = sc.nextInt();

		for (int i = 0; i < numAlunos; i++) {
			int codAluno = sc.nextInt();

			turmaC.add(codAluno);
		}

		Set<Integer> alunosRepitidos = new HashSet<>(turmaA);
		alunosRepitidos.retainAll(turmaC);
		alunosRepitidos.retainAll(turmaB);

		for (Integer alunosRe : alunosRepitidos) {
			System.out.println(alunosRe);
		}

		System.out.println("Alunos que fazem mais de um curso: " + alunosRepitidos);

		Set<Integer> totalAlunos = new HashSet<>(turmaA);
		totalAlunos.addAll(turmaB);
		totalAlunos.addAll(turmaC);

		System.out.println();
		System.out.println("Lista de Alunos: ");
		for (Integer listAluno : totalAlunos) {
			System.out.println(listAluno);
		}
		System.out.println();

		System.out.println("Total de Aluno: " + totalAlunos.size());

		sc.close();

	}

}
