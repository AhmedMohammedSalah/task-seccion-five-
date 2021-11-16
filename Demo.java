package staff;

public class Demo {

	public static void main(String[] args) {
		memeberFactory mf = new memeberFactory();
		Staff stf1 = mf.getMember("doctor");
		Staff stf2 = mf.getMember("teaching Assistant");
		stf1.getSallary();
		stf1.getYearsOfWork();
		stf2.getSallary();
		stf2.getYearsOfWork();
		
		
	}

}
