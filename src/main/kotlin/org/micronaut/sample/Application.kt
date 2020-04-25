package org.micronaut.sample

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("org.micronaut.sample")
                .mainClass(Application.javaClass)
                .start()
    }
}
