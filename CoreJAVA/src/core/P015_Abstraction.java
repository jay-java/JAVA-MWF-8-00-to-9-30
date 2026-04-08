package core;

abstract class RBI {
	abstract public void SA();

	abstract public void HL();

	public void Policy() {
		System.out.println("RBI policy");
	}

	public static void repoRate() {
		System.out.println("repo Rate +-4%");
	}
}

class SBI extends RBI {

	@Override
	public void SA() {
		// TODO Auto-generated method stub
		System.out.println("SBI SA 5%");
	}

	@Override
	public void HL() {
		// TODO Auto-generated method stub
		System.out.println("SBI HL 7%");
	}

}

class JAVA extends RBI {

	@Override
	public void SA() {
		// TODO Auto-generated method stub
		System.out.println("JAVA SA 6%");
	}

	@Override
	public void HL() {
		// TODO Auto-generated method stub
		System.out.println("JAVA HL 8%");
	}

}

public class P015_Abstraction {
	public static void main(String[] args) {
		SBI s = new SBI();
		s.HL();
		s.SA();
		s.Policy();
		SBI.repoRate();
		JAVA j = new JAVA();
		j.SA();
		j.HL();
		j.Policy();
		JAVA.repoRate();
	}
}
