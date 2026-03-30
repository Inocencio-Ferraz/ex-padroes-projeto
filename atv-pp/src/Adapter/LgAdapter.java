package Adapter;

public class LgAdapter implements ControleUniversal{

    private TvLgApi tv;

    public LgAdapter(TvLgApi tv){
        this.tv= tv;
    }

    @Override
    public void ligar(){
        tv.ligarTv();
    }

    @Override
    public void desligar(){
        tv.DesligarTv();
    }

    @Override
    public void aumentarVolume(){
        tv.aumentarSom();
    }

    @Override
    public void diminuirVolume(){
        tv.reduzirSom();
    }
}

