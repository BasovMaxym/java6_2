package main;

import bus.Bus;

import server.Server;

import tractorcrawler.Tractorcrawler;

import tractorwheeled.Tractorwheeled;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите лимит для транспорта: ");

        int limit = sc.nextInt();

        Server apache = new Server(3,limit);

        while (apache.getCurrentCountVehicle() < limit)
        {

            int numberofvehicle = (int) (Math.random() * 3);

            switch(numberofvehicle)
            {

                case 0:

                    System.out.println("Введите марку для автобуса: ");

                    String name = sc.next();

                    System.out.println("Введите вес автобуса: ");

                    double weight = sc.nextDouble();

                    System.out.println("Введите макс.скорость автобуса: ");

                    double maxSpeed = sc.nextDouble();

                    System.out.println("Введите количество пассажиров для автобуса: ");

                    int numberPass = sc.nextInt();

                    apache.addTransport(0, new Bus(name,weight,maxSpeed,numberPass));break;

                case 1:

                    System.out.println("Введите марку для трактора: ");

                    String nametc = sc.next();

                    System.out.println("Введите вес трактора: ");

                    double weighttc = sc.nextDouble();

                    System.out.println("Введите макс.скорость трактора: ");

                    double maxSpeedtc = sc.nextDouble();

                    System.out.println("Введите количество пассажиров для трактора: ");

                    int numberPasstc = sc.nextInt();

                    apache.addTransport(1, new Tractorcrawler(nametc,weighttc,"Гусеничный",maxSpeedtc,numberPasstc));break;

                case 2:

                    System.out.println("Введите марку для трактора: ");

                    String nametw = sc.next();

                    System.out.println("Введите вес трактора: ");

                    double weighttw = sc.nextDouble();

                    System.out.println("Введите макс.скорость трактора: ");

                    double maxSpeedtw = sc.nextDouble();

                    System.out.println("Введите количество пассажиров для трактора: ");

                    int numberPasstw = sc.nextInt();

                    apache.addTransport(2, new Tractorwheeled(nametw,weighttw,"Колесный",maxSpeedtw,numberPasstw));break;


            }


        }

        System.out.println();

        int[] countVehicles = apache.getCountVehicles();

        for(int i = 0; i < countVehicles.length; i++)
        {

            switch(i)
            {

                case 0:System.out.println("Автобусів виїхало - " + countVehicles[i]);break;

                case 1:System.out.println("Гусеничних тракторів виїхало - " + countVehicles[i]);break;

                case 2:System.out.println("Колесних тракторів виїхало - " + countVehicles[i]);break;


            }

        }

    }

}
