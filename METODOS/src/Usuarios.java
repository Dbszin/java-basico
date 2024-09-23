
public class Usuarios {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();


        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual  : " + smartTv.volume);


        smartTv.mudarCanal(13);
        System.out.println("Canal Atual : " + smartTv.canal);



        System.out.println("Tv Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual? " +smartTv.canal);
        System.out.println("Volume Atual " +smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status - > TV Ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status - > Tv Ligada? " + smartTv.ligada);






















    }
}