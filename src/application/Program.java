package application;

import entities.Bill;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Bill conta = new Bill();

        System.out.print("Sexo: ");
        conta.gender = sc.next().charAt(0);

        System.out.print("Quantidade de cervejas: ");
        conta.beer = sc.nextInt();

        System.out.print("Quantidade de refrigerantes: ");
        conta.softDrink = sc.nextInt();

        System.out.print("Quantidade de espetinhos: ");
        conta.barbecue= sc.nextInt();

        System.out.println();
        System.out.println("RELATÓRIO:");
        System.out.printf("Consumo = R$ %.2f%n", conta.feeding());

        if (Bill.cover() == 0.0) {
            System.out.println("Isento de Couvert");
        } else {
            System.out.printf("Couvert = R$ %.2f%n", Bill.cover());
        }

        System.out.printf("Ingresso = R$ %.2f%n", conta.ticket());
        System.out.println();
        System.out.printf("Valor a pagar = R$ %.2f%n",conta.total());

        sc.close();
    }
}
