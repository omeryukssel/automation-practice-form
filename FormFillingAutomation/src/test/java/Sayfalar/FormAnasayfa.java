package Sayfalar;

import org.openqa.selenium.WebDriver;

public class FormAnasayfa extends Sayfa {
    public final String userFormCss=".text-center";
    public final String nameCss="#firstName";
    public final String lastNameCss="#lastName";
    public final String emailCss="#userEmail";
    public final String maleGenderRadioBtnCss="label[for='gender-radio-1']";
    public final String femaleGenderRadioBtnCss="label[for='gender-radio-2']";
    public final String otherGenderRadioBtnCss="label[for='gender-radio-3']";
    public final String phoneNumberCss="#userNumber";
    public final String dateOfBirthCss="#dateOfBirthInput";;
    public final String subjectsCss="#subjectsInput";
    public final String hobbiesSportCheckbxBtnCss="label[for='hobbies-checkbox-1']";
    public final String hobbiesReadingCheckbxBtnCss="label[for='hobbies-checkbox-2']";
    public final String hobbiesMusicCheckbxBtnCss="label[for='hobbies-checkbox-3']";
    public final String uploadPictureBtnId="uploadPicture";
    public final String currentAdressCss="#currentAddress";
    public final String selectStateCss= "div[class=' css-1pahdxg-control'] div[class=' css-1hwfws3']";
    public final String selectCityCss="div[id='stateCity-wrapper'] div:nth-child(3)";
    public final String submitBtnId="submit";
    public final String path="C:\\Users\\Omer Yuksel\\Desktop\\staj\\resim.jpeg";
    public final String closeBtnCss="#closeLargeModal";





    public FormAnasayfa(WebDriver driver) {
        super(driver);
    }
}
