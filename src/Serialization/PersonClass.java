package Serialization;

import java.io.Serializable;

@SuppressWarnings("serial")
public class PersonClass implements Serializable {
	// transient key is used if we want something in our serializable class to keep out from serializatioin;
		private transient int id; // when I keep the int as transient its value will be changed...
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


