fun oopMain() {

    val movieNames = MovieNames()
    val yourChoice = movieNames.yourChoice
    val discount = FillFormForDiscount()
    val fillingSurname = discount.fillSurname
    val usersSurname = discount.userSurname
    val fillingName = discount.fillName
    val usersName = discount.userName
    val filingAge = discount.fillAge
    val usersAge =  discount.userAge

    val informationForPayment = InfoCustomer(usersSurname, usersName, usersAge, "Name of movie", 50, 30, 35)
    informationForPayment.customerInformationForPyment





}


