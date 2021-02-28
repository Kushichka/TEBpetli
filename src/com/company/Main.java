package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //z1();
        //z2();
        //z3();
        //z4();
        //z5();
        //z6();
        //z7();
        //z9();
        //z42();
        //z44();
        //z45();
        z46();
    }
    public static void z1()
    {
        for (int i=11; i<=33; i++)
        {
            System.out.println(i);
        }
    }
    public static void z2()
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n<0)
        {
            System.out.println("n >= 0");
        }
        else
        {
            int wynik = 2;
            for (int i=1; i<n; i++)
            {
                wynik = wynik*2;
            }
            System.out.println("2^" + n + " = " + wynik);
        }
    }
    public static void z3()
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n <2)
        {
            System.out.println("n > 2");
        }
        else
        {
            int wynik = 0;
            for (int i = 0; i <= n; i++)
            {
                wynik = wynik + i;
            }
            System.out.println(wynik);
        }
    }
    public static void z4()
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < k; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void z5() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i < n+1; i++)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void z6()
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = n-1;
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= s; j++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++)
            {

                System.out.print("*");
            }
            s--;
            System.out.println();
        }
    }
    public static void z7()
    {
        for (int i = 1; i < 100; i++) {
            if(i % 13 == 0)
            {
                System.out.println(i);
            }
        }
    }
    public static void z9()
    {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i*j + "\t");
            }
            System.out.println();
        }
    }
    public static void z42()
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 1;
        while (a<n+1)
        {
            System.out.println(2*a-1);
            a++;
        }

    }
    public static void z44()
    {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        int k =scanner.nextInt();
        int a = 0;
        int b = 0;

        while (a<n)
        {
            while(b<k)
            {
                System.out.print("*");
                b++;
            }
            b = 0;
            a++;
            System.out.println();
        }
    }
    public static void z45()
    {
        Scanner scanner = new Scanner(System.in);
        int b = 0;
        do {
            b = scanner.nextInt();
        }
        while (b > 0);
    }
    public static void z46()
    {
        Scanner scanner = new Scanner(System.in);
        int a;

        do{
            System.out.println("Które pole chcesz obliczyć? 1-pole prostokąta 2-pole kwadratu 3-pole trójkąta");
            a =scanner.nextInt();
        }
        while(a>3);

        switch(a)
        {
            case 0:
                break;
            case 1:
                System.out.println("Podaj długość a");
                int b = scanner.nextInt();
                System.out.println("Podaj długość b");
                int c = scanner.nextInt();
                System.out.println("Pole prostokąta = "+((b+c)*2));
                break;
            case 2:
                System.out.println("Podaj długość a");
                int d = scanner.nextInt();
                System.out.println("Podaj długość b");
                int e = scanner.nextInt();
                System.out.println("Pole kwadratu = "+(d*e));
                break;
            case 3:
                System.out.println("Podaj długość boku a");
                int f = scanner.nextInt();
                System.out.println("Podaj wysokość h");
                int g = scanner.nextInt();
                System.out.println("Pole trójkąta = "+((f*g)/2));
                break;


        }
    }
}

