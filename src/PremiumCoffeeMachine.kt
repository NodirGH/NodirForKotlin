 class PremiumCoffeeMachine(
    private val price: Double,
    private val color: String
) : BaseCoffeeMachine(price, color) {

    fun makeCappuccino(){
        println("Your cappuccino is almost ready!")
    }
    fun makeCoffee1() {
        makeCoffee("pizza")
    }

     override val brand: String
         get() = "Brand X"

     override fun makeCoffee(type: String): String {
       return  "Your $type is ready"

     }




 }