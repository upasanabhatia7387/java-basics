package markerInterface;

public class DeletableTest {
	
	public boolean delete(Object object) {
		if(!(object instanceof Deletable)) {
			return true;
		}
		//delete implementation details
		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deletable d1 = new Entity(); //interface object
		Deletable d2 = new Entity1(); //interface object
		Entity2 d3 = new Entity2(); //class object
		DeletableTest sd = new DeletableTest();
		
		if(sd.delete(d3)) {
			System.out.println("if body");
		}
		else {
			System.out.println("else body");
		}
	}

}
