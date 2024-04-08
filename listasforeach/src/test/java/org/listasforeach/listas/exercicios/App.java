package org.listasforeach.listas.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        List<Funcionario> list = new ArrayList<>();

        System.out.println("Insira o número de pessoas: ");
        int n = scanner.nextInt();

        for (int i=0; i<n; i++) {
            System.out.println();
            System.out.println("Funcionário #" + (i + 1) + ":");
            System.out.println("Digite seu ID:");
            int id = scanner.nextInt();
            while (hasId(list, id)){
                System.out.println("ID já existente!");
                System.out.println("Digite seu ID:");
                id = scanner.nextInt();
            }

            System.out.println("Digite seu nome:");
            scanner.nextLine();
            String nome = scanner.nextLine();

            System.out.println("Digite seu salário:");
            double salario = scanner.nextDouble();

            Funcionario funcionario = new Funcionario(id, nome, salario);
            list.add(funcionario);
        }

        System.out.println();

        System.out.println("Escolha um funcionario para ter aumento: ");
        int id = scanner.nextInt();

        // - Funcionario funcionario = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        Integer pos = posicao(list, id);
        if (pos == null){
            System.out.println("Este ID Não existe!");
        }
        else {
            System.out.println("Digite a porcentagem de aumento: ");
            double percentual = scanner.nextDouble();
            list.get(pos).aumentoSalario(percentual);
            // - funcionario.aumentoSalario(percentual);
        }

        System.out.println();
        System.out.println("Lista de funcionários");
        for (Funcionario funcionario : list){
            System.out.println(funcionario);
            System.out.println();
        }

    }

    public static Integer posicao(List<Funcionario> list, int id){
        for (int i=0; i < list.size(); i++){
            if (list.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }

    public static boolean hasId(List<Funcionario> list, int id){
        Funcionario funcionario = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return funcionario != null;
    }
}
