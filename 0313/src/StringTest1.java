public class StringTest1 {

	public static void main(String[] args) {
		String str1 = "John";
		String str2 = "John";
		System.out.println(str1 == str2);
	    
		char[] carr = {'j', 'o', 'h', 'n'};
		
		StringBuffer sb = new StringBuffer("John");
		
		String str3 = new String(str1); //String(String)
		String str4 = new String(carr); // String(char[])
		String str5 = new String(sb);  // String(StringBuffer)
		
//		String str3 = new String("John"); //String(String)
//		String str4 = new String("John"); //String(char[])
		System.out.println(str3 == str4);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		
		//charAt
		char h = str1.charAt(2);
		for (int i = 0; i < str1.length(); i++) {
			System.out.println(str1.charAt(i));
		}
		
		//concat
		System.out.println();
		String info = str1.concat(":25");
		System.out.println(info);
		System.out.println(str1);
		
		//contains
		System.out.println(info.contains(":"));
		
		//endWith
		String filename = "news.txt";
		System.out.println(filename.endsWith("txt"));
		String name = "홍길동";
		System.out.println(name.endsWith("동"));
		
		//equals
		String name1 = new String("홍길동");
		String name2 = new String("홍길동");
		System.out.println(name1 == name2);
		System.out.println(name1.equals(name2));
		
		String alph1 = new String("ABC");
		String alph2 = new String("abc");
		System.out.println(alph1.equals(alph2));
		
		
		//indexof
		String grace = "How are you?";
		System.out.println(grace.indexOf('a'));
		System.out.println(grace.indexOf('!'));
		System.out.println(grace.indexOf("you")); // 시작인덱스를 바라본다
		String haha = "hahaha";
		System.out.println(haha.indexOf('h', 1)); // 같은값이 중복이 되어있을떄 시작위치를 지정해줄 수도 있다
		System.out.println(haha.indexOf('a', 2));
		
		
		//replace
		String tota = haha.replace('h','t');
		System.out.println(tota);
		System.out.println(haha); // 원본으로 
		String momo = haha.replace("ha", "mo");
		System.out.println(momo);
		String fha = haha.replaceFirst(haha, grace);
		System.out.println(fha);
		
		//split
		String fruitstr = "banana, apple, melon, strawberry";
		String[] fruits = fruitstr.split(", ");
		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}
		
		//substring
		String are = grace.substring(4, 7);
		System.out.println(are);
		String are2 = grace.substring(4);
		System.out.println(are2);
		
		//toLowerCase
		String lower = "ABCDE";
		System.out.println(lower.toLowerCase());
		
		//toUpperCase
		String upper = "abcde";
		System.out.println(upper.toUpperCase());
		
		//trim
		String tstr = "    string     ";
		System.out.println(tstr);
		System.out.println(tstr.trim());
		
		String s100 = String.valueOf(100);
		System.out.println(String.valueOf(true));
		String sf100 = String.valueOf(100f);
		
		String s100_2 = 100 + "";
		String strune_2 = true + "";
		String sf100_2 = 100f + "";
		
		int n100 = Integer.parseInt("100");
		float f = Float.parseFloat("100.3");
		double d = Double.parseDouble("3.14");
	}

}
