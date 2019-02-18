package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public class Dog extends Pet {

    String nameDog;
    Integer ageDog;
    /**
     * @param name name of this Dog
     * @param age age of this dog
     */
    public Dog(String name, Integer age) {

super (name, age);

    }

    /**
     * @param age age of this dog
     */
    public Dog(Integer age) {

        super (age);
        //this.age =age;
        //this.name = "Name of Dog";
    }

    /**
     * @param name name of this dog
     */
    public Dog(String name) {

        super(name);
        //this.name = name;
        //this.age = ;


    }

    /**
     * nullary constructor
     * by default, a dog's
     * name is DogName
     * age is 0
     */
    public Dog() {

        this.age = 0;
        this.name = "Dog name";
    }

    /**
     * @return bark as a string
     */
    public String speak() {


        return "Bark";
    }
}
