package server;

import run.Run;

public class Server
{

    // кількість транспортних засобів (ТЗ) кожного виду, що виїхали в місто
    private int[] countVehicles;

    // загальна кількість ТЗ, що виїхали в місто
    private int commonCountVehicles;

    // обмеження на кількість ТЗ, що одночасно виїхали в місто
    private int limitVehicle;

    // масив, що зберігає ТЗ будь-якого виду
    private Run[] vehicles;

    // конструктор класу, параметр size – кількість видів ТЗ, limit - обмеження на кількість ТЗ
    public Server (int size, int limitVehicle)
    {

        countVehicles = new int[size];

        this.limitVehicle = limitVehicle;

        vehicles = new Run[this.limitVehicle];

    }

    // повертає обмеження на кількість ТЗ, що одночасно виїхали в місто
    public int getLimitVehicle ()
    {

        return limitVehicle;

    }

    // повертає загальну кількість ТЗ, що виїхали в місто
    public int getCurrentCountVehicle ()
    {

        return commonCountVehicles;

    }


    public int[] getCountVehicles()
    {

        return countVehicles;

    }

    // додає ТЗ до віртуальної бази
    public void addTransport (int numberVehicles, Run vehicle)
    {

        countVehicles[numberVehicles]++;
        vehicles[commonCountVehicles] = vehicle;
        vehicles[commonCountVehicles].move(countVehicles[numberVehicles]);
        commonCountVehicles++;


    }

}
