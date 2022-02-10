class TheatreTicket12 {
    var ticketPrice: Int = 0
        set(value) {
            field = when {
                value < 18 -> 18
                value in 18..30 -> value
                else -> value
            }
        }

    var discountPrice: Int = 0
}

