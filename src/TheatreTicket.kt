class TheatreTicket {
//    val a = 1..18
//    val b = 11
//
//    val cNumber
//    get() = (a+b) / 2

    val one = println("It is number one" +
            "sdsadasdasda")
val two = println("""
    sadsadsaf f dsf ds fds fdsfdsfdsfds
""".trimIndent())



    var ticketPriceAge : Int = 0
        set(value) {
        if (value in 1..17){
            println("You get a 10% discount")
        }else if (value in 18..35){
            println("You get a 15% discount")
        } else{
            println("You get a 30% discount")
        }
                  field = value
        }




}