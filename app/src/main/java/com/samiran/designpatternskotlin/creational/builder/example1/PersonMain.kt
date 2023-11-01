package com.samiran.designpatternskotlin.creational.builder.example1


/**
Created by Samiran Kumar on 01,November,2023
 **/

fun main() {

    val person = PersonWithBuilder.Builder(
        firstName = "Samiran",
        lastName = "Halder",
        gender = "Male",
        phone = "012090990"
    )
        .setDob("1/12/1992")
        .build()

    println(person?.firstName)
    println(person?.dob)
}