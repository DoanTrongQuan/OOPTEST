package tonghopmvc.model;
public class MeoAnhLongDai  extends Meo implements TiengKeu{
    public MeoAnhLongDai() {
        setTiengKeu(new TiengKeu() {
            @Override
            public void taoTiengKeu() {
                System.out.println("Huhuhuhuhuhu");
            }
        });
    }
    public MeoAnhLongDai(int ID, String tenMeo, int tuoi, String gioiTinh) {
        super(ID, tenMeo, tuoi, gioiTinh);
    }
    @Override
    public void nhapThongTinMeo() {
        super.nhapThongTinMeo();
    }
}
