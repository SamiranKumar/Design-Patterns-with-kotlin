package com.samiran.designpatternskotlin.creational.builder.example2


/**
Created by Samiran Kumar on 01,November,2023
 **/

fun main() {

    val component = Component.Builder()
        .setParam1("Param One")
        .setParam2("Param Two")
        .setParam3(true)

}