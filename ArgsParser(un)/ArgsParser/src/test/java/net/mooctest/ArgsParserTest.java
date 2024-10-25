package net.mooctest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ArgsParserTest {
	ArgsParser parser;
	String[]args;

	@Before
	public void setUp() throws Exception {
		parser=new ArgsParser();
		args=new String[]{"a3a74d02b14f4a57ba12db404632358e","bbaacd25290a46598be6541a8822ab08","b50992d469094343ade92b6170bc0059","1d9b12ab66944bb6a16c60131c880edb","7b9a8efbe51e4e859a1557bee1d5ffed","---------------------------------","                              ","--d1ca123f22f44b2a832f0fc9d19a0c","-ad8430f8f2e4cd7b64c6add2fbe10fc","--d75dc7abf944ebab5e18dec88a5ae0","5ac59a6726d445e4baff02517166dbb1","ab9f4c5c277a4a2f9df571095b948f7e","3c2e5c53ee7e4e0a9f1405171ebfffac","927ec0d5794a4b83aade3be286d04645","-9b4dba0e2f54e178e158bc2eaa40390","--d2c26fc4ab4d4c92774712bd6d6601"};
	}

	@After
	public void tearDown() throws Exception {

	}

	@Test
	public void getArgsCount() {
		parser.setArgs(args);
		assertEquals(16,parser.getArgsCount());
	}

	@Test
	public void getArgs() {
		assertNull(parser.getArgs());
		parser=new ArgsParser(args);
		assertArrayEquals(args,parser.getArgs());
	}

	@Test
	public void setArgs() {
		try {
			parser.setArgs(null);
		}catch (NullPointerException e){

		}
		parser.setArgs(args);
		assertArrayEquals(args,parser.getArgs());
	}

	@Test
	public void getArgsLeftCount() {
		parser.setArgs(args);
		assertEquals(16,parser.getArgsLeftCount());
		args[15]=null;
		parser.setArgs(args);
		assertEquals(15,parser.getArgsLeftCount());
	}

	@Test
	public void parseSwitchArgument() {
		parser.setArgs(args);
		assertNull(parser.parseParameterArgument(""));

		SwitchArgument out1=(parser.parseSwitchArgument(args[0]));
		assertEquals(args[0],out1.getKey());
		assertFalse(out1.isSet());
		assertEquals(-1,out1.getPosition());

		args[10]=null;
		args[2]=null;
		parser.setArgs(args);
		SwitchArgument out2=(parser.parseSwitchArgument("d2c26fc4ab4d4c92774712bd6d6601"));
		assertEquals("d2c26fc4ab4d4c92774712bd6d6601",out2.getKey());
		assertTrue(out2.isSet());
		assertEquals(15,out2.getPosition());

		SwitchArgument out3=(parser.parseSwitchArgument("1"));
		assertEquals("1",out3.getKey());
		assertTrue(out3.isSet());
		assertEquals(0,out3.getPosition());


		SwitchArgument out4=(parser.parseSwitchArgument("-"));
		assertEquals("-",out4.getKey());
		assertFalse(out4.isSet());
		assertEquals(-1,out4.getPosition());


		SwitchArgument out5=parser.parseSwitchArgument("--txt");
		assertEquals(-1,out5.position);
		SwitchArgument out7=parser.parseSwitchArgument("d1ca123f22f44b2a832f0fc9d19a0c");
		assertEquals(true,out7.isSet());
		assertEquals(7,out7.position);
		SwitchArgument out8=parser.parseSwitchArgument("ad8430f8f2e4cd7b64c6add2fbe10fc");
		assertEquals(false,out8.isSet());
		assertEquals(-1,out8.position);
		SwitchArgument out9=parser.parseSwitchArgument("--");
		assertFalse(out9.isSet());
		assertEquals(-1,out9.position);


	}

	@Test
	public void parseParameterArgument() {
		args[3]=null;
		parser.setArgs(args);
		assertNull(parser.parseParameterArgument(""));

		ParameterArgument out1=parser.parseParameterArgument(args[0]);
		assertNull(out1);

		ParameterArgument out2=parser.parseParameterArgument("d1ca123f22f44b2a832f0fc9d19a0c");
		assertArrayEquals(args[8].toCharArray(),out2.value.toCharArray());
		assertArrayEquals(args[7].replace('-',' ').trim().toCharArray(),out2.key.toCharArray());
		assertEquals(7,out2.position);

		ParameterArgument out3=parser.parseParameterArgument("-------------------------------");
		assertArrayEquals("-------------------------------".toCharArray(),out3.key.toCharArray());
		assertArrayEquals(args[6].toCharArray(),out3.value.toCharArray());
		assertEquals(5,out3.getPosition());
		args[1]="1";
		args[2]="-";
		parser.setArgs(args);
		ParameterArgument out4=parser.parseParameterArgument("-");
		assertNull(out4);
		args[4]="--txt";
		parser.setArgs(args);
		ParameterArgument out5=parser.parseParameterArgument("--txt");
		assertNull(out5);
		ParameterArgument out6=parser.parseParameterArgument("1");
		assertArrayEquals(args[8].substring(29,32).toCharArray(),out6.value.toCharArray());
		assertEquals("1",out6.key);
		assertEquals(8,out6.position);
		ParameterArgument out7=parser.parseParameterArgument("d1ca123f22f44b2a832f0fc9d19a0c");
		assertArrayEquals(args[8].substring(0,28).toCharArray(),out7.value.toCharArray());
		assertEquals("d1ca123f22f44b2a832f0fc9d19a0c",out7.key);
		assertEquals(7,out7.position);
		ParameterArgument out8=parser.parseParameterArgument("ad8430f8f2e4cd7b64c6add2fbe10fc");
		assertNull(out8);
		ParameterArgument out9=parser.parseParameterArgument("--");
		assertNull(out9);


	}

	@Test
	public void parseStringArgument() {
		args[0]=null;
		parser.setArgs(args);
		List<StringArgument> list=parser.parseStringArgument();
		int i=1;
		assertEquals(15,list.size());
		for (StringArgument s:list) {
			char[]a=args[i++].toCharArray();
			char[]b=s.value.toCharArray();
			assertArrayEquals(a,b);
		}

	}

}
