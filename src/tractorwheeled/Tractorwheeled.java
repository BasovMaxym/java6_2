package tractorwheeled;

import tractor.Tractor;

public class Tractorwheeled extends Tractor
{

    public Tractorwheeled(String name,double weight,String type,double maxSpeed,int numberPass)
    {

        super(type,weight,type);

        this.maxSpeed = maxSpeed;

        this.numberPass = numberPass;

    }

    @Override
    public void showType()
    {

        System.out.println("Тип трактору:" + this.type);

    }


    @Override
    public void showName()
    {

        System.out.println("Марка трактору:" + this.name);

    }

    @Override
    public void showMaxSpeed()
    {

        System.out.println("Макс.швидкість трактору:" + this.maxSpeed);

    }

    @Override
    public void getWeightTransport()
    {

        System.out.println("Вага трактору:" + this.weight);

    }

    @Override
    public void move(int id)
    {

        this.id = id;

        System.out.println("Трактор №" + this.id + " виїхав");

    }

    private int id;

}
