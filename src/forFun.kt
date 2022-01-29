import kotlin.math.abs
import kotlin.math.sign


import java.util.*

fun forFun() {
    var matrixUser: Array<IntArray>? = null  // reference = object  ; just type = the real thing ; design = real home

    do {
        println(
            "\nMENU" +
                    "\n1. Accept elements of Matrix" +
                    "\n2. Display elements of  Matrix" +
                    "\n3. Sum of all elements of matrix" +
                    "\n4. Display row-wise sum of matrix" +
                    "\n5. Display column-wise sum of matrix" +
                    "\n6. Exit"
        )
        println("Enter your choice")
        val userChoice = scanner.nextInt()

        when (userChoice) {
            1 -> {
                matrixUser = acceptElementsOfMatrix()
            }
//    2 -> displayNumbersOfMatrix()
//    3 -> SumOfMatrix()
//    4 -> DisplayRow-wiseSumOfMatrix()
//    5 -> DisplayColumn-wiseSumOfMatrix()
            6 -> println("You EXIT the program")
        }


    } while (userChoice != 6)
}

fun acceptElementsOfMatrix(): Array<IntArray> {
    println("Enter the size of the matrix: ")

    val sizeOfMatrix = readLine()!!.toInt()
    val userMatrix = Array(sizeOfMatrix) { IntArray(sizeOfMatrix) }

    println("The number of Rows and Columns is: $sizeOfMatrix X $sizeOfMatrix")

    println("If you want to input each number manually, press 1. If you press 2, table will be filled automatically")
    val userChoice = readLine()!!.toInt()
    if (userChoice == 1) {
        for (row in 0 until userMatrix.size) {
            val columnArray = IntArray(userMatrix.size)
            for (column in 0 until columnArray.size) {
                val inputNumber = readLine()!!.toInt()
                columnArray[column] = inputNumber
            }
            userMatrix[row] = columnArray
        }

    } else if (userChoice == 2) {
        for (row in 0 until userMatrix.size) {
            val columnArray = IntArray(userMatrix.size)
            for (column in 0 until columnArray.size) {
                val inputNumber = (0..100).random()
                columnArray[column] = inputNumber
            }
            userMatrix[row] = columnArray
        }
    }

    return userMatrix


}


//fun displayElementsOfMatrix(): Array<IntArray> {
//    println("The numbers which you entered are: ")
//    for (index in 0 until userMatrix.size)
//
//}