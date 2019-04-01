package jp.co.linnefromice.todolistKotlin01

import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TodolistKotlin01Application : CommandLineRunner {

	private val logger = LoggerFactory.getLogger(javaClass)

	override fun run(vararg args: String?) {
		logger.info("START APPLICATION")
	}
}

fun main(args: Array<String>) {
	runApplication<TodolistKotlin01Application>(*args)
}
