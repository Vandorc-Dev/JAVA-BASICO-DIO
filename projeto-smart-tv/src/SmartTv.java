public class SmartTv {
    //Setando variáveis com estados iniciais
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    //Metodos ligar e desligar
    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    //Metodos aumentar e diminuir volume
    public void aumentarVolume(){
        volume++;
    }

    public void diminuirVolume(){
        volume--;
    }
}
