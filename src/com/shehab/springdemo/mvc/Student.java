package com.shehab.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	private String country;
	private String favoriteLanguage;
	private LinkedHashMap<String, String> countryOption;
    private LinkedHashMap<String, String> favoriteLanguageOptions;
    private String[] operatingSystems;
    
    
	
	public String[] getOperatingSystems() {
		return operatingSystems;
	}


	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}


	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}


	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}
	
	
	public Student() {
		countryOption = new LinkedHashMap<String, String>();
		countryOption.put("BR", "Brazil");
		countryOption.put("EG", "Egypt");
		countryOption.put("FR", "France");
		countryOption.put("IN", "India");
		
		
		 favoriteLanguageOptions = new LinkedHashMap<String , String>();
	        // parameter order: value, display label
	        //
	        favoriteLanguageOptions.put("Java", "Java");
	        favoriteLanguageOptions.put("C#", "C#");
	        favoriteLanguageOptions.put("PHP", "PHP");
	        favoriteLanguageOptions.put("Ruby", "Ruby");    
	}
	
	
	public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
		return favoriteLanguageOptions;
	}


	public LinkedHashMap<String, String> getCountryOption() {
		return countryOption;
	}


	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
