package circus;

import circus.animal.*;
import circus.stuff.Cannon;
import circus.stuff.Equipment;
import circus.stuff.Ladder;

import java.util.ArrayList;
import java.util.Arrays;

public class Circus {
    private static Animal[] animals = {
            new Duck("Drake"),
            new Parrot("Polly")
    };
    private static Equipment[] equipments = {
            new Ladder(50),
            new Cannon(5),
            new Cannon(100)
    };

    private static void makeAnimalsTalk() {
        for (Animal a : animals) {
            System.out.println(a);
            System.out.println(a.speak());
        }
    }

    private static int calculateAssetValue(Asset[] assets) {
        int total = 0;
        for (Asset a : assets) {
            if (a.getValue() <= 5) {
                System.out.println("Ignoring low value item: " + a.getValue());
                continue;
            }
            total += a.getValue();
            System.out.println("Adding item value: " + a.getValue());
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println("Number of animals in the array: " + animals.length);
        makeAnimalsTalk();
        Elephant ele = new Elephant("Ele");
        ArrayList<Animal> animalArrayList = new ArrayList<>(Arrays.asList(animals));
        System.out.println("Number of animals in the array: " + animalArrayList.size());
        animalArrayList.add(ele);
        System.out.println("Number of animals in the array: " + animalArrayList.size());
        printAllAnimals(animalArrayList);
        Tiger tigger = new Tiger("Tigger");
        animalArrayList.add(tigger);
        Duck louie = new Duck("Louie");
        Duck dewey = new Duck("Dewey");
        Parrot parrotie = new Parrot("Parrotie");
        animalArrayList.add(louie);
        animalArrayList.add(dewey);
        animalArrayList.add(parrotie);

        System.out.println("Louie is at:" + animalArrayList.indexOf(louie));
        animalArrayList.sort(Animal.AnimalNameCompartor);
        System.out.println("After sorting.....");
        printAllAnimals(animalArrayList);
//        System.out.println("Total value of animals " + calculateAssetValue(animals));
//        System.out.println("Total value of equipments " + calculateAssetValue(equipments));
    }

    private static void printAllAnimals(ArrayList<Animal> animalArrayList) {
        for (Animal animal : animalArrayList) {
            System.out.println(animal);
        }
    }
}
