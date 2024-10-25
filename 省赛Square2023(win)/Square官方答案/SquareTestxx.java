package net.mooctest;

import static org.junit.Assert.*;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class SquareTest {
	
	private byte[] toByteArray(String s) {
		byte[] result = new byte[s.length()];
		for(int i = 0; i < s.length(); i++) {
			result[i] = (byte) s.charAt(i);
		}
		return result;
	}
	byte[] key = toByteArray("Honkai:Star Rail");
	byte[] mask = new byte[16];
	
	public SquareTest() {
		Arrays.fill(mask, (byte) 0);
	}
	
	private void assertThrows(Runnable r, Class<? extends Throwable> exception) {
		try {
			r.run();
			fail();
		} catch (Exception e) {
			assertTrue(exception.isAssignableFrom(e.getClass()));
		}
	}

	@Test(timeout = 2000)
	public void test() throws Exception {
		List<Class<? extends SquareMode>> exactSizeModes = Arrays.asList(
			SquareCbc.class, SquareEcb.class, SquareCts.class, SquareCfb.class, SquareOfb.class
		);
		List<Class<? extends SquareMode>> arbitrarySizeModes = Arrays.asList(
			 SquareCfb.class, SquareOfb.class
		);
		for(Class<? extends SquareMode> mode : exactSizeModes) {
			testMode(mode, "Just 16 letters!");
			System.gc();
		}
		for(Class<? extends SquareMode> mode : arbitrarySizeModes) {
			testArbitrarySizeMode(mode);
		}
	}
	
	@Test
	public void testSquareCts() throws Exception {
		SquareCts cts = new SquareCts();
		cts.setKey(key);
		cts.setIV(mask);
		assertThrows(() -> {
			cts.decrypt(null, 0, 1);
		}, IndexOutOfBoundsException.class);
		assertThrows(() -> {
			cts.encrypt(null, 0, 1);
		}, IndexOutOfBoundsException.class);
		byte[] input = toByteArray("More than 16 letters! Even more in the end of this string!");
		byte[] output = new byte[input.length];
		output = Arrays.copyOf(input, input.length);
		cts.encrypt(output, 0, input.length);
		cts.setIV(mask);
		cts.decrypt(output, 0, input.length);
		assertTrue(Arrays.equals(input, output));
	}
	
	public void testArbitrarySizeMode(Class<? extends SquareMode> mode) throws Exception {
		SquareMode s = mode.newInstance();
		s.setKey(key);
		s.setIV(mask);
		byte[] input = toByteArray("More than 16 letters! Even more in the end of this string!");
		byte[] output = Arrays.copyOf(input, input.length);
		byte[] input2 = toByteArray("?");
		byte[] output2 = Arrays.copyOf(input2, input2.length);
		byte[] input3 = toByteArray("Just 16 letters!");
		byte[] output3 = Arrays.copyOf(input3, input3.length);
		s.encrypt(output, 0, output.length);
		s.encrypt(output2, 0, output2.length);
		s.encrypt(output3, 0, input3.length);
		s.setIV(mask);
		s.decrypt(output, 0, input.length);
		s.decrypt(output2, 0, output2.length);
		s.decrypt(output3, 0, output3.length);
		assertTrue(Arrays.equals(input, output));
		assertTrue(Arrays.equals(input2, output2));
		assertTrue(Arrays.equals(input3, output3));
	}
	
	public void testMode(Class<? extends SquareMode> mode, String inputStr) throws Exception {
		byte[] input = toByteArray(inputStr);
		byte[] output = Arrays.copyOf(input, input.length);
		SquareMode s = mode.newInstance();
		s.setKey(key);
		s.setIV(mask);
		s.encrypt(output, 0, input.length);
		s.setIV(mask);
		s.decrypt(output, 0, input.length);
		assertTrue(Arrays.equals(input, output));
	}
	
	@Test
	public void testZero() throws Exception {
		SquareEcb ecb = new SquareEcb();
		byte[] zeroes = new byte[16];
		Arrays.fill(zeroes, (byte) 0);
		ecb.setIV(zeroes);
		ecb.setKey(zeroes);
		ecb.encrypt(zeroes, 0, 16);
	}

	@Test
	public void testMul() throws Exception {
		Method method = Square.class.getDeclaredMethod("mul", int.class, int.class);
		method.setAccessible(true);
		assertEquals(0, (int)method.invoke(null, 0, 1));
		assertEquals(0, (int)method.invoke(null, 1, 0));
	}
}
