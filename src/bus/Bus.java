package bus;

import machine.Machine;

public class Bus extends Machine
{

    public Bus()
    {

    }

    public Bus(String name,double weight,double maxSpeed,int numberPass)
    {

        this.name = name;

        this.weight = weight;

        this.maxSpeed = maxSpeed;

        this.numberPass = numberPass;

    }

    public void showNumberPassengers()
    {

        System.out.println("Кількість пасажирів в автобусі:" + this.numberPass);

    }

    @Override
    public void showName()
    {

        System.out.println("Марка автобусу:" + this.name);

    }

    @Override
    public void showMaxSpeed()
    {

        System.out.println("Макс.швидкість автобусу:" + this.maxSpeed);

    }

    @Override
    public void getWeightTransport()
    {

        System.out.println("Вага автобусу:" + this.weight);

    }

    @Override
    public void move(int id)
    {

        this.id = id;

        System.out.println("Автобус №" + this.id + " виїхав");

    }

    private int id;

}
