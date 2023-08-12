package tonghopmvc.controller;

import tonghopmvc.model.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class meocontroller {
    private List<Meo> danhSachMeo;
    private Scanner sc = new Scanner(System.in);

    public meocontroller() {
        danhSachMeo = new ArrayList<>();
    }
    public void themMeo(){
        System.out.println("========LOAI MEO========");
        System.out.println("1. Meo Anh Long Dai.");
        System.out.println("2. Meo Anh Long ngan.");
        System.out.println("3. Meo Ba Tu.");
        System.out.println("4. Meo Nga.");
        int luaChon = sc.nextInt();
        switch (luaChon){
            case 1:
                Meo meo1 = new MeoAnhLongDai();
                meo1.nhapThongTinMeo();
                danhSachMeo.add(meo1);
                break;
            case 2:
                Meo meo2 = new MeoAnhLongNgan();
                meo2.nhapThongTinMeo();
                danhSachMeo.add(meo2);
                break;
            case 3:
                Meo meo3 = new MeoBaTu();
                meo3.nhapThongTinMeo();
                danhSachMeo.add(meo3);
                break;
            case 4:
                Meo meo4 = new MeoNga();
                meo4.nhapThongTinMeo();
                danhSachMeo.add(meo4);
                break;
            default:
                System.out.println("Lua chon khong hop le.");
                return;
        }
        for (Meo i : danhSachMeo) {
            i.inThongTinMeo();
            i.taoTiengKeu();
        }

        System.out.println("Them meo thanh cong");
    }

    public void xoaMeoTheoID(int id) {
        Iterator<Meo> iterator = danhSachMeo.iterator();
        boolean check = false;
        while (iterator.hasNext()) {
            Meo meo = iterator.next();
            if (meo.getID() == id) {
                iterator.remove();
                System.out.println("Xoa meo thanh cong");
                check = true;
            }
        }
        if (!check) {
            System.out.println("Khong tim thay meo voi ID da nhap.");
        }
        for (Meo i : danhSachMeo) {
            i.inThongTinMeo();
            i.taoTiengKeu();
        }
    }

    public void hienThiToanBoMeo(){
        for (Meo i: danhSachMeo ) {
            i.inThongTinMeo();
            i.taoTiengKeu();
        }
    }
    public void hienThiMeoTheoID(int idmeo){
        boolean check = false;
        for (Meo j: danhSachMeo){
            if(j.getID() == idmeo){
                j.inThongTinMeo();
                j.taoTiengKeu();
                check = true;
                break;
            }
        }
        if(check == false){
            System.out.println("Khong tim thay id");
        }
    }

    public void thayDoiTiengKeuTheoID(int id) {
        boolean check = false;
        for (Meo meo : danhSachMeo) {
            if (meo.getID() == id) {
                System.out.print("Nhập tiếng kêu mới: ");
                sc.nextLine();
                String tk = sc.nextLine();
                meo.setTiengKeu(new TiengKeu() {
                    @Override
                    public void taoTiengKeu() {
                        System.out.println(tk);
                    }
                });
                System.out.println("Thay đổi tiếng kêu thành công!");
                check = true;
                break;
            }
        }

        if (!check) {
            System.out.println("Không tìm thấy mèo với ID đã nhập.");
        }

        for (Meo c : danhSachMeo) {
            c.inThongTinMeo();
            c.taoTiengKeu();
        }
    }
}
