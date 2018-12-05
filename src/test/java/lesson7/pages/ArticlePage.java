package lesson7.pages;

import org.openqa.selenium.By;

public class ArticlePage {

    private final By TITLE = By.xpath(".//a[contains(@class, 'd-inline')]");
    private final By COMMENT = By.xpath(".//a[contains(@class,'text-size-19')]");
    private BaseFunc baseFunc;

    public ArticlePage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;

    }

    public String getTitle() {
        return baseFunc.getElement(TITLE).getText();
    }

    public Integer getCommentCount() {
        String comments = baseFunc.getElement(COMMENT).getText();
        comments = comments.substring(1, comments.length() - 1);
        return Integer.valueOf(comments);
    }
}
