class CoffeeMachine (
    price: Double,
    color: String
): BaseCoffeeMachine(price, color){
    override val brand: String
        get() = "Brand Y"


    override fun makeCoffee(type: String): String {
        println("Your order will be ready in 7 seconds")
        Thread.sleep(7000)
        return "Your $type is ready"
    }

}