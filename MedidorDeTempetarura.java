import java.util.Scanner;

public class MedidorDeTempetarura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regiao;
        System.out.print("Informe a sua região geográfica: ");
        regiao = scanner.nextLine();

        System.out.println("Estaremos avaliando a média de temperatura da água do(a) " + regiao + " neste programa.");


        double somaTemperaturas = 0;
        int contadorDeTemperaturasValidas = 0;

        System.out.println("Digite as temperaturas da água para cada hora do dia: (Obs: Contabilizaremos 12 temperaturas em um dia)");

        for (int i = 1; i <= 12; i++) {
            double temperatura;

            do {
                System.out.print("Temperatura " + i + ": ");
                temperatura = scanner.nextDouble();
                if (temperatura < 4 || temperatura > 10) {
                    System.out.println("Temperatura inválida. Digite uma temperatura entre 4º C e 10º C.");
                }

            } while (temperatura < 4 || temperatura > 10);

            somaTemperaturas += temperatura;
            contadorDeTemperaturasValidas++;

        }

            double mediaTemperaturas = somaTemperaturas / contadorDeTemperaturasValidas;
            System.out.println("A média das temperaturas é: " + mediaTemperaturas + "º C");

        scanner.close();

        }


    }
