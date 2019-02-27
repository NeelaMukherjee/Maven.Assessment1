package com.zipcodewilmington.assessment1.part3;

import java.util.ArrayList;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {

    String name = "Neela";

    //Pet [] pet = new Pet[];


    //<Pet extends Pet>{
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    ArrayList<Pet> list = new ArrayList<Pet>();

    public PetOwner(String name, Pet... pets) {


        this.name = name;

        if (pets != null) {
            for (Pet pet : pets) {
                this.list.add(pet);
                pet.setOwner(this);
            }
        }

    }

//    private void setOwnerName(String name) {
//
//        ownerName = name;
//    }
//
//    public String getOwnerName(){
//
//        return ownerName;
//    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {

        if (pet != null) {

            list.add(pet);
            pet.setOwner(this);

        }

    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {

        //int index = list.indexOf(pet);

        list.remove(pet);

        pet.setOwner(null);

    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {

        return list.contains(pet);

//
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {

        int petAge = Integer.MAX_VALUE;

        for (Pet pet : list) {
            if (pet.getAge() < petAge) {

                petAge = pet.getAge();
            }

        }


        return petAge;
    }


    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {

        int petAge = Integer.MIN_VALUE;

        for (Pet pet : list) {
            if (pet.getAge() > petAge) {

                petAge = pet.getAge();
            }

        }
        return petAge;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        Float petAgeAvg;

        float petAge = 0;

        for (Pet pet : list) {

            petAge += pet.getAge();
        }

        petAgeAvg = petAge / list.size();


        return petAgeAvg;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return list.size();
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {

        return name;

    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {


        Pet[] result = list.toArray(new Pet[list.size()]);

        if (result.length == 0) {

            result = new Pet[1];

        }
        return result;


    }
}
