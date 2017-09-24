import geb.spock.GebSpec


class CalcMainPageSpec extends GebSpec{
    def "Go to main page"(){
        when:
            go baseUrl
        then:
        1==1
    }


}
