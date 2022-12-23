public class Usuario {
    public static void main(String[] args, String string) throws Exception {
    
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("TV ligada? " + smartTv.ligada + " Novo status");

        smartTv.desligar();
        System.out.println("TV ligada? " + smartTv.ligada + " Novo status");

        //smartTv.aumentarVolume();
        //System.out.println(smartTv.volume);

    }
}
