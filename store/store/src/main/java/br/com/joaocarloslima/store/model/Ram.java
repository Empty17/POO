package br.com.joaocarloslima.store.model;

public class Ram extends Componente{
    protected TipoMemoria tipoMemoria;
    protected int TamanhoGB;

    public Ram(Long id, String nome, int consumo, double preco, TipoMemoria tipoMemoria, int tamanhoGB) {
        super(id, nome, consumo, preco);
        this.tipoMemoria = tipoMemoria;
        TamanhoGB = tamanhoGB;
    }
 
    public TipoMemoria getTipo() { return tipoMemoria; }
    public void setTipo(TipoMemoria tipo) { this.tipoMemoria = tipo; }
 
    public int getTamanhoGb() { return TamanhoGB; }
    public void setTamanhoGb(int tamanhoGb) { this.TamanhoGB = tamanhoGb; }
 

    

  
}
