package com.techelevator.crm;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Pet {

    // Instance Variables
    private String name;
    private String species;
    private List<String> vaccinations = new ArrayList<>();

    // Getters and Setters
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

    // Constructors
    public Pet(String name, String species) {
        this.name = name;
        this.species = species;
    }

    // Methods
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