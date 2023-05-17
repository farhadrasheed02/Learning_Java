package inheritance;
public class ClassA {

	public static void main(String[] args) {
		ClassB cb = new ClassB();
		//cb.TalkC() // reverse inheritance is not possible;
		//cb.Wk();
		cb.Speak();
		//cb.TalkC(); // reverse inheritance is not possible
		ClassC cc = new ClassC();
		cc.Walk();
		
		ClassD cd = new ClassD();
		cd.Walk();
		cd.TalkC();
		cd.Speak();
	}

}
