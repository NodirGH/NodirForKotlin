class MoviePrice (one1: Int, two: Int, three: Int, four: Int, five: Int){

    var ticketPriceAge : Int = 0
        set(value) {
            when (value) {
                in 1..17 -> {
                    println("You get a 10% discount")
                }
                in 18..35 -> {
                    println("You get a 15% discount")
                }
                else -> {
                    println("You get a 30% discount")
                }
            }
            field = value
        }

    }



