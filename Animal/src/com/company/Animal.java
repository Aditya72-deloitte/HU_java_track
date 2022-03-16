package com.company;

public class Animal {
    private String name_animal;
    private String landanimal;
    private double weight;

    public String getName_animal(){
        return name_animal;
    }
    public String getLandanimal(){
        return landanimal;
    }
    public double getWeight(){
        return weight;
    }

    public void setName(String name){
        this.name_animal = name;
    }
    public void setLandanimal(String landanimal){
        this.landanimal = landanimal;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public static void main(String[] args){
        Animal dog = new Animal();
        dog.setName("Bull Dog");
        dog.setLandanimal("Yes");
        dog.setWeight(27.5);

        System.out.println("Name of the dog is "+ dog.getName_animal());
        System.out.println("Is the animal a land animal :" + dog.getLandanimal());
        System.out.println("Weight of the animal is :"+ dog.getWeight());

    }

}
