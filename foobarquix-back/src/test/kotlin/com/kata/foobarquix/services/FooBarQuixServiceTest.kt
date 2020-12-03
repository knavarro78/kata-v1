package com.kata.foobarquix.services

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
internal class FooBarQuixServiceTest{
    @Autowired
    lateinit var fooBarQuixService: FooBarQuixService

    @Test
    fun convertNumber_should_return_1() {
        val result = "1"
        Assertions.assertThat(fooBarQuixService.convertNumber(1)).isEqualTo(result)
    }

    @Test
    fun convertNumber_should_return_FooFoo() {
        val result = "FooFoo"
        Assertions.assertThat(fooBarQuixService.convertNumber(3)).isEqualTo(result)
    }

    @Test
    fun convertNumber_should_return_BarBar() {
        val result = "BarBar"
        Assertions.assertThat(fooBarQuixService.convertNumber(5)).isEqualTo(result)
    }

    @Test
    fun convertNumber_should_return_Quix() {
        val result = "Quix"
        Assertions.assertThat(fooBarQuixService.convertNumber(7)).isEqualTo(result)
    }

    @Test
    fun convertNumber_should_return_Foo() {
        val result = "Foo"
        Assertions.assertThat(fooBarQuixService.convertNumber(9)).isEqualTo(result)
    }

    @Test
    fun convertNumber_should_return_FooBar() {
        val result = "FooBar"
        Assertions.assertThat(fooBarQuixService.convertNumber(51)).isEqualTo(result)
    }

    @Test
    fun convertNumber_should_return_BarFoo() {
        val result = "BarFoo"
        Assertions.assertThat(fooBarQuixService.convertNumber(53)).isEqualTo(result)
    }

    @Test
    fun convertNumber_should_return_FooFooFoo() {
        val result = "FooFooFoo"
        Assertions.assertThat(fooBarQuixService.convertNumber(33)).isEqualTo(result)
    }

    @Test
    fun convertNumber_should_return_FooQuix() {
        val result = "FooQuix"
        Assertions.assertThat(fooBarQuixService.convertNumber(27)).isEqualTo(result)
    }

    @Test
    fun convertNumber_should_return_FooBarBar() {
        val result = "FooBarBar"
        Assertions.assertThat(fooBarQuixService.convertNumber(15)).isEqualTo(result)
    }
}