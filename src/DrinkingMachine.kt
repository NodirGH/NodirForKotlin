abstract class DrinkingMachine(
    private val price: Double,
    private val color: String
) {
   abstract val brand: String

    abstract fun makeDrinking(): String

   open fun infoYourOrder (): String{
      return  "Information\n" +
              "            Price: $price\n" +
              "            Color: $color\n"


    }
}
