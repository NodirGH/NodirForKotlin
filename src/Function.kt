import java.lang.Math.pow
import java.util.*
import kotlin.math.*

val scanner = Scanner(System.`in`)

fun hiWorld() {
    println("Hello world")
}

//fun singlePrint () {
//    val subject = "Subject"
//    val marks = "Marks"
//    val mathematics = "Mathematics"
//    val computer = "Computer"
//    val chemistry = "Chemistry"
//    val a = 90
//    val b = 77
//    val c = 69
//
//    printn(subject /n mathematics)
//}

fun sum() {

    println("Enter any number")

    val a = scanner.nextInt()
    println("Enter another number")

    val b = scanner.nextInt()

    val result = a + b
    println("The sum of $a and $b is $result")
}


fun temperature() {
    println("Enter temperature in Farenheit")
    val faren = scanner.nextDouble()

    val cel = (faren - 32) / 1.8

    println("It is $cel in centigrade")
}

fun swap() {

    println("Enter A number")
    var numberA = scanner.nextInt()
    println("Enter B number")
    var numberB = scanner.nextInt()

    val c = numberA
    numberA = numberB
    numberB = c
    println("Now A = $numberA, and B = $numberB")
}

/**
 * Variable
 * task 1
 *
 */
fun ascii() {
    println("Enter any character")
    val charac = scanner.nextInt(); scanner.nextLine()

    println(charac.hashCode())
}

fun radius() {
    println("Enter radius")
    val a = scanner.nextDouble()

    val result = a * 2

    println("Diameter is $result")
}


fun positiveMinus() {
    println("Enter number")
    val a = scanner.nextInt()

    when {
        a > 0 -> println("$a is positive")
        a == 0 -> println("$a is neutral")
        else -> println("$a is minus")
    }
}


fun evenOdd() {
    println("Enter number")

    val a = scanner.nextInt()
    if (a % 2 == 0) {
        println("It is even number")
    } else {
        println("It is odd number")
    }
}


fun swapTwo() {
    println("Enter A number")
    var a = scanner.nextInt()
    println("Enter B number")
    var b = scanner.nextInt()

    a += b
    b = a - b
    a -= b

    println("Now A = $a, B = $b")
}


fun biggestNumber() {
    println("Enter first number")
    val a = scanner.nextInt()

    println("Enter second number")
    val b = scanner.nextInt()

    println("Enter third number")
    val c = scanner.nextInt()

    if (a > b && a > c) {
        println("$a is the biggest")
    } else if (b > a && b > c) {
        println("$b is the biggest")
    } else {
        println("$c is the biggest")
    }
}


fun year() {
    println("Enter number")

    val a = 365
    val year = scanner.nextLong()
    val years = year / a
    val month = year % a / 30
    val day = year % a % 30

    println("$years year $month months $day days")
}


fun absoluteNumber() {
    println("Enter number")
    val number = scanner.nextInt()

    if (number >= 0) {
        println("Absolute number is $number")
    } else {
        println("Absolute number is $number")
    }
}


fun discount() {
    println("Write what you buy")
    var thing = scanner.nextLine()

    println("How many do you buy (item or kilogram or liter)")
    val amount = scanner.nextInt()

    println("How much does it cost (each item)")
    val price = scanner.nextInt()

    val overallPrice = amount * price

    val discount = overallPrice / 100 * 90

    if (overallPrice >= 5000) {
        println("You are given 10% discount and you can pay $discount")

    } else {
        println("You are not eligible for discount and you have to pay $overallPrice")
    }
}


fun profitLost() {
    println("Write what you trade")
    var thing = scanner.nextLine()

    println("How much does its real price cost?")
    val price = scanner.nextInt()

    println("Write its selling price")
    val sellingPrice = scanner.nextInt()

    println("Write how much did you sell")
    val amount = scanner.nextInt()

    val profit = (sellingPrice - price) * amount

    val harm = (sellingPrice - price) * amount

    if (profit > 0) {
        println("You have made good profit which is $profit")
    } else {
        println("You are not in profit. You lost $harm")
    }
}


fun whoIsYoungest() {
    println("Enter Ram's age")
    val Ram = scanner.nextInt()

    println("Enter Suabh's age")
    val Sulabh = scanner.nextInt()

    println("Enter Ajay's age")
    val Ajay = scanner.nextInt()

    if (Ram < Sulabh && Ram < Ajay) {
        println("Ram is youngest. He is $Ram years old")
    } else if (Sulabh < Ram && Sulabh < Ajay) {
        println("Sulabh is youngest. He is $Sulabh years old")
    } else {
        println("Ajay is youngest. He is $Ajay years old")
    }
}


fun triangle() {
    println("Enter degree of A")
    val a = scanner.nextInt()

    println("Enter degree of B")
    val b = scanner.nextInt()

    println("Enter degree of C")
    val c = scanner.nextInt()

    if (a + b + c == 180) {
        println("Triangle is valid")
    } else {
        println("Triangle is not valid")
    }
}


fun leapYear() {
    println("Enter any year")
    val year = scanner.nextInt()

    if (year % 4 == 0) {
        println("$year is leap year")
    } else {
        println("$year is not leap year")
    }
}

//set 1 task 8
fun grossSalary() {
    println("Enter salary (Rs)")
    val salary = scanner.nextInt()

    val HRA = salary / 100 * 10
    val DA1 = salary / 100 * 90

    val DA2 = salary / 100 * 98

    if (salary < 1500) {
        println("HRA = $HRA")
        println("DA = $DA1")
    } else if (salary >= 1500) {
        println("HRA = $HRA")
        println("DA =  $DA2")
    }
}


//fun telephoneBills () {
//    println("How much have you made phone calls this month?")
//    val amount = sc.nextInt()
//
//
//
//    if(amount < 100) {
//        println("You have to 200 Rs")
//    } else if (amount < 101..150) {
//        println()
//    }
//}


// set 2 task 1
fun set2Task1() {
    var a = 1
    while (a < 11) {
        println(a)
        a++
    }
}


//set 2 task 2
fun set2Task2() {
    var a = 1
    var sum = 0
    while (a <= 10) {
        sum += a
        a++
    }
    println(sum)
}


fun factorial() {
    println("Enter any number")
    var a = scanner.nextInt()
    var b = 1


    while (a >= 1) {
        b *= a
        a--


    }
    println("Factorial: $b")
}


fun power() {
    println("Enter number")
    val number = scanner.nextDouble()

    println("Enter another number which is raised to the power")
    val power = scanner.nextDouble()

    val a = number.pow(power)
    println(a)
}


/**Flow of control
 * Set 3 Task 1
 * Write a program to print following
i)
 **********
 **********
 **********
 **********
 */

fun forLoop() {
    for (i in 1..4) {
        for (j in 1..10) {
            print("*")
                    }
        println()
    }
}


/** Flow of control
Set 3 Task 2
Write a program to print following
 *
 **
 ***
 ****
 *****
 */

fun makeLoop1To5() {

    for (i in 1..5) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }
}


/** Flow of control
Set 3 Task 3
Write a program to print following
iii)
     *
    **
   ***
  ****
 *****
 */
fun loop1To5() {
    for (i in 1..5) {
        for (l in 5 downTo i) {
            print(" ")
        }
        for (j in 1..i) {
            print("*")
        }
        println()
    }
}


/** Flow of control
Set 3 Task 1
Write a program to print following
iv)
     *
    ***
   *****
  *******
 *********
 */
fun christmasTree() {
    for (i in 1..5) {
        for (j in 5 downTo i) {
            print(" ")
        }
        for (k in 0 until (i * 2 - 1)) {
            print("*")
        }
        println()
    }

}

/**
v)

1
222
33333
4444444
555555555
 */
fun numberTree() {
    for (generalRows in 1..5) {
        for (space in 5 downTo generalRows) {
            print(" ")
        }
        for (eachRows in 0 until (generalRows * 2 - 1)) {
            print(generalRows)
        }
        println()
    }
}

/**
vi)

1
212
32123
4321234
543212345
 */
fun palindromeNumberTree() {
    for (generalRows in 1..5) {
        for (space in 5 downTo generalRows) {
            print(" ")
        }
        for (eachRows in generalRows downTo 1) {
            print(eachRows)
        }
        for (eachRowsTwo in 2..generalRows) {
            print(eachRowsTwo)
        }

        println()
    }
}


/** Flow of control
 * set 3 task 2
 * Write a program to compute sinx for given x. The user should supply x
 * and a positive integer n. We compute the sine of x using the series and
 * the computation should use all terms in the
 * series up through the term involving xn
 * sin x = x - x3/3! + x5/5! - x7/7! + x9/9!
Enter the value of x : 1
Enter the value of n : 10
sin 1 = 0.841471
 */
fun computeSinX() {
    println("Enter positive number for x")
    val x = scanner.nextInt()

    println("Enter positive number that powers")
    val n = scanner.nextInt()
    var number = 0
    var condition = true

    for (index in 0 until n){
        if (index % 2 == 0) {
            number += index
        }
    }
        val result =3 % 2
    println(result)



}

/**
Write a program to compute the cosine of x. The user should supply x and a positive integer n.
We compute the cosine of x using the series and the computation should use all terms
in the series up through the term involving xn
cos x = 1 - x2/2! + x4/4! - x6/6!

Enter the value of x : 1
Enter the value of n : 5
cos 1 = 0.541667
 */
fun computeCosine() {
    println("Enter positive number for x")
    val numberX = scanner.nextDouble()

    println("Enter positive number that powers")
    val power = scanner.nextDouble()

    val calcOne = numberX.pow(2) / 2    //should be added !
    val calcTwo = numberX.pow(4) / 4    //should be added !
    val calcThree = numberX.pow(6) / 6  //should be added !

    val calcAll = 1 - calcOne + calcTwo - calcThree

    println(calcAll)
}


/** Library function
 * Set 1  task 1
 * Write a program which input principal, rate and time from user
 * and calculate compound interest.
CI = P(1+R/100)T - P
 */
fun calculateCompoundInterest() {
    println("Enter principal, rate and time")
    val principal = scanner.nextDouble()
    val rate = scanner.nextDouble()
    val time = scanner.nextDouble()

    val interest = principal * pow((1 + rate / 100), time) - principal
    println("Compound interest is $interest")
}


/** Library function
 * set 1 task 2
 * Write a program to compute area of triangle. Sides are input by user.
Area = sqrt(s*(s-a)*(s-b)*(s-c))
where s=(a+b+c)/2
 */
fun computeAreaOfTriangle() {
    println("Enter 3 sides")
    val sideA = scanner.nextDouble()
    val sideB = scanner.nextDouble()
    val sideC = scanner.nextDouble()

    val s = (sideA + sideB + sideC) / 2
    val area = sqrt(s * (s - sideA) * (s - sideB) * (s - sideC))

    println("$area")
}


/** Library function
 * set 1 task 3
 *Write a program to check character entered is alphabet,
 * digit or special character using library functions.
 */

fun showCharacters() {
    println("Enter any character")
    val char = scanner.next()[0]
    when {
        char.isDigit() -> println("$char is digit")
        char.isLetter() -> println("$char is alphabet")
        else -> println("$char is special character")
    }
}


/** Library function
 * set 1 task 4
 * Write a program which display a number between 10 to 100 randomly
 */
fun findRandomNumber() {
    val random = (10..100).random()
    println("$random is selected randomly")
}

/** Library function
 * set 1 task 5
 * Write a program which accept a letter and display it in uppercase letter
 */
fun MakeUppercase() {
    println("Write any letter")
    val letter = scanner.next()
    println(letter.toUpperCase())
}

/** Library function
 * set 1 task 6
 * Write a program which accept a letter and display it in uppercase letter
 */
fun randomLotto() {
    println("Enter 5 number between 1 and 36")
    val size = 5
    val user = IntArray(size)
    for (index in 0..4) {
        val inputNumbers = scanner.nextInt()
        user[index] = inputNumbers
    }
    println("Your numbers are: ")
    for (index in 0..4) {
        print("${user[index]}\t")
    }
    println()
    println("Winning numbers are: ")
    for (index in 0..4) {
        print("${(1..36).random()}\t")
    }

}


/**   User Defined Function
 *  set 1 task 1
 *  Write a program using function which accept two integers as an argument
 *  and return its sum.  *  Call this function from main( )
 *  and print the results in main( )
 */
fun sumOfTwoNumbers() {
    println("Enter any number")
    val number1 = scanner.nextInt()

    println("Enter another number")
    val number2 = scanner.nextInt()

    val sum = number1 + number2
    println("The sum of these two numbers is $sum")
}


/** User Defined Function
 * set 1 task 2
 * Write a function to calculate the factorial value of any integer as an argument.
 * Call this function from main( ) and print the results in main( )
 */
fun findFactorial() {
    println("Enter number to find its factorial")
    val userNumber = scanner.nextInt()
    var factorial: Long = 1

    for (i in factorial..userNumber) {
        factorial *= i.toLong()
    }
    println("Factorial of $userNumber is $factorial")
}


/**  User Defined Function
 * set 1 task 3
 * Write a function that receives two numbers as an argument and
 * display all prime numbers between these two numbers.
 * Call this function from main( )
 */
fun findPrimeNumbers() {
    println("To find prime numbers, fist you should enter two numbers")
    val prime1 = scanner.nextInt()
    val prime2 = scanner.nextInt()


    for (i in prime1..prime2) {
        if (i % 2 == 0)
            continue
        else if (i % 3 == 0)
            continue
        else println(i)

    }
}


/**  User Defined Function
 * set 1 task 4
 * Raising a number to a power p is the same as multiplying n by itself p times.
 * Write a function called power that takes two arguments,
 * a double value for n and an int value for p,
 * and return the result as double value. Use default argument of 2 for p,
 * so that if this argument is omitted the number will be squared.
 * Write the main function that gets value from the user to test power function.
 */
fun raisingNumberToPower() {
    println("Enter number")
    val number = scanner.nextDouble()

    println("Enter its power number")
    val power = scanner.nextDouble()

    val result = number.pow(power)
    val result2 = number.pow(2.0)

    println("The result is  $result")
    println("Kvadrat of $number is $result2")
}


/**  User Defined Function
 * set 1 task 5
 * Write a function called zero_small() that has two integer arguments being passed
 * by reference and sets the smaller of the two numbers to 0.
 * Write the main program to access the function
 */
fun findBiggerAndZero() {
    println("Enter first number")
    val number1 = scanner.nextLong()

    println("Enter second number")
    val number2 = scanner.nextLong()
    if (number1 > number2) {
        println("First number is $number1 \nSecond number is 0")
    } else if (number1 == number2) {
        println("They are equal")
    } else {
        println("First number is 0\nSecond number is $number2")
    }
}

/** User Defined Function
 *  set 2 task 1
 *Write a program that lets the user perform arithmetic operations on two numbers.
 * Your program must be menu driven, allowing the user to select
 * the operation (+, -, *, or /) * and input the numbers. Furthermore,
 * your program must consist of following functions:
1. Function showChoice: This function shows the options to the user
and explains how to enter data.
2. Function add: This function accepts two number as arguments and returns sum.
3. Function subtract: This function accepts two number as arguments
and returns their difference.
4. Function mulitiply: This function accepts two number as arguments
and returns product.
5. Function divide: This function accepts two number as arguments
and returns quotient.
 */
fun calculation() {
    println("Menu")
    println("1: Add\n2: Subtract\n3: Multiply\n4: Divide\n5: Exit")
    println("Enter your choice: ")
    val choice = scanner.nextInt()
    println("Enter two numbers: ")
    val number1 = scanner.nextDouble()
    val number2 = scanner.nextDouble()

    when (choice) {
        1 -> println(number1 + number2)
        2 -> println(number1 - number2)
        3 -> println(number1 * number2)
        4 -> println(number1 / number2)
        5 -> println("You exit from program")
        else -> println("Sorry, you entered invalid number")
    }
}


/** Array - Single Dimension
 * Set 1 task 1
 * Write a C++ program to find the sum and average of one dimensional integer array
 */
fun findSumAndAverageArray() {
    println("Enter size of array")

    val sizeOfArray = scanner.nextInt()
    val userArray = IntArray(sizeOfArray)

    var sum = 0
    println("Enter numbers")
    for (index in 0 until userArray.size) {
        val inputNumbers = scanner.nextInt()
        userArray[index] = inputNumbers
    }

    for (index in userArray) {
        sum += index
    }
    println("The sum of numbers is $sum")

    val divide = sum / userArray.size
    println("Average of array is $divide")
}


/**  Array - Single Dimension
 * set 1 task 2
 * Write a C++ program to swap first and last element of an integer 1-d array
 */
fun swapFirstAndLastElement() {
    println("Enter size of array")

    val sizeOfArray = scanner.nextInt()
    val userArray = IntArray(sizeOfArray)

    println("Enter numbers")
    for (index in 0 until userArray.size) {
        val inputNumber = scanner.nextInt()
        userArray[index] = inputNumber
    }
    println("Numbers which you entered are: ")
    for (index in 0 until userArray.size) {
        print("${userArray[index]}\t")
    }
    println()
    println("After swapping first and last:")
    print("${userArray.last()}\t")
    for (index in 1 until userArray.size - 1) {
        print("${userArray[index]}\t")
    }
    print(userArray.first())
}


/** Array - Single Dimension
 * set 1 task 3
 * Write a C++ program to reverse the element of an integer 1-D array
 */
fun reverseArray() {
    println("Enter array size")

    val sizeOfArray = scanner.nextInt()
    val userArray = IntArray(sizeOfArray)

    println("Enter your numbers")
    for (index in 0 until userArray.size) {
        val inputNumber = scanner.nextInt()
        userArray[index] = inputNumber
    }
    println("Your numbers are: ")
    for (index in 0 until userArray.size) {
        print("${userArray[index]}\t")
    }
    println()
    println("After reversing these numbers: ")
    for (index in userArray.lastIndex downTo 0) {
        print("${userArray[index]}\t")
    }
}


/** Array - Single Dimension
 * set 1 task 4
 * Write a C++ program to find the largest and smallest element of an array
 */
fun findLargestAndSmallestArray() {
    println("Enter your size of array:")
    val sizeOfArray = scanner.nextInt()
    val userArray = IntArray(sizeOfArray)

    println("Enter numbers you want:")
    for (index in 0 until userArray.size) {
        val inputYourNumbers = scanner.nextInt()
        userArray[index] = inputYourNumbers
    }

    var largest = userArray[0]
    for (i in userArray) {
        if (largest < i)
            largest = i
    }
    println("Largest number is $largest")

    var smallest = userArray[0]
    for (number in userArray) {
        if (smallest > number)
            smallest = number
    }
    println("Smallest number is $smallest")
}


/** Array - Single Dimension
 * set 1 task 6
 * P is one-dimensional array of integers. Write a C++ function to
 * efficiently search for a data VAL from P. If VAL is present in
 * the array then the function should return value 1 and 0 otherwise
 */
fun findItem() {
    println("Enter size of array")
    val sizeOfArray = scanner.nextInt()
    println("Size is $sizeOfArray")

    val userArray = IntArray(sizeOfArray)

    println("Enter numbers")
    for (index in 0 until userArray.size) {
        val inputEachNumber = scanner.nextInt()
        userArray[index] = inputEachNumber
    }

    println("Enter number which you want to find:")
    val usersChoice = scanner.nextInt()
    var isFound = false

    for (search in 0 until userArray.size)
        if (usersChoice == userArray[search]) {
            isFound = true
            break
        }


    if (isFound)
        println("Number is found")
    else
        println("Number isn't found")
}


/** Array - Single Dimension
 * set 1 task 7
 * Suppose a one-dimensional array AR containing integers is arranged
 * in ascending order. Write a user-defined function in C++ to search
 * for an integer from AR with the help of Binary search method,
 * returning an integer 0 to show absence of the number and integer 1
 * to show presence of the number in the array. Function should have
 * three parameters : (i) array AR (ii) the number to be searched and
 * (iii) the number of elements N in the array.
 */


fun findItemBinaryOption() {
    println("Enter numbers with space bar")
    val inputNumbers = readLine()!!.split(' ').map(String::toInt)
    val sortingNumbers = inputNumbers.sorted()

    println("Enter the number which you want to find")
    val searchingNumber = readLine()!!.toInt()

    var low = 0
    var high = sortingNumbers.size - 1

    var stepCount = 0
    var isNumberFound = false

    while (low <= high) {
        val mid = (low + high) / 2
        val guess = sortingNumbers[mid]

        stepCount++

        when {
            guess == searchingNumber -> {
                println("Your number $searchingNumber is found in $stepCount steps")
                isNumberFound = true
            }
            guess > searchingNumber -> high = mid - 1
            else -> low = mid + 1
        }
        if (isNumberFound) break                // ATTENTION!!!   why  do we need this line?
    }
    if (!isNumberFound) {
        println("Your number isn't found")
    }
}


/** Array - Single Dimension
 * set 1 task 8
Suppose A, B, C are arrays of integers of size M, N, and M + N respectively. The numbers in array A appear
in ascending order while the numbers in array B appear in descending order. Write a user defined function
in C++ to produce third array C by merging arrays A and B in ascending order. Use A, B and C as arguments in the function
 */
fun mergingArraysInAscendingOrder() {
    println("Enter  size of Array:")
    val sizeOfArray = scanner.nextInt()
    val userArray = IntArray(sizeOfArray)

    println("Enter numbers in ascending order")
    for (index in 0 until userArray.size) {
        val inputNumbers = scanner.nextInt()
        userArray[index] = inputNumbers
    }

    println("Enter second size of array:")
    val sizeOfSecondArray = scanner.nextInt()
    val userSecondArray = IntArray(sizeOfSecondArray)

    println("Enter numbers descending order")
    for (indexTwo in 0 until userSecondArray.size) {
        val inputSecondNumbers = scanner.nextInt()
        userSecondArray[indexTwo] = inputSecondNumbers
    }
    println("Merged array in ascending order is:")
    val mergingArray = userArray.plus(userSecondArray)

    for (index in 1 until mergingArray.size) {
        if (mergingArray[index] < mergingArray[index - 1]) {
            var comingIndex = index
            for (innerIndex in index downTo 0) {
                if (mergingArray[comingIndex] < mergingArray[innerIndex]) {
                    val temp = mergingArray[comingIndex]
                    mergingArray[comingIndex] = mergingArray[innerIndex]
                    mergingArray[innerIndex] = temp
                    comingIndex = innerIndex
                }
            }
        }
    }

    println("Sorted numbers are:")
    for (index in 0 until mergingArray.size) {
        print("${mergingArray[index]}\t")
    }
}

/** Array - Single Dimension
 * set 1 task 9
 * Suppose X. Y, Z are arrays of integers of size M, N, and M + N respectively. The numbers in array X and Y
 * appear in descending order. Write a user-defined function in C++ to produce third array Z by merging arrays
 * X and Y in descending order
 */

fun mergingArraysInDescendingOrder() {
    println("Enter  size of Array:")
    val sizeOfArray = scanner.nextInt()
    val userArray = IntArray(sizeOfArray)

    println("Enter numbers in ascending order")
    for (index in 0 until userArray.size) {
        val inputNumbers = scanner.nextInt()
        userArray[index] = inputNumbers
    }

    println("Enter second size of array:")
    val sizeOfSecondArray = scanner.nextInt()
    val userSecondArray = IntArray(sizeOfSecondArray)

    println("Enter numbers descending order")
    for (indexTwo in 0 until userSecondArray.size) {
        val inputSecondNumbers = scanner.nextInt()
        userSecondArray[indexTwo] = inputSecondNumbers
    }
    println("Merged array in descending order is:")
    val mergingArray = userArray.plus(userSecondArray)

    for (index in 1 until mergingArray.size) {
        if (mergingArray[index] > mergingArray[index - 1]) {
            var comingIndex = index
            for (innerIndex in index downTo 0) {
                if (mergingArray[comingIndex] > mergingArray[innerIndex]) {
                    val temp = mergingArray[comingIndex]
                    mergingArray[comingIndex] = mergingArray[innerIndex]
                    mergingArray[innerIndex] = temp
                    comingIndex = innerIndex
                }
            }
        }
    }


    for (index in 0 until mergingArray.size) {
        print("${mergingArray[index]}\t")
    }
}


/** Array - Single Dimension
 * set 1 task 10
 * Given two arrays of integers A and B of sizes M and N respectively. Write a function named MIX () with four arguments,
 * which will produce a third array named C. such that the following sequence is followed.
All even numbers of A from left to right are copied into C from left to right.
All odd numbers of A from left to right are copied into C from right to left.
All even numbers of B from left to right are copied into C from left to right.
All old numbers of B from left to right are copied into C from right to left.
A, B and C are passed as arguments to MIX (). e.g., A is {3, 2, 1, 7, 6, 3} and B is {9, 3, 5, 6, 2, 8, 10} the resultant
array C is {2, 6, 6, 2, 8, 10, 5, 3, 9, 3, 7, 1, 3}
 */
fun createMixedArrayC () {
    println("Enter size of the first array")
    val sizeOfFirstArray = readLine()!!.toInt()
    val arrayA = IntArray(sizeOfFirstArray)

    println("Enter number for the first array")
    for (index in 0 until arrayA.size) {
        val inputFirstArray = readLine()!!.toInt()
        arrayA[index] = inputFirstArray
    }

    println("Enter size of second array")
    val sizeOfSecondArray = readLine()!!.toInt()
    val arrayB = IntArray(sizeOfSecondArray)

    println("Enter numbers for the second array")
    for (index in 0 until arrayB.size) {
        val inputSecondArray = readLine()!!.toInt()
        arrayB[index] = inputSecondArray
    }

    println("The numbers which you entered for the first array are: ")
    for (index in 0 until arrayA.size) {
        print("${arrayA[index]}\t")
    }
    println()
    println("The numbers which you entered for the second array are: ")
    for (index in 0 until arrayB.size) {
        print("${arrayB[index]}\t")
    }

    println()
    println("Array C is equal to: ")
    var actionFirst: Int
    for (evenLeftToRight in 0 until arrayA.size) {
        if (arrayA[evenLeftToRight] % 2 == 0) {
            print("${arrayA[evenLeftToRight]}\t")
        }
    }

    for (evenLeftToRight in 0 until arrayB.size) {
        if (arrayB[evenLeftToRight] % 2 == 0) {
            print("${arrayB[evenLeftToRight]}\t")
        }
    }

    for (oddRightToLeft in arrayB.lastIndex downTo 0){
        if (arrayB[oddRightToLeft] % 2 == 1) {
            print("${arrayB[oddRightToLeft]}\t")
        }
    }

    for (oddRightToLeft in arrayA.lastIndex downTo 0){
        if (arrayA[oddRightToLeft] % 2 == 1) {
            print("${arrayA[oddRightToLeft]}\t")
        }
    }
}


/** String
 *  set 1 task 1
 *  Write a program to find the length of string
 */

fun findLength() {
    println("Enter string")
    val name = scanner.next()
    println("The length of string is ${name.length} ")
}


/** String
 *  set 1 task 2
 *  Write a program to display string from backward
 */

fun findBackwardString() {
    println("Write your words")

    val string = scanner.nextLine()
    val backward = string.reversed()

    println(backward)
}


/** String
 *  set 1 task 3
 *  Write a program to count number of words in string
 */

fun countNumberInString() {
    println("Write your words")

    val string = scanner.nextLine()
    var count = 0

    val stringArray = string.split(" ")

    for (a in stringArray) {
        if (a != "") {
            count++
        }
    }

    println("The number of words are $count")
}


/** String
 *  set 1 task 4
 *  Write a program to concatenate one string contents to another
 */

fun concatenateStringToAnother() {
    println("Enter first string")
    val firstString = scanner.nextLine()

    println("Enter second string")
    val secondString = scanner.nextLine()

    println("After adding it is $firstString $secondString")
}


/** String
 *  set 1 task 5
 *  Write a program to compare two strings they are exact equal or not
 */

fun compareTwoString() {
    println("Enter first string")
    val firstString = scanner.nextLine()

    println("Enter second string")
    val secondString = scanner.nextLine()

    if (firstString == secondString) {
        println("They are equal")
    } else {
        println("They are not equal")
    }
}


/** String
 *  set 1 task 6
 *  Write a program to check a string is palindrome or not
 */
fun findPalindrome() {
    println("Enter your word")
    val word = scanner.nextLine()

    val lowCase = word.toLowerCase()
    val reverse = word.reversed()

    if (lowCase == reverse) {
        println("$word is palindrome word")
    } else {
        println("$word is not palindrome")
    }
}


/** String
 *  set 1 task 7
 *  Write a program to find a substring within a string.
 *  If found display its starting position
 */
fun findStringWithinString() {
    println("Write your word")
    val word = scanner.nextLine()

    println("Write your another word")
    val subString = scanner.nextLine()

    val lengthOne = word.length
    val lengthTwo = subString.length

    val lengthThree = lengthOne - lengthTwo

    val contain = word.contains(subString)

    if (word.contains(subString)) {
        val firstPart = word.split(subString)[0]
        println("Substring is found at ${firstPart.length + 1}")
        println("Substring is end at ${subString.length + firstPart.length}")
    } else {
        println("Substring is not found")
    }
}


/** String
 *  set 1 task 8
 *  Write a program to reverse a string
 */
fun reverseString() {
    println("Write your word")

    val string = scanner.nextLine()
    val reverse = string.reversed()

    println(reverse)
}


/** String
 *  set 1 task 9
 *  Write a program to convert a string in lowercase
 */
fun convertLowercase() {
    println("Write your word")

    val string = scanner.nextLine()
    val lowercase = string.toLowerCase()

    println(lowercase)
}


/** String
 *  set 1 task 10
 *  Write a program to convert a string in lowercase
 */
fun convertUppercase() {
    println("Write your word")

    val string = scanner.nextLine()
    val uppercase = string.toUpperCase()

    println(uppercase)
}

