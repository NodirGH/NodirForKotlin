open class Person(name: String, age: Int) {
    init {
        println("My name is $name")
        println("I am $age years old")
    }
}


class MathTeacher(name: String, age: Int) : Person(name, age) {
        fun teachMath(){
            println("I can teach  math to students")
        }
}


class Footballer (name: String, age: Int): Person(name, age){
    fun playFootball(){
        println("I play football")
    }
}