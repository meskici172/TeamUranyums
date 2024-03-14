package elements;

import org.openqa.selenium.By;

public class Locator {

   public By applicationOpened = By.xpath("(//android.widget.TextView[@resource-id=\"com.mobisoft.kitapyurdu:id/textViewAll\"])[1]");
   public By myAccountBtn = By.id("com.mobisoft.kitapyurdu:id/btn_ic_header_account");
   public By emailEditText = By.xpath("(//android.widget.EditText[@resource-id=\"com.mobisoft.kitapyurdu:id/inputEditText\"])[1]");
   public By passwordEditText = By.xpath("(//android.widget.EditText[@resource-id=\"com.mobisoft.kitapyurdu:id/inputEditText\"])[2]");
   public By loginButton = By.id("com.mobisoft.kitapyurdu:id/btnLogin");
   public By loginControl = By.id("com.mobisoft.kitapyurdu:id/txt_username");
   public By confirmButton = By.id("com.mobisoft.kitapyurdu:id/confirmButton");
   public By backButton = By.id("com.mobisoft.kitapyurdu:id/btn_ic_back");
   public By registerButton = By.id("com.mobisoft.kitapyurdu:id/btnRegister");
   public By nameEditText = By.id("com.mobisoft.kitapyurdu:id/editTextName");
   public By surnameEditText = By.id("com.mobisoft.kitapyurdu:id/editTextSurname");
   public By mailEditText = By.id("com.mobisoft.kitapyurdu:id/editTextMail");
   public By passwordEditTxt = By.id("com.mobisoft.kitapyurdu:id/editTextPassword");
   public By repeatPasswordEditTxt = By.id("com.mobisoft.kitapyurdu:id/editTextAgainPassword");
   public By confirmCheckBox = By.id("com.mobisoft.kitapyurdu:id/aggreement");
   public By searchBtn = By.id("com.mobisoft.kitapyurdu:id/navigation_search");
   public By searchBox = By.id("com.mobisoft.kitapyurdu:id/searchEditText");
   public By firstSearchResult = By.xpath("//android.widget.TextView[@resource-id=\"com.mobisoft.kitapyurdu:id/list_content\" and @text=\"harry potter\"]");
   public By addToCartBtn = By.xpath("(//android.widget.TextView[@text=\"Sepete Ekle\"])[1]");
   public By continueBtn = By.id("com.mobisoft.kitapyurdu:id/btnContinue");
}