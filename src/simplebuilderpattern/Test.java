package simplebuilderpattern;

public class Test {

	public static void main(String[] args) {
		Person person = new Person.Builder("JJY" , "20").
												sex("³²").
												email("xxxxx@naver.com").
												ph("010-1234-5678").
												build();
		
		System.out.println(person);
	}

}
