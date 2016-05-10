package qotd

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Quote)
class QuoteSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    def "test for valid quote text"() {
		when: 'text is empty'
		def p = new Quote(text: '')
		
		then: 'validation should fail'
		!p.validate()
		
		when: 'text is null'
		def x = new Quote(text: null)
		
		then: 'validation should fail'
		!x.validate()
		
		when: 'text is valid'
		def y = new Quote(text: 'Valid')
		
		then: 'validation should pass'
		y.validate()
	}
}
