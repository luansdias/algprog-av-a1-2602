import java.util.Scanner;
//vi - vf/vi*100
public class Prova {
    public static void main(String[] args) {

        String nome;
        double cotacao;
        int perda;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o nome da Commodity:");
        nome = leia.nextLine();

        System.out.println("Digite a cotação atual do contrato:");
        cotacao = leia.nextDouble();
        while(cotacao <= 0) {
            System.out.println("Cotação inválida. O valor precisa ser superior a 0");
            cotacao = leia.nextDouble();
        }

        System.out.println("Qual a perda estimada da safra?");
        perda = leia.nextInt();
        while(perda < 0 || perda > 100) {
            System.out.println("Erro: Percentual de perda de safra invalido. Digite Novamente");
            perda = leia.nextInt();
        }

        double novaCota = cotacao + (perda * 0.10);

        System.out.println("====RESULTADOS====");
        System.out.println("NOME DA COMMODITY: " + nome);
        System.out.println("COTAÇÃO ATUAL U$$: " + cotacao);
        System.out.println("COTAÇÃO PROJETADA U$$: " + novaCota);
        if(perda > 15 && cotacao > 50) {
            System.out.println("ALERTA DE ALTA VOLATILIDADE");
        }

        leia.close();
            }
        }