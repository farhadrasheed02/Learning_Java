package Serialization;

public class PersonClass {
	
		private int id;
		private String name;
		public PersonClass(int id, String name) {
			this.id = id;
			this.name = name;
		}
		@Override
		public String toString() {
			return "Person [id=" + id + ", name=" + name + "]";
		}
	}


