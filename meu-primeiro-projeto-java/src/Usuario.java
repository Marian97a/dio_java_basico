
public class Usuario {

    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Volume atual : " + smartTv.volume);
        smartTv.mudarCanal(17);
        System.out.println("Volume atual : " + smartTv.volume);



        System.out.println("TV Ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual : " + smartTv.canal);

        smartTv.ligar();
        System.out.println("Novo Status -> TV ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> TV desligada ? " + smartTv.ligada);
    }
}
