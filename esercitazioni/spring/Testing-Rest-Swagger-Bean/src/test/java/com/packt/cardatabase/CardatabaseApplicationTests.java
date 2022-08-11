package com.packt.cardatabase;

import com.packt.cardatabase.beans.ImABean;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
public class CardatabaseApplicationTests {

	private static int input_int;
	private static String input_string;
	private static String presentation = "Hello I'm a bean";

	@BeforeAll
	static void setup(){
		input_int = 10;
		input_string = "Ciao";
	}

	@Autowired
	ImABean imabean;

	@Test
	public void contextLoads() {
		assertAll(
				() -> assertEquals(imabean.getWhatIAm(),presentation),
				() -> assertEquals(imabean.doStuff(
						input_string, input_int),"Ciao10 Done!")

		);

	}

	@Test
	void givenEvenNumber_whenCheckingIsNumberEven_thenTrue() {
		boolean result = imabean.isNumberEven(8);
		assertTrue(result);
	}

	@Test
	void givenOddNumber_whenCheckingIsNumberEven_thenFalse() {
		boolean result = imabean.isNumberEven(3);
		assertFalse(result);
	}

	@Test
	void givenLowerThanTenNumber_whenCheckingIsNumberEven_thenResultUnderTenMillis() {
		assertTimeout(Duration.ofMillis(10), () -> imabean.isNumberEven(3));
	}

	@Test
	void givenUpperThanTenDigitNumber_whenCheckingIsNumberEven_thenResultUnderTenMillis() {
		assertTimeout(Duration.ofMillis(10), () -> imabean.isNumberEven(798451256));
	}

	@Test
	void givenNull_whenCheckingIsNumberEven_thenNullPointerException() {
		assertThrows(NullPointerException.class, () -> imabean.isNumberEven(null));
	}

}
