package UtilTestPack;

import java.io.IOException;

import org.testng.annotations.Test;

import Utility.GenericKeyword;
import Utility.PropertyReader;

public class BaseTest {

	public GenericKeyword gen ;
	@Test
	public void setup() throws IOException
	{
		gen=new GenericKeyword();
		String re=	PropertyReader.property("Browser");
		System.out.println(re);
		String re1 = PropertyReader.property("Url");
		System.out.println(re1);

		gen.generickeyword(PropertyReader.property("Browser"));
		gen.enterUrl(PropertyReader.property("Url"));
		gen.enterData("id", "email", "Yallareddy");
		gen.enterData("id", "pass", "8500");
		gen.clickonElement("id", "loginbutton");
		String st=gen.pageTitle();
		System.out.println(st);

	}
}

