package com.samiran.designpatternskotlin.creational.builder.example1


/**
Created by Samiran Kumar on 01,November,2023
 **/
class PersonWithBuilder private constructor(
    val firstName: String,
    val lastName: String,
    val gender: String,
    val phone: String,
) {

    var phoneCode: String? = null
        private set

    var date: String? = null
        private set

    var language: String? = null
        private set

    var cc: String? = null
        private set

    var dob: String? = null
        private set

    class Builder internal constructor(
        val firstName: String,
        val lastName: String,
        val gender: String,
        val phone: String,
    ) {
        private var personWithBuilder: PersonWithBuilder? = null

        init {
            personWithBuilder = PersonWithBuilder(firstName, lastName, gender, phone)
        }

        internal fun build(): PersonWithBuilder? {
            return personWithBuilder
        }

        fun setPhoneNumber(phoneNumber: String): Builder {
            personWithBuilder?.phoneCode = phoneNumber
            return this
        }

        fun setDate(date: String): Builder {
            personWithBuilder?.date = date
            return this
        }

        fun setLanguage(language: String): Builder {
            personWithBuilder?.language = language
            return this
        }

        fun setCC(cc: String): Builder {
            personWithBuilder?.cc = cc
            return this
        }

        fun setDob(dob: String): Builder {
            personWithBuilder?.dob = dob
            return this
        }
    }
}