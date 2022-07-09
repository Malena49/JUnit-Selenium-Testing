package pageEvents;

import pageObjects.SingleProductPageElements;
import utils.FetchELement;

public class SingleProductPageEvents {

    public String getProductTitle(){
        FetchELement elementFetch = new FetchELement();
        return elementFetch.getWebElement(
                "ID", SingleProductPageElements.product_title
        ).getText();

    }
}
