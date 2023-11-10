package com.couplingloosecoupling;

public class Examination implements Result {

	private exam ex;
	
	/*Examination(Result res)
	{
		this.res=res;
	}*/

	
	public Examination(exam ex) {
		this.ex=ex;
	}


	public void result() {
		ex.pass();
		
	}

}
