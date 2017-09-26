package pages

import geb.Page
import org.openqa.selenium.By

class MainPage extends Page {
    static url = ""
    static content = {
        allCalcsLink { $("a", 0, href: "/sitemap.html").isDisplayed() }
        allCalcsLinkByXpath {
            $(By.xpath('//div[@id="homelistdiv"]/div/a[@href="/sitemap.html"]')).isDisplayed()
        }
    }
    static at = {
        title == "Calculator.net: Free Online Calculators - Math, Health, Financial, Science"
        allCalcsLinkByXpath
        allCalcsLink
    }

}
