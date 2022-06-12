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

//        public static void assertEquals(productsGridPage.quantityOfProducts)
//                Object 2,
//                Object actual);


        topMenuPage.proceedToAccessories();
        assertThat(topMenuPage.title()).contains("ACCESSORIES");

        topMenuPage.proceedToArt();
        assertThat(topMenuPage.title()).contains("ART");

    }

        // --ilość załadowanych produktów
        // --jest równa ilości podanych w tyule kategorii
        // *** dla chetnych: rowniez podkategorie

}