package Serialization;

import java.io.Serializable;

public class PersonClass implements Serializable {
	
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


