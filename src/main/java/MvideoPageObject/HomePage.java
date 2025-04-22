package MvideoPageObject;

import core.Driver;
import org.openqa.selenium.By;

public class HomePage extends Driver {
    public final By searchBar = By.xpath(".//input[@placeholder='Искать товары в Рассрочку']");
    public final By searchButton = By.xpath(".//div[@class='search-icon-wrapper']");
    public final By addFavoriteButton = By.xpath(".//button[@title='Добавить в избранное']");
    public final By favoritesButton = By.xpath(".//div[@class='nav-tab tab-personal']");

    //Метод проверки доступности, очиищения и ввода значения в поле "Имя"
    public void setProductValue(String product) {
        driver.findElement(searchBar).isEnabled();
        driver.findElement(searchBar).clear();
        driver.findElement(searchBar).sendKeys(product);
    }

    //Метод нажатия на кнопку "Поиск"
    public void clickSearchButton() {
        driver.findElement(searchButton).click();
    }

    //Метод нажатия на кнопку "Добавить в избранное"
    public void clickAddFavoriteButton() {
        driver.findElement(addFavoriteButton).click();
    }

    //Метод нажатия на кнопку "Добавить в избранное"
    public void clickFavoritesButton() {
        driver.findElement(favoritesButton).click();
    }
}
