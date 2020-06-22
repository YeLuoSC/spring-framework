package org.springframework.mytest;

import org.junit.jupiter.api.Test;
import org.springframework.core.io.*;

/**
 * @ClassName ResourceLoaderTest
 * @Description TODO
 * @Author xieguannan
 * @Date 2020/6/22 17:04
 */
public class ResourceLoaderTest {
	@Test
	public void resourceLoaderTest(){
		ResourceLoader resourceLoader = new DefaultResourceLoader();
		Resource fileResource1 = resourceLoader.getResource("D:/cpa.json");
		System.out.println("fileResource1 is FileSystemResource:" + (fileResource1 instanceof FileSystemResource));

		Resource fileResource2 = resourceLoader.getResource("/cpa.json");
		System.out.println("fileResource2 is ClassPathResource:" + (fileResource2 instanceof ClassPathResource));

		Resource urlResource1 = resourceLoader.getResource("file:/cpa.json");
		System.out.println("urlResource1 is UrlResource:" + (urlResource1 instanceof UrlResource));

		Resource urlResource2 = resourceLoader.getResource("http://www.baidu.com");
		System.out.println("urlResource2 is UrlResource:" + (urlResource2 instanceof UrlResource));

	}
}
