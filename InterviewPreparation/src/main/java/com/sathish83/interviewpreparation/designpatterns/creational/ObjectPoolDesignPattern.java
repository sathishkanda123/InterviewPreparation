package com.sathish83.interviewpreparation.designpatterns.creational;

import java.sql.Connection;

public class ObjectPoolDesignPattern extends ObjectPoolAbstract<Connection>{


	@Override
	boolean validate(Connection t) {
		return false;
	}

	@Override
	void dead(Connection t) {
		
	}

	@Override
	Connection create() {
		return null;
	}
	
	public ObjectPoolDesignPattern() {
		
		
	}

	public static void main(String[] args) {
		
		ObjectPoolDesignPattern opdp = new ObjectPoolDesignPattern();
		Connection con=opdp.takeOut();
		opdp.takeIn(con);
	}
	

}
