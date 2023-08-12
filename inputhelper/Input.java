package tonghopmvc.inputhelper;

import java.util.Scanner;

public class Input {
    static Scanner sc = new Scanner(System.in);
    public  int InputInt(String mes, String er1, String er2, int min){
        int so = 0;
        boolean nhapSo = true;
        do {

            System.out.print(mes);
            if(sc.hasNextInt()){
                so = sc.nextInt();
                nhapSo = false;
            }else {
                System.out.print(er2);
                sc.nextLine();
            }
        }while (nhapSo);
        return so;
    }
    public String InputString(String mes, String er1, int minlenth, int maxlength) {
        String s = null;
        Scanner sc = new Scanner(System.in);
        boolean nhapChuoi = true;
        do {
            try {
                System.out.print(mes);
                s = sc.nextLine();
                if (s.length() >= minlenth && s.length() <= maxlength) {
                    nhapChuoi = false;
                }else {
                    System.out.print(er1);
                }
            } catch (Exception e) {
                sc.nextLine();
            }
        } while (nhapChuoi);
        return s;
    }

}
