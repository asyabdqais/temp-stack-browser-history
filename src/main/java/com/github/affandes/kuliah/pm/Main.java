package com.github.affandes.kuliah.pm;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       static String[] history = new String[100];
    static int size = 0;

    public static void browse(String url) {
        if (size < history.length) {
            history[size] = url;
            size++;
            System.out.println("Browsing: " + url);
        }
    }

    public static void back() {
        if (size == 0) {
            System.out.println("History kosong");
        } else {
            size--;
            System.out.println("Kembali dari: " + history[size]);
            if (size > 0) {
                System.out.println("Sekarang di: " + history[size-1]);
            } else {
                System.out.println("Tidak ada history tersisa");
            }
        }
    }

    public static void view() {
        if (size == 0) {
            System.out.println("History kosong");
            return;
        }
        for (int i = size - 1; i >= 0; i--) {
            System.out.println(history[i]);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String cmd;

        while (true) {
            System.out.print(">> ");
            cmd = s.nextLine();

            if (cmd.startsWith("browse ")) {
                browse(cmd.substring(7));
            } else if (cmd.equals("back")) {
                back();
            } else if (cmd.equals("view")) {
                view();
            } else if (cmd.equals("exit")) {
                break;
            }
        }
      
    }
}

    }
}
