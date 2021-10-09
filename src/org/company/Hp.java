package org.company;

public class Hp extends Dell {
	
	@Override
	
	public void Model() {
		super.Model();
		
	}
	@Override
	void Year() {
		System.out.println("2020");
	}
	@Override
	public void Ram() {
		super.Ram();
		
	}
	@Override
	void Hard_Disk() {
		System.out.println("1TBB");
	}
	public static void main(String[] args) {
			Hp x=new Hp();
		
			x.Model();
			x.Year();
			x.Ram();
			x.Hard_Disk();
			
	}

}
