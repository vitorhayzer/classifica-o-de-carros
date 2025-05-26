public class Esportivo extends Movel{

    private int cilindradas;
    private int numPassageiros;

    public Esportivo(){
        cilindradas = 0;
        numPassageiros = 0;
    }

    public int getCilindradas() {return cilindradas;}
    public int getNumPassageiros() {return numPassageiros;}

    public void setCilindradas(int cilindradas) {
        String tempS = cilindradas + "";
        if (tempS != null & cilindradas != 0) {
            if (cilindradas>0) {
                this.cilindradas = cilindradas;
            }else System.out.println("inválido!");
        }else System.out.println("inválido!");
    }
    
    public void setNumPassageiros(int numPassageiros) {
        if (numPassageiros >= 1 & numPassageiros <= 4) {
            this.numPassageiros = numPassageiros;
        } else System.out.println("inválido!");
    }

    @Override
    public String toString() {
        
        return "Esportivo - " + super.toString() + " [cilindradas: "+ cilindradas +", num. passageiros: " + numPassageiros+ "]";
    }

}