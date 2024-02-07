
public class ClaudioMath {
    private int meses = 12;

    public double calcularJuros(double valorInicial,double montante, double taxa){
        double total = valorInicial;
        double investimentoMeses = montante;
        taxa = taxa * 1.01;
        for (int i = 0; i < meses ; i++) {
            total = investimentoMeses + (total * taxa) ;
        }
        return total;

    }

   
}