package lombok;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.lombok.person;

@SpringBootTest
public class PersonTest {
	@Test
	void  롬복테스트( ) {
		person person1 = new person();
		person1.setName("둘리");
		person1.setAge(12);
		
		System.out.println(person1.getName());
		System.out.println(person1.getAge());
		
		person person2 = new person("또치", 15);
		System.out.println(person2.toString());
		
		person person3 = person.builder()	
													.name("도우너").age(17).build();
		System.out.println(person3.toString());
		

}
}