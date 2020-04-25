package org.micronaut.sample

import io.micronaut.http.HttpResponse
import io.micronaut.http.MutableHttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/")
class SampleController(){

    @Get()
    fun index(): MutableHttpResponse<String> {
        return HttpResponse.ok("Hello World")
    }
}
