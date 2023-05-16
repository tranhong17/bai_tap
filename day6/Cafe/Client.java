package day6.Cafe;

import day6.BaiTap.CardFactory;
import day6.Cafe.caphe.CaPheFactory;
import day6.Cafe.caphe.CaPheType;

import java.util.Scanner;

public class Client {
    private static void showMenu(){
        System.out.println("----- MAY PHA CAPHE -----");
        System.out.println("1.Espresso");
        System.out.println("2.Đen đá");
        System.out.println("3.Nâu đá");
        System.out.println("4.Latte");
        System.out.println("5.Bạc xỉu");
        System.out.println("0.Thoát");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while (choice != 0){
            showMenu();
            System.out.println("Nhập lựa chọn: ");
            choice = scanner.nextInt();
            if(choice == 0){
                System.out.println("Thoat chương trình");
                break;
            }else if(choice == 1){
                CaPheFactory.getCaPhe(CaPheType.ESPRESSO).taoCaPhe();
            }else if(choice == 2){
                CaPheFactory.getCaPhe(CaPheType.DENDA).taoCaPhe();
            } else if(choice == 3) {
                CaPheFactory.getCaPhe(CaPheType.NAUDA).taoCaPhe();
            }else if(choice == 4){
                CaPheFactory.getCaPhe(CaPheType.BACXIU).taoCaPhe();
            }else {
                System.out.println("Lựa chọn không hợp lệ");
            }
        }
        scanner.close();
    }
}
