package pl.sgorecki

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.SpringApplicationContextLoader
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification

/**
 * @author Sebastian Górecki <gorecki.sebastian@gmail.com>
 */
@ContextConfiguration(loader = SpringApplicationContextLoader.class, classes = [Application.class])
class SimpleServiceTest extends Specification {
    @Autowired
    SimpleService simpleService;

    def "simple service after injection should not be null"() {
        expect:
        simpleService != null
    }
}
