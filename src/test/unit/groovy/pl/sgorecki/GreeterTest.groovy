package pl.sgorecki
/**
 * @author Sebastian Górecki <gorecki.sebastian@gmail.com>
 */
class GreeterTest extends spock.lang.Specification {
    def "should greet you with your name"() {
        given:
        def name = "Sebastian"

        expect:
        new Greeter().greet(name) == "Hello, Sebastian"
    }
}
