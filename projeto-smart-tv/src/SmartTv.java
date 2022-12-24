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

    //mudar canal

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    //Metodos aumentar e diminuir volume
    public void aumentarVolume(){
        volume++;
    }

    public void diminuirVolume(){
        volume--;
    }
}
