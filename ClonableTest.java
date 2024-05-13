package markerInterface;

class My extends Object implements Cloneable{
	//public can also be used
	//this method belongs to object class
	@Override
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}

public class ClonableTest {

	public static void main(String[] args) throws CloneNotSupportedException{
		// TODO Auto-generated method stub
		My m1 = new My(); //normal object
		
		My m2 = (My) m1.clone(); //clone is a method of object class
		
		System.out.println(m1.hashCode()+","+m2.hashCode());

	}

}
