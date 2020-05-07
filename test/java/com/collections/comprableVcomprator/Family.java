package com.collections.comprableVcomprator;


public class Family implements Comparable<Family>
{
    String      name;
    int         age;
    float       weight;

    Family(String name,int age,float weight)
    {
        this.name   = name;
        this.age    = age;
        this.weight = weight;
    }


    public String  getName()   {   return name;    }
    public int     getAge()    {   return age;     }
    public float   getWeight() {   return weight;  }

    public void displayFamily()
    {
        System.out.println("Name : "+name+" | Age: "+age+" | Weight : "+weight);
    }


    @Override
    public int compareTo(Family o) {
       // return this.age-o.age;
        return o.age-this.age;
    }
}


