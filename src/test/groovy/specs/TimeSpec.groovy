package specs

import geb.spock.GebSpec
import pages.ConversionPage
import spock.lang.Unroll

class TimeSpec extends GebSpec {

    def setup() {
        to ConversionPage
        chooseTab "Time"
        fillFromInput "54"
        chooseUnitFrom "Minute"
    }

    @Unroll
    def "54 'Minutes' should be calculated properly into: #number #unit"() {

        expect:
        getNumberFromClickingToUnit(unit, number) == number

        where:
        unit          | number
        'Second'      | '3240'
        'Millisecond' | '3240000'
        'Microsecond' | '3240000000'
        'Nanosecond'  | '3240000000000'
        'Picosecond'  | '3240000000000000'
        'Minute'      | '54'
        'Hour'        | '0.9'
        'Day'         | '0.0375'
        'Week'        | '0.0053571429'
        'Month'       | '0.0012320329'
        'Year'        | '0.0001026694'
    }

}
