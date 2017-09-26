import geb.spock.GebSpec
import pages.ConversionPage
import pages.MainPage

class CalcMainPageSpec extends GebSpec {
    def "Go to main page"() {
        when:
        to MainPage
        then:
        at MainPage
    }

    def "Go to calculator page"() {
        when:
        to ConversionPage
        then:
        at ConversionPage
    }

}
