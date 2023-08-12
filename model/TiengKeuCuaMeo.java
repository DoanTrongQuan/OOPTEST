package tonghopmvc.model;

public class TiengKeuCuaMeo implements  TiengKeu{
    private String tiengkeu;

    public TiengKeuCuaMeo(String tiengkeu) {
        this.tiengkeu = tiengkeu;
    }

    @Override
    public void taoTiengKeu() {
            System.out.println(tiengkeu);
    }
}
