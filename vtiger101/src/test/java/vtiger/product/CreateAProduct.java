
/*package vtiger.product;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POMRepo.VendorInformationPage;
import POMRepo.VendorsPage;
import POMrepo.CreatingNewProductPage;
import POMrepo.productPage;
import vtiger.genericUtility.BaseClass;
import vtiger.genericUtility.IPathConstant;

public class CreateAProduct extends BaseClass {
	
	@Test
	public void createProductWithVendorDetails() throws EncryptedDocumentException, IOException {
		
		String vendorName = eUtils.fetchDataFromExcelSheet(IPathConstant.SHEET_NAME_FOR_VENDOR, 18, 2);
		String productName = eUtils.fetchDataFromExcelSheet(IPathConstant.SHEET_NAME_FOR_PRODUCT, 17, 2);
		
		
		
		HomePage home=new HomePage(driver);
		home.clickOnVendorsModule();
		
		VendorsPage vendors = new VendorsPage(driver);
		vendors.clickOnVendorsPlusButton();
		
		CreatingNewVendor createVendor = new CreatingNewVendor(driver);
		createVendor.enterVendorName(vendorName);
		createVendor.clickOnSaveButton();
		
		VendorInformationPage vendorInfo = new VendorInformationPage(driver);
		String actualVendorName = vendorInfo.verifyVendorInfo(vendorName);
		
		Assert.assertEquals(actualVendorName, vendorName);
		System.out.println("Pass: The vendor has been created");
		
		home.clickOnProductModule();
		
		productPage product=new productPage(driver);
		product.clickOnProductPlusButton();
		
		CreatingNewProductPage createProduct=new CreatingNewProductPage(driver);
		createProduct.enterProductName(actualVendorName);
	}

}
*/