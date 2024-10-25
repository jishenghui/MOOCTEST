package net.mooctest;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

public class test1 {
	
	@Test
	public void testName() throws Exception {
		 // 创建一个临时文件
        File tempFile = File.createTempFile("test", ".txt");
        String content = "Hello, World!";
        String fileName = tempFile.getAbsolutePath();

        // 调用要测试的方法
        FileChaozuo.File(fileName, content);
//		FileChaozuo.File("", content);
        
        // 验证文件内容是否正确
        try (FileReader reader = new FileReader(fileName)) {
            StringBuilder sb = new StringBuilder();
            int character;
            while ((character = reader.read()) != -1) {
                sb.append((char) character);
            }
            assertEquals(content, sb.toString());
        } catch (IOException e) {
            fail("读取文件失败");
        }
	}

}
