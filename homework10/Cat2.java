package homework10;

	public class Cat2 {
		public String name;
		public int weight;
		public int age;
		public Cat2 friendCat;
		public String catEnemy=null;
	
		/*
		 * измените конструктор Cat2(String name, int age) таким образом 
		 * если передается int age меньше 5 то age инициализируется в 10
		 */
		
	public Cat2(String name, int age){
		this.name=name;
		this.weight=0;
		if (age<5) {
			this.age=10;
		}else {
			this.age=age;
		}
	}	
	Cat2(String name){
		this.name=name;
		this.weight=0;
		this.age=15;
	}
	public Cat2() {
		// TODO Auto-generated constructor stub
	}
	
	









}
