class Person(val _firstName: String = "UNKNOWN", var _age: Int = 0){
    val firstName = _firstName.capitalize()
    val age: Int = _age

init {
   println("First name is $firstName\n" +
            "Age is $age")
}

}

