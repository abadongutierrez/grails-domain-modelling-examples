package com.jabaddon.grails.domainmodellingexamples

class Jedi {
    String name
    static hasOne = [lightsaber: Lightsaber]

    static constraints = {
    }
}
