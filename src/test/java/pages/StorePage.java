package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;

public class StorePage {

    private final SelenideElement imgLoading = $x("//img[@alt='loading']");
    private final SelenideElement storeFrame = $x("//iframe[@name='framelive']");
    private final SelenideElement firstItemLink = $x("(//a[contains(@class,'product-thumbnail')])[1]");
    private final SelenideElement secondItemLink = $x("(//a[contains(@class,'product-thumbnail')])[2]");

    public StorePage(String url) {
        open(url);
    }

    public StorePage() {
    }

    public StorePage pageLoaded() {
        imgLoading.shouldNotBe(Condition.visible, Duration.ofSeconds(15));
        return new StorePage();
    }

    public StorePage switchIntoMainStoreFrame() {
        storeFrame.shouldBe(Condition.visible, Duration.ofSeconds(15));
        switchTo().frame($(storeFrame));
        return new StorePage();
    }

    public ItemPage clickFirstProduct() {
        firstItemLink.shouldBe(Condition.visible, Duration.ofSeconds(15)).click();
        return new ItemPage();
    }

    public ItemPage clickSecondProduct() {
        secondItemLink.shouldBe(Condition.visible, Duration.ofSeconds(15)).click();
        return new ItemPage();
    }
}
