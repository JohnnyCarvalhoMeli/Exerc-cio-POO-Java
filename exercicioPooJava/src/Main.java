import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static ArrayList<ContaBancaria> listaContas;
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        DataConta data = new DataConta();
        Random random = new Random();
        listaContas = new ArrayList<>();

        System.out.println("\n** ABERTURA DE CONTA BANCÁRIA **");


        boolean controlador = false;
        while (controlador)
        System.out.println("\nDigite a data de abertura da conta!");
        System.out.print("\nDia: ");
        data.setDia(input.nextInt());input.nextLine();
        System.out.print("\nMês: ");
        data.setMes(input.nextInt());input.nextLine();
        System.out.print("\nAno: ");
        data.setAno(input.nextInt());input.nextLine();

        if (data.getMes() == 2 && data.getDia() > 29 ) {
            System.out.println("\nO mês de fevereiro tem no máximo 29 dias!");
            System.out.println("\nVocê deve alterar a data, digite o número equivalente com a opção desejada.");
            System.out.println("\nAlterar somente o dia [1]\nAlterar data completa [2]");
            System.out.print("Digite a opção desejada: ");
            int opcao = input.nextInt();input.nextLine();
            if (opcao == 1) {
                System.out.print("\nDia: ");
                data.setDia(input.nextInt());input.nextLine();
                controlador = false;
            } else if (opcao == 2) {
                controlador = true;
            }
            controlador = false;

        }

        int contador = 0;
        System.out.print("Quantas listaContas deseja criar? ");
        contador = input.nextInt();input.nextLine();


        for (int i = 0; i < contador; i++) {
            ContaBancaria listaContaBancaria = new ContaBancaria();
            int posicaoIndex = i+1;

            System.out.println("\nDigite os dados do titular da "+posicaoIndex+"º conta: ");

            listaContaBancaria.setDataAbertura(data.getDia()+"/"+data.getMes()+"/"+data.getAno());

            listaContaBancaria.setId(posicaoIndex);

            System.out.print("\nNome: ");
            listaContaBancaria.setNomeTitular(input.nextLine());

            listaContaBancaria.setNumero(random.nextLong(9000000000L));

            listaContaBancaria.setAgencia(random.nextLong(9000L));

            listaContaBancaria.depositar(100.00);


            listaContas.add(listaContaBancaria);

        }
        for (ContaBancaria contas : listaContas ) {
            System.out.println("\n" + contas.recuperarDadosParaImpressao());
        }
    }
}