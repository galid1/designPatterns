package simplebuilderpattern;

public class Person {
	private String name;
	private String age;
	private String sex;
	private String email;
	private String ph;
	
	public static class Builder {
		//�ʼ� ����
		private String name;
		private String age;
		
		//������ ����
		private String sex = "";
		private String email = "";
		private String ph = "";
		
		public Builder(String name , String age){
			this.name = name;
			this.age = age;
		}
		
		public Builder sex(String sex){
			this.sex = sex;
			return this;
		}
		
		public Builder email(String email){
			this.email = email;
			return this;
		}
		
		public Builder ph(String ph){
			this.ph = ph;
			return this;
		}
		
		public Person build(){
			return new Person(this);
		}
	}
	
	private Person(Builder builder){
		name = builder.name;
		age = builder.age;
		sex = builder.sex;
		email = builder.email;
		ph = builder.ph;
	}
	
	public String toString(){
		String info = "�̸� : " + name + "\n" +
					  "���� : " + age + "\n" +
					  "���� : " + sex + "\n" +
					  "�̸��� : " + email + "\n" +
					  "��ȭ��ȣ : " + ph;
		return info;
	}
}
