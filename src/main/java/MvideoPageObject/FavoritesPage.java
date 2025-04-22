package MvideoPageObject;

import core.Driver;
import org.openqa.selenium.By;

import static org.junit.Assert.assertTrue;

public class FavoritesPage extends Driver {
    //private final By productCardText = By.xpath(".//div[@data-index='0']");

    //Метод получения текста из карточки продукта и сравнения текста с ожидаемым текстом
    public void checkProductCardTextMatchesExpectedText(String productCardTextExpected) {
        String actualString = driver.findElement(By.xpath(".//a[@class='product-title__text product-title--clamp']")).getText();
        assertTrue("Текст в карточке продукта не соответствует ожидаемому", actualString.trim().contains(productCardTextExpected));
    }
}
