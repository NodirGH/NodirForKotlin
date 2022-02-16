class MovieNames {
    val movieNames = println(
        """

                                Welcome to our wonderful theatre!
        We offer you fantastic movies. Please choose the number of the movie which you want to watch!

                1. Avengers Infinity War  (Price: 30$)
                2. Terminal               (Price: 25$)
                3. Captain America        (Price: 20$)
                4. Avengers Endgame       (Price: 40$)
                5. SpiderMan No Way Home  (Price: 50$)

          Thank you for choosing our theatre!

                    Please choose movie number: 
             """.trimIndent()
    )

    val yourChoice = readLine()!!.toInt()

    val greatNews = println(
        """

                                    GREAT NEWS!
        We have discount for you. To get discount, please fill in the following form.

    """.trimIndent()
    )

  open fun displayMovieName() {
        when (yourChoice) {
            1 -> println("Avengers Infinity War")
            2 -> println("Terminal")
            3 -> println("Captain America")
            4 -> println("Avengers Endgame")
            5 -> println("SpiderMan No Way Home")
        }
    }
}