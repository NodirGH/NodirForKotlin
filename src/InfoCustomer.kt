class InfoCustomer (surname: String, name: String, age: Int, movieName: String, priceOfmovie: Int, discount: Int, finalPayment: Int){

    val customerInformationForPayment = println("""
                                    CUSTOMER INFORMATION FOR PAYMENT
                            Customer surname:               $surname
                            Customer name:                  $name
                            Customer age:                   $age
                            Movie customer choose:          $movieName
                            Price of movie:                 $priceOfmovie $
                            Available discount:             $discount %
                            final payment:                  $finalPayment $
                     
        
    """.trimIndent())


}