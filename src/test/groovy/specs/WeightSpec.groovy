package specs

import geb.spock.GebSpec
import pages.ConversionPage
import spock.lang.Unroll

class WeightSpec extends GebSpec {

    def setup() {
        to ConversionPage
        chooseTab "Weight"
        fillFromInput "123"
        chooseUnitFrom "Carrat"
    }

    @Unroll
    def "123 'Carrats' should be calculated properly into: #number #unit"() {

        expect:
        getNumberFromClickingToUnit(unit, number) == number

        where:
        unit               | number
        'Kilogram'         | '0.0246'
        'Gram'             | '24.6'
        'Milligram'        | '24600'
        'Metric Ton'       | '0.0000246'
        'Long Ton'         | '0.0000242115'
        'Short Ton'        | '0.0000271169'
        'Pound'            | '0.0542337607'
        'Ounce'            | '0.8677401718'
        'Carrat'           | '123'
        'Atomic Mass Unit' | '1.481445616 +25'
    }

}
