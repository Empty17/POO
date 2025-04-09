package br.com.joaocarloslima.store.model;

public class Computador {
    private PlacaMae placaMae;
    private Cpu cpu;
    private Ram ram;
    private Fonte fonte;



    public Computador(PlacaMae placaMae, Cpu cpu, Ram ram, Fonte fonte) {
        this.placaMae = placaMae;
        this.cpu = cpu;
        this.ram = ram;
        this.fonte = fonte;
    }

    public String status() {
        if (placaMae == null || cpu == null || ram == null || fonte == null) {
            return "Computador incompleto";
        }
        if (!placaMae.compativel(cpu)) {
            return "Incompatibilidade entre CPU e Placa Mãe";
        }
        if (!placaMae.compativel(ram)) {
            return "Incompatibilidade entre RAM e Placa Mãe";
        }
 
        int consumoTotal = placaMae.getConsumo() + cpu.getConsumo() + ram.getConsumo();
        if (consumoTotal > fonte.getPotencia()) {
            return "Fonte insuficiente para o sistema";
        }
 
        return "Computador completo e funcionando";
    }

    public double precoTotal() {
        double total = 0;
        if (placaMae != null) total += placaMae.getPreco();
        if (cpu != null) total += cpu.getPreco();
        if (ram != null) total += ram.getPreco();
        if (fonte != null) total += fonte.getPreco();
        return total;
    }

    public void setPlacaMae(PlacaMae placaMae) {
        this.placaMae = placaMae;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public void setFonte(Fonte fonte) {
        this.fonte = fonte;
    }

    public PlacaMae getPlacaMae() {
        return placaMae;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public Ram getRam() {
        return ram;
    }

    public Fonte getFonte() {
        return fonte;
    }

    
   
}