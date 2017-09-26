package specs

import geb.spock.GebSpec
import pages.ConversionPage
import spock.lang.Unroll

class TemperatureSpec extends GebSpec{


    def setup() {
        to ConversionPage
//        chooseTempTab()
        chooseTab "Temperature"
        fillFromInput "40"
        chooseUnitFrom "Celsius"
    }



    @Unroll
    def "40 Degree of 'Celsius' should be calculated properly into: #number #unit"() {

        expect:
        getNumberFromClickingToUnit(unit, number) == number

        where:
        unit         | number
        'Celsius'   | '40'
        'Kelvin'      | '313.15'
        'Fahrenheit'  | '104'

        

    }
}
