package io.pragra.learning.demo;
public class DemoApplication {

	public static void main(String[] args) {



		ApplicationContext context= new FileSystemXmlApplicationContext(Paths.get("src/main/resources/beans.xml").toString());
		Car car = context.getBean("car",Car.class);
		System.out.println(car.getEngine().getEngineType());
		System.out.println(context.getBean(Student.class));

	}

}
