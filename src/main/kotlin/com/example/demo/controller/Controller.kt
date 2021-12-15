package com.example.demo.controller

import com.github.demidko.aot.WordformMeaning
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["/hello/"])

class Controller {
    @GetMapping("{word}")
    fun hello(@PathVariable word:String): ResponseEntity<String> {
        val list = ArrayList<String>()
        var meanings = WordformMeaning.lookupForMeanings("$word")
        for(t in meanings.get(0).transformations){
            list.add("<br>" + t.toString() + " " + t.morphology)
        }
        return ResponseEntity.ok("$list")
    }
}