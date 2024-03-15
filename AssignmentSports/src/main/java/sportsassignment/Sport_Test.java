package sportsassignment;

public class Sport_Test {

	public static void main(String[] args) {
		Ass_Sports as;//up casting
		as=new Ass_Sports();
		as.play();
		as=new Ass_Football();//up casting
		as.play();
		as=new Ass_Basketball();
		as.play();
		as=new Ass_Cricket();
		as.play();
	}

}
