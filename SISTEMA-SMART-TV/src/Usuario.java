public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();
        

        smartTv.diminuirVolume(); 
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();;
        System.out.println("Volume Atual: " +smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("Canal Atual: " +smartTv.canal);


        
        
        System.out.println("TV Ligada? " + smartTv.ligada);

        smartTv.ligar ();
        System.err.println("Novo Status -> TV Ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.err.println("Novo Status -> TV Ligada? " + smartTv.ligada);
    }

}