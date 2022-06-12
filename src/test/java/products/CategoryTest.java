package products;

import base.Pages;
import com.github.dockerjava.api.command.TopContainerCmd;
import org.testng.annotations.Test;
import pages.commons.TopMenuPage;
import pages.commons.ProductsGridPage;

import static org.assertj.core.api.Assertions.assertThat;

public class CategoryTest extends Pages {

    @Test
    public void shouldVerifyCategories() {
        topMenuPage.proceedToClothes();
        assertThat(topMenuPage.title()).contains("CLOTHES");

//        String quantityOfProducts = productsGridPage.totalProducts();
//        if (totalProducts==2) {
//        System.out.println("Products quantity is correct");
//       }else System.out.println("Products quantity is incorrect");



        topMenuPage.proceedToAccessories();
        assertThat(topMenuPage.title()).contains("ACCESSORIES");

        topMenuPage.proceedToArt();
        assertThat(topMenuPage.title()).contains("ART");

    }

        // --ilość załadowanych produktów
        // --jest równa ilości podanych w tyule kategorii
        // *** dla chetnych: rowniez podkategorie

}