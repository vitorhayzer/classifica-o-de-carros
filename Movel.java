public class Movel{

    protected String fabricante;
    protected int numeroRodas;
    protected int anoFabricaçao;
    private int velocidade;

    public Movel(){
        fabricante = "";
        numeroRodas = 0;
        anoFabricaçao = 0;
        velocidade = 0;
    }

    public String getFabricante() {return fabricante;}
    public void setFabricante(String fabricante) {
        if (fabricante != null & fabricante != "") {
            this.fabricante = fabricante;
        }else System.out.println("fabricante inválido!");
    }

    public int getNumeroRodas() {return numeroRodas;}
    public void setNumeroRodas(int numeroRodas) {
        if (numeroRodas != (Integer)null & numeroRodas != 0) {
            if (numeroRodas>0) {
                this.numeroRodas = numeroRodas;
            }else System.out.println("num. rodas inválido!");
        }else System.out.println("num. rodas inválido!");
    }

    public int getAnoFabricaçao() {return anoFabricaçao;}
    public void setAnoFabricaçao(int anoFabricaçao) {
        if (anoFabricaçao != (Integer)null & anoFabricaçao != 0) {
            if (anoFabricaçao>0) {
                this.anoFabricaçao = anoFabricaçao;
            }else System.out.println("ano inválido!");
        }else System.out.println("ano inválido!");
    }

    public int getVelocidade() {return velocidade;}
    public void setVelocidade(int velocidade) {
        if (velocidade != 0) {
            if (velocidade>0) {
                this.velocidade = velocidade;
            }else System.out.println("velocidade inválida!");
        }else System.out.println("velocidade inválida!");
    }

    @Override
    public String toString() {
        
        return "[" +"num. rodas: "+ numeroRodas +", fabricante: "+ fabricante +", ano fabricaçao: "+
        anoFabricaçao +", velocidade: "+ getVelocidade() +"]";
    }

}