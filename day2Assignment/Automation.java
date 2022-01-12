package week3.day2Assignment;

public class Automation extends MultipleLanguage implements Language,TestTool  {

	

	public void Selenium() {
		System.out.println("Let's learn Selenium");
		
	}

	public void Java() {
		System.out.println("Welcome to JAVA");
		
	}

	@Override
	public void ruby() {
		System.out.println("Let's learn RUBY");
		
		
	}
   public static void main(String[] args) {
	   Automation a=new Automation();
	   a.Java();
	   a.Selenium();
	   a.python();
	   a.ruby();
		

	}

}
