package tonghopmvc.model;

public class MeoNga extends Meo{

    public MeoNga(int ID, String tenMeo, int tuoi, String gioiTinh, String tenLoai4) {
        super(ID, tenMeo, tuoi, gioiTinh);


    }

    public MeoNga() {
        setTiengKeu(new TiengKeu() {
            @Override
            public void taoTiengKeu() {
                System.out.println("oaoaoaoaoaoao");
            }
        });
    }

    @Override
    public void nhapThongTinMeo() {
        super.nhapThongTinMeo();
    }
}
