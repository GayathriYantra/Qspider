package vtiger;

import org.testng.annotations.Test;

public class VtigerTest {
	
	@Test
	public void CreateOrganisationTest()
	{
		System.out.println("create organisation is done");
	}
	@Test
	public void CreateContactsTest()
	{
		System.out.println("create contacts is done");
	}
	@Test
	public void CreateProductsTest()
	{
		System.out.println("create products is done");
		System.out.println("product success");

		System.out.println("product");
		String BROWSER = System.getProperty("browser");
		String URL=System.getProperty("url");
		System.out.println("Browser is="+BROWSER);
		System.out.println("URL is="+URL);

	}

}
