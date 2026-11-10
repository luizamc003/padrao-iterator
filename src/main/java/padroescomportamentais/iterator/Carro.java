package padroescomportamentais.iterator;

public class Carro {

    private String placa;
    private boolean ativo;

    public Carro(String placa, boolean ativo) {
        this.placa = placa;
        this.ativo = ativo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
