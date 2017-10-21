import java.util.Scanner;

public class Main {

    private Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        (new Main()).menu();
    }

    public void menu() {
        int opcao;

        do {
            System.out.println("MENU:\n" +
                    "[1] Tabuada \n" +
                    "[2] Fatorial \n" +
                    "[3] Bascara \n" +
                    "[4] Pitagoras \n" +
                    "[0] Sair");
            opcao = s.nextInt();

            switch (opcao) {
                case 1: tabuada(); break;
                case 2: fatorial(); break;
                case 3: bascara(); break;
                case 4: pitagoras(); break;
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

    public void fatorial() {
        System.out.println("Informe um número");
        int num = s.nextInt();

        int fat = 1;
        for( int i = 2; i <= num; i++ ) {
            fat *= i;
        }

        System.out.println("O fatorial de " + num + " é " + fat);
    }

    public void bascara() {
        System.out.println("Informe variavel A");
        double a = s.nextDouble();
        System.out.println("Informe variavel B");
        double b = s.nextDouble();
        System.out.println("Informe variavel C");
        double c = s.nextDouble();

        double delta = (b * b) - (4 * a * c);

        double x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
        double x2 = ((-b) - Math.sqrt(delta)) / (2 * a);

        System.out.println("O x1 da questão será " + x1);
        System.out.println("O x2 da questão será " + x2);
    }

    public void pitagoras() {
        System.out.println("Informe variavel A");
        double a = s.nextDouble();
        System.out.println("Informe variavel B");
        double b = s.nextDouble();

        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("Hipotenusa = " + c);
    }
}
