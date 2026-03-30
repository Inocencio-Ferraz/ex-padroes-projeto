package Adapter;

public class Main {
    public static void main(String[] args) {

        ControleUniversal samsung  = new SamsungAdapter(new TvSamsungApi());
        MiRemoteApp c1 = new MiRemoteApp(samsung);
        c1.assistir();
        c1.xau();

        System.out.println("---------------------------------------------------------------------------------------");

        ControleUniversal lg = new LgAdapter(new TvLgApi());
        MiRemoteApp c2 = new MiRemoteApp(lg);
        c2.assistir();
        c2.xau();

        System.out.println("---------------------------------------------------------------------------------------");
        ControleUniversal Ar = new ArCondicionadoAdapter(new ArCondicionadoApi());
        MiRemoteApp c3 = new MiRemoteApp(Ar);
        c3.assistir();
        c3.xau();
    }
}
