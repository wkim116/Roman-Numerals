package com.el.onboarding.junit.romanNumerals.services;

public class HinduToRomanNumeralConverter {
	public String convert(int hindu) {
		String romanNumeral = "";
		
		while (hindu >= 1000) {
	        romanNumeral += "M";
	        hindu -= 1000;        
	    }
		
	    while (hindu >= 900) {
	        romanNumeral += "CM";
	        hindu -= 900;
	    }
	    
	    while (hindu >= 500) {
	        romanNumeral += "D";
	        hindu -= 500;
	    }
	    
	    while (hindu >= 400) {
	        romanNumeral += "CD";
	        hindu -= 400;
	    }
	    
	    while (hindu >= 100) {
	        romanNumeral += "C";
	        hindu -= 100;
	    }
	    
	    while (hindu >= 90) {
	        romanNumeral += "XC";
	        hindu -= 90;
	    }
	    
	    while (hindu >= 50) {
	        romanNumeral += "L";
	        hindu -= 50;
	    }
	    
	    while (hindu >= 40) {
	        romanNumeral += "XL";
	        hindu -= 40;
	    }
	    
		while(hindu >= 10) {
			romanNumeral += "X";
			hindu -= 10;
		}
		
		while(hindu >= 9) {
			romanNumeral += "IX";
			hindu -= 9;
		}
		
		while(hindu >= 5) {
			romanNumeral += "V";
			hindu -= 5;
		}
		
		while(hindu >= 4) {
			romanNumeral += "IV";
			hindu -= 4;
		}
		
		while(hindu >= 1) {
			romanNumeral += "I";
			hindu -= 1;
		}
		return romanNumeral;
	}

}
