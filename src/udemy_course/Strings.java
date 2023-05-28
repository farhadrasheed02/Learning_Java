package udemy_course;
	public class Strings {
		public static void main(java.lang.String[] args) {
			//double myDouble = 85.6;
			int count=0;
			String myText = "farhad Rashid Reshi Farhad Haseena Khan";
			char [] arr = myText.toCharArray();
			for(int i=0;i<arr.length;i++) {
			if(arr[i] != ' ' && (i == 0  ))
					{
					System.out.println(arr[i]);
				
					}
			}
		//	System.out.println(arr);
//			for(int i=0;i<myText.length();i++)
//			{
//				System.out.print(myText.charAt(i)+" ");
//				count++;
//				if(count==6)
//				{
//					
//				}
//			}
			//.out.println("My Name is "+myText +"and my percentage is "+myDouble );
		}
	
	}
