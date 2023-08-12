package tonghopmvc.model;

import ontapmvc.inputhelper.Input;

public abstract class Meo {
    private int ID;
    private String TenMeo;
    private int tuoi;
    private String GioiTinh;
    private TiengKeu tiengKeu;

    public Meo(int ID, String tenMeo, int tuoi, String gioiTinh) {
        this.ID = ID;
        TenMeo = tenMeo;
        this.tuoi = tuoi;
        GioiTinh = gioiTinh;
        this.tiengKeu = tiengKeu;
    }

    public Meo() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTenMeo() {
        return TenMeo;
    }

    public void setTenMeo(String tenMeo) {
        TenMeo = tenMeo;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        GioiTinh = gioiTinh;
    }

    public TiengKeu getTiengKeu() {
        return tiengKeu;
    }

    public void setTiengKeu(TiengKeu tiengKeu) {
        this.tiengKeu = tiengKeu;
    }

    public void taoTiengKeu(){
        tiengKeu.taoTiengKeu();
        //return null;
    }

    public void inThongTinMeo(){
        System.out.print("ID = " + this.ID + ", TenMeo = "
                + this.TenMeo + ", Tuoi = " + this.tuoi + ", GioiTinh = " + this.GioiTinh + ", ");
    }
    public void nhapThongTinMeo(){
        ID = Input.InputInt("Nhap ma meo: ","Nhap sai khoang gia tri","Nhap sai kieu gia tri:",0);
        TenMeo = Input.InputString("Nhap ten meo: ","Nhap sai so luong ky tu",1,10);
        tuoi = Input.InputInt("Nhap tuoi cua meo: ","Nhap sai khoang gia tri","Nhap sai kieu du lieu",0);
        GioiTinh = Input.InputString("Nhap gioi tinh:","Nhap sai so luong ky tu",1,10);
    }
}
