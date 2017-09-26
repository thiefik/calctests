package modules

import geb.Module
import geb.module.Select
import geb.module.TextInput
import org.openqa.selenium.By

class ConversionModule extends Module {
    static content = {
        inputFrom { $(name: "fromVal").module(TextInput) }
        inputTo { $(name: "toVal").module(TextInput) }
        unitFrom { $("select.calFrom").module(Select) }
        lengthTab { $(By.linkText("Length")) }
        tempTab { $(By.linkText("Temperature")) }
    }
}
