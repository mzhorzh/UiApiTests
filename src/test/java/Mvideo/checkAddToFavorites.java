package Mvideo;

import MvideoPageObject.FavoritesPage;
import MvideoPageObject.HomePage;
import core.Annotations;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class checkAddToFavorites extends Annotations {
    //Объявление переменных
    private final String product;
    private final String productCardTextExpected;

    public checkAddToFavorites(String product, String productCardTextExpected) {
        this.product = product;
        this.productCardTextExpected = productCardTextExpected;
    }

    //Тестовые данные
    @Parameterized.Parameters
    public static Object[][] testData() {
        return new Object[][]{
                {"Пылесос Xiaomi", "Робот-пылесос Xiaomi Robot Vacuum E12 EU"},
                {"Смартфон Samsung", "Смартфон Samsung Galaxy S24 Ultra 12/256GB Onyx Black"},
        };
    }


    @Test
    public void checkAddProductToFavorites() {
        //Создаем объект класса главной страницы
        HomePage objHomePage = new HomePage();
        //Вводим значение товара в поле поиска
        objHomePage.setProductValue(product);
        //Нажимаем на нопку "Поиск"
        objHomePage.clickSearchButton();
        //Добавляем первый товар в категорию "Избранное"
        objHomePage.clickAddFavoriteButton();
        //Нажимаем на раздел меню "Избранное"
        objHomePage.clickFavoritesButton();
        //Создаем объект класса страницы "Избранные"
        FavoritesPage objFavoritesPage = new FavoritesPage();
        //Проверяем что товар добавлен в "Избранное"
        objFavoritesPage.checkProductCardTextMatchesExpectedText(productCardTextExpected);
    }
}
