package com.jabaddon.grails.domainmodellingexamples

import static org.junit.Assert.*
import org.junit.*

class JediTests {

    @Before
    void setUp() {
        // Setup logic here
    }

    @After
    void tearDown() {
        // Tear down logic here
    }

    @Test
    void testCreateNewJedi() {
        Jedi benKenobi = new Jedi(name: "Ben Kenobi")
        Lightsaber bluels = new Lightsaber(color: "blue")
        benKenobi.lightsaber = bluels
        bluels.owner = benKenobi
        benKenobi.save(validate: true, failOnError: true, flush: true)
    }
}
