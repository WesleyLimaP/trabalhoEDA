package linkedList;

import linkedList.Cor;
import linkedList.LinkedList;

import java.util.Scanner;
public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        int opcao;
        do {
            exibirMenu();
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do teclado

            switch (opcao) {
                case 1:
                    inserir(linkedList);
                    break;
                case 2:
                    linkedList.imprimirListEspera();
                    break;
                case 3:
                    linkedList.atenderPAciente();
                    break;
                case 4:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 4);

    }
    public static void exibirMenu () {
        System.out.println("\n===== MENU =====");
        System.out.println("1 – Adicionar paciente à fila");
        System.out.println("2 – Mostrar pacientes na fila");
        System.out.println("3 – Chamar paciente");
        System.out.println("4 – Sair");
    }

    public static void inserir (LinkedList linkedList) {
        System.out.print("Digite  a cor do cartão: (A/V) ");
        char cor = scanner.next().charAt(0);
        if(cor == 'A'){
            linkedList.inserir(Cor.AMARELO);
        }else {
            linkedList.inserir(Cor.VERMELHO);
        }

        System.out.println("Paciente adicionado à fila com sucesso.");
    }
}

