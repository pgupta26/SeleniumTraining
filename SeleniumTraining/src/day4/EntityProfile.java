package day4;

public class EntityProfile {
	
	int id;
	String name;
	
	void getEntity(int i, String n) {
		id=i;
		name=n;
	}
	
	public void displayEntity() {
		System.out.println("Id: "+id+" Name: "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityProfile obj1 =  new EntityProfile();
		EntityProfile obj2 = new EntityProfile();
		
		//By using reference 
		obj1.id=101;
		obj1.name="TD Bank";
		
		System.out.println("Obj1 id: "+obj1.id);
		System.out.println("Obj1 name: "+obj1.name);
		
		//By using method
		obj2.getEntity(103, "Central Bank");
		
		System.out.println("Obj2 id: "+obj2.id);
		System.out.println("Obj2 name: "+obj2.name);
		
		obj2.displayEntity();
		
	}
}
