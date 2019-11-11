package InterfaceConcept;

public class Banks implements RBI{

	public static void main(String[] args) {
		Banks obj = new Banks();
		obj.interest();

	}

	@Override
	public void interest() {
		System.out.println("interest");
		
	}

	@Override
	public void repo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reverserepo() {
		// TODO Auto-generated method stub
		
	}

}
