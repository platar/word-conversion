package com.word.conversion.service;

import org.junit.Test;

import com.word.conversion.service.WordConversionService;
import com.word.conversion.service.WordConversionServiceI;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class WordConversionServiceTest {
	
	private WordConversionServiceI service = new WordConversionService();
	
	@Test(expected = IllegalArgumentException.class)
	public void testMinus1() {
		service.convert(-1);
	}
	
	@Test
	public void test0() {
		String actualResult = service.convert(0);
		assertThat(actualResult, is(equalTo("zero")));
	}
	
	@Test
	public void test1() {
		String actualResult = service.convert(1);
		assertThat(actualResult, is(equalTo("one")));
	}
	
	
	@Test
	public void test5() {
		String actualResult = service.convert(5);
		assertThat(actualResult, is(equalTo("five")));
	}
	
	@Test
	public void test10() {
		String actualResult = service.convert(10);
		assertThat(actualResult, is(equalTo("ten")));
	}
	
	@Test
	public void test15() {
		String actualResult = service.convert(15);
		assertThat(actualResult, is(equalTo("fifteen")));
	}
	
	@Test
	public void test25() {
		String actualResult = service.convert(25);
		assertThat(actualResult, is(equalTo("twenty five")));
	}
	
	
	@Test
	public void test50() {
		String actualResult = service.convert(50);
		assertThat(actualResult, is(equalTo("fifty")));
	}
	
	
	@Test
	public void test99() {
		String actualResult = service.convert(99);
		assertThat(actualResult, is(equalTo("ninety nine")));
	}
	
	@Test
	public void test1000() {
		String actualResult = service.convert(1000);
		assertThat(actualResult, is(equalTo("one thousand")));
	}
	
	@Test
	public void test1200() {
		String actualResult = service.convert(1200);
		assertThat(actualResult, is(equalTo("one thousand two hundred")));
	}
	
	@Test
	public void test1202() {
		String actualResult = service.convert(1202);
		assertThat(actualResult, is(equalTo("one thousand two hundred two")));
	}
	
	@Test
	public void test10019() {
		String actualResult = service.convert(10019);
		assertThat(actualResult, is(equalTo("ten thousand nineteen")));
	}
	
	@Test
	public void test202020() {
		String actualResult = service.convert(202040);
		assertThat(actualResult, is(equalTo("two hundred two thousand forty")));
	}
	
	@Test
	public void test202022() {
		String actualResult = service.convert(202052);
		assertThat(actualResult, is(equalTo("two hundred two thousand fifty two")));
	}
	
	@Test
	public void test1000000() {
		String actualResult = service.convert(1000000);
		assertThat(actualResult, is(equalTo("one million")));
	}
	
	@Test
	public void test1000002() {
		String actualResult = service.convert(1000002);
		assertThat(actualResult, is(equalTo("one million two")));
	}
	
	@Test
	public void test9000002() {
		String actualResult = service.convert(9000002);
		assertThat(actualResult, is(equalTo("nine million two")));
	}
	
	@Test
	public void test999999999() {
		String actualResult = service.convert(999999999);
		assertThat(actualResult, is(equalTo("nine hundred ninety nine million nine hundred ninety nine thousand nine hundred ninety nine")));
	}

}
