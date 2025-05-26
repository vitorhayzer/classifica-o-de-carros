public class Carga extends Movel{

    private int volumeMaximo;
    private int pesomaximo;

    public Carga(){
        volumeMaximo = 0;
        pesomaximo = 0;
    }

    public int getPesomaximo() {return pesomaximo;}
    public int getVolumeMaximo() { return volumeMaximo;}

    public void setPesomaximo(int pesomaximo) {
        String tempS = pesomaximo + "";
        if (tempS != null & pesomaximo != 0) {
            if (pesomaximo>0) {
                this.pesomaximo = pesomaximo;
            }else System.out.println("inválido!");
        }else System.out.println("inválido!");
    }

    public void setVolumeMaximo(int volumeMaximo) {
        String tempS = volumeMaximo + "";
        if (tempS != null & volumeMaximo != 0) {
            if (volumeMaximo>0) {
                this.volumeMaximo = volumeMaximo;
            }else System.out.println("inválido!");
        }else System.out.println("inválido!");
    }

    @Override
    public String toString() {
        
        return "Carga - " + super.toString() + " [volume max: "+ volumeMaximo+ ", peso max"+ pesomaximo+ "]";
    }

}