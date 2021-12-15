package com.example.demo

import com.github.demidko.aot.WordformMeaning.lookupForMeanings
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class DemoApplicationTests {


    @Test
    fun lemma() {
        println("Test #1!")
        var meanings = lookupForMeanings("мамы")
        println(meanings[0].lemma.toString())
        println(assertEquals(meanings[0].lemma.toString(), "мама"))
    }
}
