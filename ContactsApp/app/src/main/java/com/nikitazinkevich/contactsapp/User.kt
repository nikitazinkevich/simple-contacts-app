package com.nikitazinkevich.contactsapp

data class User(val _id: Long,
                var firstName: String = "Иван",
                var secondName: String = "Иванов",
                var phoneNumber: String = "+375(33)123-45-67")
