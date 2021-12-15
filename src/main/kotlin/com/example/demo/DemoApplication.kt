package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import com.github.demidko.aot.WordformMeaning.lookupForMeanings


@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {
	var meanings = lookupForMeanings("мама")
	println(meanings.size)
	println(meanings.get(0).morphology)
	println(meanings.get(0).lemma.toString())

	for(t in meanings.get(0).transformations){
		println(t.toString() + " " + t.morphology)
	}

	runApplication<DemoApplication>(*args)
}
