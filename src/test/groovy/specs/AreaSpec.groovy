package specs

import geb.spock.GebSpec
import pages.ConversionPage
import spock.lang.Unroll

class AreaSpec extends GebSpec {

    def setup() {
        to ConversionPage
        chooseTab "Area"
        fillFromInput "21"
        chooseUnitFrom "Hectare"
    }

    @Unroll
    def "21 'Hectares' should be calculated properly into: #number #unit"() {

        expect:
        getNumberFromClickingToUnit(unit, number) == number

        where:
        unit                | number
        'Square Meter'      | '210000'
        'Square Kilometer'  | '0.21'
        'Square Centimeter' | '2100000000'
        'Square Millimeter' | '210000000000'
        'Square Micrometer' | '210000000000000000'
        'Hectare'           | '21'
        'Square Mile'       | '0.0810813941'
        'Square Yard'       | '251157.90972'
        'Square Foot'       | '2260421.1875'
        'Square Inch'       | '325500651'
        'Acre'              | '51.892130108'
    }

}
