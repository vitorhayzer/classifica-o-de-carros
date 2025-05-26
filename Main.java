public class Main {
    public static void main(String[] args) {
        
        Movel motoca = new Movel();
        motoca.numeroRodas = 2;
        motoca.fabricante = "Yamaha";
        motoca.anoFabricaçao = 2008;
        motoca.setVelocidade(145);
        System.out.println(motoca.toString());
        
        Esportivo gtr = new Esportivo();
        gtr.anoFabricaçao = 2021;
        gtr.fabricante = "seila";
        gtr.numeroRodas = 4;
        gtr.setCilindradas(2000);
        gtr.setNumPassageiros(4);
        gtr.setVelocidade(300);
        System.out.println(gtr.toString());

        Carga caminhao = new Carga();
        caminhao.anoFabricaçao = 2020;
        caminhao.fabricante = "naosei";
        caminhao.numeroRodas = 8;
        caminhao.setPesomaximo(15000000);
        caminhao.setVolumeMaximo(50000);
        caminhao.setVelocidade(200);
        System.out.println(caminhao.toString());

    }
}