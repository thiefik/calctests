package specs

import geb.spock.GebSpec
import pages.ConversionPage
import spock.lang.Unroll

class LengthSpec extends GebSpec {

    def setup() {
        to ConversionPage
        chooseTab "Length"
        fillFromInput "12"
        chooseUnitFrom "Foot"
    }

    @Unroll
    def "12 'Foots' should be calculated properly into: #number #unit"() {

        expect:
        getNumberFromClickingToUnit(unit, number) == number

        where:
        unit         | number
        'Meter'      | '3.6576'
        'Kilometer'  | '0.0036576'
        'Centimeter' | '365.76'
        'Millimeter' | '3657.6'
        'Micrometer' | '3657600'
        'Nanometer'  | '3657600000'
        'Mile'       | '0.0022727188'
        'Yard'       | '4'
        'Foot'       | '12'
        'Inch'       | '144'
        'Light Year' | '3.866115049 -16'
    }

}
