package com.aldi.springtest.models;

import java.util.HashMap;

import javax.validation.constraints.NotNull;

public class Student {

    @NotNull
    private String firstName;
    private String lastName;
    private String country;
    private HashMap<String, String> countryOptions;
    private String favoriteLanguage;
    private HashMap<String, String> favoriteLanguages;
    private String[] favoriteOS;
    private HashMap<Integer, String> favoriteOSOptions;

    public Student() {
        countryOptions = new HashMap<String, String>();
        countryOptions.put("ID", "Indonesia");
        countryOptions.put("EN", "England");
        countryOptions.put("FR", "France");
        countryOptions.put("DE", "Germany");

        favoriteLanguages = new HashMap<String, String>();
        favoriteLanguages.put("Java", "Java");
        favoriteLanguages.put("JavaScript", "JavaScript");
        favoriteLanguages.put("PHP", "C#");
        favoriteLanguages.put("C#", "C#");

        favoriteOSOptions = new HashMap<Integer, String>();
        favoriteOSOptions.put(1, "Windows");
        favoriteOSOptions.put(2, "Linux");
        favoriteOSOptions.put(3, "MacOS");
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return this.country;
    }

    public String getCountryOptionsValue() {
        return countryOptions.get(country);
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public HashMap<String, String> getCountryOptions() {
        return this.countryOptions;
    }

    public void setCountryOptions(HashMap<String, String> countryOptions) {
        this.countryOptions = countryOptions;
    }

    public String getFavoriteLanguage() {
        return this.favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    public HashMap<String, String> getFavoriteLanguages() {
        return this.favoriteLanguages;
    }

    public void setFavoriteLanguages(HashMap<String, String> favoriteLanguages) {
        this.favoriteLanguages = favoriteLanguages;
    }

    public String getFavoriteLanguagesValue() {
        return favoriteLanguages.get(favoriteLanguage);
    }

    public String[] getFavoriteOS() {
        return this.favoriteOS;
    }

    public void setFavoriteOS(String[] favoriteOS) {
        this.favoriteOS = favoriteOS;
    }

    public HashMap<Integer, String> getFavoriteOSOptions() {
        return this.favoriteOSOptions;
    }

    public void setFavoriteOSOptions(HashMap<Integer, String> favoriteOSOptions) {
        this.favoriteOSOptions = favoriteOSOptions;
    }

}
