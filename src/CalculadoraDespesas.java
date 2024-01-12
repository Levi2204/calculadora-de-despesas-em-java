import java.util.Scanner;

public class CalculadoraDespesas {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        double faturaTotal = 0;
        double guardadoTotal = 0;
        System.out.println("Bem vindo a calculadora de despesas bancárias");
        System.out.println("------------------------------------------");
        System.out.print("Digite quantos bancos você tem faturas abertas no momento:");
        int qtdBancos = num.nextInt();
        for (int i = 1; i <= qtdBancos; i++){
            System.out.printf("Digite o valor da fatura no banco %d: ", i);
            double fatura = num.nextDouble();
            faturaTotal += fatura;

        }
        System.out.println("------------------------------------------");
        System.out.printf("A sua dívida total é de %.2f reais%n", faturaTotal);
        System.out.println("------------------------------------------");

        while(true){
            System.out.print("Você tem dinheiro guardado?(1 = Sim | 2 = Não):");
            int escolha = num.nextInt();
            if(escolha == 1){
                System.out.print("Digite a quantidade de lugares que você tem dinheiro guardado:");
                int qtdGuardado = num.nextInt();
                for (int i = 1; i<= qtdGuardado; i++){
                    System.out.printf("Digite a quantidade de dinheiro guardado no %d° lugar:", i);
                    double guardado = num.nextDouble();
                    guardadoTotal += guardado;
                }
                if(guardadoTotal - faturaTotal >= 0 ){
                    System.out.printf("Você tem %.2f reais sobrando", (guardadoTotal - faturaTotal));
                    break;

                }else{
                    System.out.printf("Você tem um prejuizo de %.2f reais", (guardadoTotal - faturaTotal) * -1);
                    break;
                }
            }else if(escolha == 2){
                System.out.printf("Você tem uma dívida de %.2f reais", faturaTotal);
                break;
            }else{
                System.out.println("------------------------------------------");
                System.out.println("Opção inválida");
                System.out.println("------------------------------------------");
            }

        }

    }
}
