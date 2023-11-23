package com.testing.junit.unitTestingSpringBoot;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class UnitTestingSpringBootApplicationTests {

	private Calculator c = new Calculator();
	@Test
	void contextLoads() {
	}

	@Test
	void testSum(){
		//excepted
		int expectedResult = 17;
		//Actual
        int actualResult = c.doSum(12,3,2);

		assertThat(actualResult).isEqualTo(expectedResult);
	}

	@Test
	@Disabled
	void testProduct(){
		int expectedProduct = 8;
		int actualProduct = c.doProduct(4 ,2);

		assertThat(actualProduct).isEqualTo(expectedProduct);
	}

	@Test
	void testCompareNums(){
	 Boolean actualResult =	c.compareTwoNums(10 ,10);
	 assertThat(actualResult).isTrue();
	}
}
