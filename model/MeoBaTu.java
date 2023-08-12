package tonghopmvc.model;


public class MeoBaTu extends Meo {
    public MeoBaTu(int ID, String tenMeo, int tuoi, String gioiTinh) {
        super(ID, tenMeo, tuoi, gioiTinh);

    }

    public MeoBaTu() {
        setTiengKeu(new TiengKeu() {
            @Override
            public void taoTiengKeu() {
                System.out.println("Khic khic khic");
            }
        });
    }
    @Override
    public void nhapThongTinMeo() {
        super.nhapThongTinMeo();
    }
}
