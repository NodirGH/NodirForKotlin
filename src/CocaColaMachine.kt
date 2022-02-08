import java.awt.Color

 class ColaMachine(
     private val price: Double,
     private val color: String
 ): DrinkingMachine(price, color){
     override val brand: String
         get() = "Brand X"

     override fun makeDrinking(): String {
         return "Here is your order"
     }
 }

