package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;
import pages.DemoGuruPage;
import utilities.ReusableMethods;

import java.util.List;

public class DemoGuru99Stepdefinitions {

    DemoGuruPage demoGuruPage=new DemoGuruPage();
    @Given("{string}, sutunundaki tum degerleri yazdirir")
    public void sutunundaki_tum_degerleri_yazdirir(String istenenBaslikStr) {
        List<WebElement> baslikWebelemntListesi=demoGuruPage.baslikWebelemntListesi;
        List<String> baslikStrListesi= ReusableMethods.getElementsText(baslikWebelemntListesi);
        int istenenSutunIndexi=baslikWebelemntListesi.indexOf(istenenBaslikStr);
    }

}
