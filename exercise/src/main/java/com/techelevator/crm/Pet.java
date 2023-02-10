package com.techelevator.crm;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Pet {

    // Instance Variable
    private String name;
    private String species;
<<<<<<< HEAD
    private List<String> vaccinations = new ArrayList<>();

    // Getters and Setters
=======
    private ArrayList<String> vaccinations = new ArrayList<String>();

    //Constructor
    public String Pet(String name, String species) {
        this.name = name;
        this.species = species;
    }

    //Method
    public String listVaccinations() {
        String output = "";
        for (String vax : vaccinations) {
            output += vax + ", ";
        }

        if (output.length() > 2) {
            output = output.substring(0, output.length() - 2);
        }
        return output;
    }

>>>>>>> d99f0a5d1cc9fa62c2e5f1cf3c01bd6835801045
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public List<String> getVaccinations() {
        return vaccinations;
    }

    public void setVaccinations(List<String> vaccinations) {
        this.vaccinations = vaccinations;
    }
}


















<<<<<<< HEAD
    // Constructor
    public Pet(String name, String species) {
        this.name = name;
        this.species = species;
    }

    // Method
    public String listVaccinations() {
        String output = "";
        for (String vax : vaccinations) {
            output += vax + ", ";
        }

        if (output.length() > 2) { //strip the trailing comma off if there is one (i.e. if the list is not empty)
            output = output.substring(0, output.length() - 2);
        }

        return output;
    }

}
=======

>>>>>>> d99f0a5d1cc9fa62c2e5f1cf3c01bd6835801045
