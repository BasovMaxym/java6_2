package tractor;

import machine.Machine;

public abstract class Tractor extends Machine
{

    public Tractor(String name,double weight,String type)
    {

        this.type = type;

        this.weight = weight;

        this.name = name;

    }

    public abstract void showType();

    protected String type;

}
