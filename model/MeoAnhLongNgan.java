package tonghopmvc.model;


public class MeoAnhLongNgan extends Meo implements TiengKeu {


    public MeoAnhLongNgan() {
        setTiengKeu(new TiengKeu() {
            @Override
            public void taoTiengKeu() {
                System.out.println("Hhahahahahaha");
            }
        });
    }

    public MeoAnhLongNgan(int ID, String tenMeo, int tuoi, String gioiTinh) {
        super(ID, tenMeo, tuoi, gioiTinh);
    }

    @Override
    public void nhapThongTinMeo() {
        super.nhapThongTinMeo();
    }
}
