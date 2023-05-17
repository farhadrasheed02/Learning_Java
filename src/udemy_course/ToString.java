package udemy_course;

class ToString {
	private String name;
	private int id;
	 public ToString(String name,int id)
	 {
		 this.name= name;
		 this.id=id;
		 
	 }
	
	 public String toString()
	 {
		 StringBuilder sb = new StringBuilder();
		 sb.append(id).append(": ").append(name);
		 return sb.toString();
	 }
	/*public String toString()
	{
		return "Hello";
	}
	*/
	public static void main(String[] args) {
		ToString fg = new ToString("Haseena",25);
		System.out.println(fg);
		
	}

}
