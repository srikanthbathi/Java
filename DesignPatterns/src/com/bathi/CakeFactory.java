package com.bathi;

public class CakeFactory {
	public static final  String blackforest = "BLACKFOREST"; 
	public static final  String cofee = "COFEE"; 
	public static final  String MANGOMERINGUE = "MANGOMERINGUE"; 

	
	public static Cake factory(String cakeType){
		
		switch(cakeType.toUpperCase()){
		case "BLACKFOREST": return new BlackForest();
		case "COFEE":  return new Cofee();
		case "MANGOMERINGUE": return new MangoMeringue();
		default: return null;
		}
		
	}

}
