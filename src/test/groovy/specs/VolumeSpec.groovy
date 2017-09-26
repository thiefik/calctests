package specs

import geb.spock.GebSpec
import pages.ConversionPage
import spock.lang.Unroll

class VolumeSpec extends GebSpec {

    def setup() {
        to ConversionPage
        chooseTab "Volume"
        fillFromInput "7"
        chooseUnitFrom "Liter"
    }

    @Unroll
    def "7 'Litres' should be calculated properly into: #number #unit"() {

        expect:
        getNumberFromClickingToUnit(unit, number) == number

        where:
        unit                   | number
        'Cubic Meter'          | '0.007'
        'Cubic Kilometer'      | '7. -12'
        'Cubic Centimeter'     | '7000'
        'Cubic Millimeter'     | '7000000'
        'Liter'                | '7'
        'Milliliter'           | '7000'
        'US Gallon'            | '1.849205238'
        'US Quart'             | '7.396820952'
        'US Pint'              | '14.793641904'
        'US Cup'               | '29.587283808'
        'US Fluid Ounce'       | '236.69827046'
        'US Table Spoon'       | '473.39654093'
        'US Tea Spoon'         | '1420.1896228'
        'Imperial Gallon'      | '1.5397847381'
        'Imperial Quart'       | '6.1591389524'
        'Imperial Pint'        | '12.318277905'
        'Imperial Fluid Ounce' | '246.36555809'
        'Imperial Table Spoon' | '394.18489295'
        'Imperial Tea Spoon'   | '1182.5546789'
        'Cubic Mile'           | '1.679390045 -12'
        'Cubic Yard'           | '0.0091556543'
        'Cubic Inch'           | '427.16620866'
        'Cubic Foot'           | '0.2472026671'
    }
}
