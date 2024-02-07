import java.util.Scanner;

/**
 * Aula0602
 */
public class ex1 {

    public static void main(String[] args) {
        int vetor_tst[]={8,4,0,9,3,2,6,5};
        int fun,x;

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o valor a ser encontrado: ");
        x = ler.nextInt();
        fun = buscaSequencial(8, vetor_tst,x);

        if (fun == -1 ){
            System.out.println("O valor não foi encontrado!");
        }
        else{
            System.out.println("\n" + "Valor encontrado no indice "+fun);
        }
    }

    private static int buscaSequencial(int tamanho, int vetor[], int p) {
        int i;
        for (i = 0; i < tamanho; i++) {
            if (vetor[i] == p) {
                return i;
            }
        }
        return -1;
    }
}
