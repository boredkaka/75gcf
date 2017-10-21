import java.util.Scanner;

public class Main {

    private Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        (new Main()).menu();
    }

    public void menu() {
        int opcao;

        do {
            System.out.println("MENU:\n[1] Tabuada \n[0] Sair");
            opcao = s.nextInt();

            switch (opcao) {
                case 1: tabuada(); break;
            }
        } while(opcao != 0);
    }

    public void tabuada() {
        int num;

        do {
            System.out.println("Informe um número de 1 a 10");
            num = s.nextInt();
        } while(num < 1 || num > 10);

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "x" + i + "=" + num*i);
        }
    }
}
