package com.jabaddon.grails.domainmodellingexamples

class Lightsaber {
    String color
    static belongsTo = [owner: Jedi]

    static constraints = {
    }
}
