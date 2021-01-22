package homework10;

public class HomeworkMain17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat2 objCat= new Cat2("Vasya", 4);
		System.out.println("Cat name is "+objCat.name+" age is "+ objCat.age+" weight is "+ objCat.weight);
		Cat2 objCat2=new Cat2("Petya");
		System.out.println("Cat name is "+objCat2.name+" age is "+ objCat2.age+" weight is "+ objCat2.weight);
		objCat.friendCat = objCat2;
	}
	
	
}

