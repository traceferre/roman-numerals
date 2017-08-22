package com.libertymutual.goforcode.romanNumerals.services;

public class HinduToRomanNumeralConverter {

	public String convert(int numberToConvert) 
	{
		String romanNumber = "";
		int myNumber = numberToConvert;
		int remainder = 0;
		
		remainder = numberToConvert % 1000;
		while (myNumber >= 1000)
		{
				romanNumber = romanNumber + "M";
				myNumber = myNumber - 1000;	
		}
		
		myNumber = remainder;
		while (myNumber >= 500)
		{
			if (myNumber >= 900)
			{
				romanNumber = romanNumber + "CM";
				myNumber = myNumber - 900;
				remainder = remainder - 900;
			}
			else
			{
				romanNumber = romanNumber + "D";
				myNumber = myNumber - 500;
				remainder = remainder - 500;
			}			
		}
		
		myNumber = remainder;
		remainder = numberToConvert % 100;
		while (myNumber >= 100)
		{
			if (myNumber >= 400)
			{
				romanNumber = romanNumber + "CD";
				myNumber = myNumber - 400;
			}
			else
			{
				romanNumber = romanNumber + "C";
				myNumber = myNumber - 100;
			}			
		}
		
		myNumber = remainder;
		while (myNumber >= 50)
		{
			if (myNumber >= 90)
			{
				romanNumber = romanNumber + "XC";
				myNumber = myNumber - 90;
				remainder = remainder - 90;
			}
			else
			{
				romanNumber = romanNumber + "L";
				myNumber = myNumber - 50;
				remainder = remainder - 50;
			}				
		}
		
		myNumber = remainder;
		remainder = numberToConvert % 10;
		while (myNumber >= 10)
		{
			if (myNumber >= 40)
			{
				romanNumber = romanNumber + "XL";
				myNumber = myNumber - 40;
			}
			else
			{
				romanNumber = romanNumber + "X";
				myNumber = myNumber - 10;
			}				
		}
		
		myNumber = remainder;
		while (myNumber >= 5)
		{
			if (myNumber == 9)
			{
				romanNumber = romanNumber + "IX";
				myNumber = myNumber - 9;
			}
			else
			{
				romanNumber = romanNumber + "V";
				myNumber = myNumber - 5;
			}			
		}
		
		while (myNumber >= 1)
		{
			if (myNumber == 4)
			{
				romanNumber = romanNumber + "IV";
				myNumber = myNumber - 4;
			}
			else
			{
				romanNumber = romanNumber + "I";
				myNumber = myNumber - 1;
			}			
		}
		
		return romanNumber;
	}

}
