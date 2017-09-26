package pages

import geb.Page
import modules.ConversionModule
import org.openqa.selenium.By

class ConversionPage extends Page {
    static url = "/conversion-calculator.html"
    static content = {
        wholeForm { module(ConversionModule) }
    }
    static at = {
        title == "Conversion Calculator"
    }

    void fillFromInput(String newFromValue) {
        wholeForm.inputFrom = newFromValue
    }

    String returnToValue() {
        return wholeForm.inputTo.text
    }

    void chooseTab(String tabName) {
        $(By.linkText(tabName)).click()
    }

    void chooseUnitFrom(String unit) {
        $("td").calFrom = unit
    }

    String getNumberFromClickingToUnit(String unit, String number) {
        $("td").calTo = unit + " (" + number + ")"
        $("select#callTo.option", text: startsWith(unit))
        return returnToValue()
    }

}
