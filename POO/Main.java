import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o montante: ");
        double mont = ler.nextDouble();
        System.out.println("Informe a taxa de juros mensal");
        double jurosMensal = ler.nextDouble();

        boolean resp = true;
        double TotalInvestimento = 0;
        do{
        
            TotalInvestimento = valorInicial(TotalInvestimento,mont, jurosMensal);

            System.out.printf("Saldo do investimento após 12 meses: %.2f",TotalInvestimento);
            System.out.println("\nDeseja processar mais um ano? true / false");
            resp = ler.nextBoolean();

        }while(resp);
    }

    public static double valorInicial( double TotalInvestimento, double mont, double juros){
        ClaudioMath cm = new ClaudioMath();
        double total = cm.calcularJuros(TotalInvestimento, mont, juros);
        return total;
    }
}
