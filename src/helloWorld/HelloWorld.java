package helloWorld;

class HelloWorld {

public String sayHello()
{		System.out.println("I am in say hello method....");

	String sayHello="Hello World";
	return sayHello;
			
}

public String callSayHelloMethod(){
	System.out.println("I am in callSayHelloMethod ....");

	String data = sayHello();
			
	return data;
}

	public static void main(String[] args) {

		
		System.out.println("I am here  "+"Hello...");

		
		HelloWorld helloShekar = new HelloWorld();
		
		System.out.println(helloShekar.sayHello());
		
		System.out.println(helloShekar.callSayHelloMethod());

	}

}
