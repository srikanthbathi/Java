package com.bathi;

public class Client {

	public static void main(String[] args) {
		Cake cake = CakeFactory.factory(CakeFactory.MANGOMERINGUE);
		cake.prepareCake();

	}

}
