package tonghopmvc.view;

import tonghopmvc.controller.meocontroller;
import tonghopmvc.model.TiengKeu;

import java.util.Scanner;

public class meoview {
    public static void main(String[] args) {
        menu();

    }

    static void menu() {
        Scanner sc = new Scanner(System.in);
        meocontroller controller = new meocontroller();
        int chon = 0;
        do {
            System.out.println();
            System.out.println("---------Quản lý mèo cho mẹ-------");
            System.out.println("1. Them Meo.");
            System.out.println("2. Xoa meo theo ID.");
            System.out.println("3. Hien thi toan bo meo.");
            System.out.println("4. Hien thi meo theo ID.");
            System.out.println("5. Thay doi tieng keu theo ID");
            System.out.println("6. Thoat chuong trinh.");
            System.out.print("Nhap lua chon: ");
            chon = sc.nextInt();
            sc.nextLine();
            switch (chon){
                case 1:
                    controller.themMeo();
                    break;
                case 2:
                    System.out.print("Nhap id meo can xoa");
                    int id = sc.nextInt();
                    controller.xoaMeoTheoID(id);
                    break;
                case 3:
                    controller.hienThiToanBoMeo();
                    break;
                case 4:
                    System.out.print("Nhap id meo can hien thi: ");
                    int id2 = sc.nextInt();
                    controller.hienThiMeoTheoID(id2);
                    break;
                case 5:
                    System.out.print("Nhap id meo can thay doi tieng keu: ");
                    int id3 = sc.nextInt();
                    controller.thayDoiTiengKeuTheoID(id3);
                    break;
                case 6:
                    break;
            }

        } while (chon != 0);
    }
}
