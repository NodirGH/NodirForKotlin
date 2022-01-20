/** Array - Single Dimension
 * set 1 task 5
 * Write a menu driven C++ program with following option
a. Accept elements of an array
b. Display elements of an array
c. Sort the array using insertion sort method
d. Sort the array using selection sort method
e. Sort the array using bubble sort method
Write C++ functions for all options.
The functions should have two parameters name of the array and number of
elements in the array.
 */
fun arrayOptions() {
    println("Enter size of array")
    val sizeOfArray = scanner.nextInt()
    val userArray = IntArray(sizeOfArray)

    do {
        println( "\nMENU" +
                "\n1. Accept elements of Array" +
                "\n2. Display elements of  Array" +
                "\n3. Sort the array using insertion sort method" +
                "\n4. Sort the array using selection sort method" +
                "\n5. Sort the array using bubble sort method" +
                "\n6. Exit")
        println("Enter your choice")
        val userChoice = scanner.nextInt()

        when(userChoice) {
            1 -> acceptElements (userArray)
            2 -> displayNumbers (userArray)
            3 -> insertionMethod (userArray)
            4 -> selectionSort (userArray)
            5 ->  bubbleSort (userArray)
            6 -> println("You EXIT the program")
        }

    } while (userChoice != 6)
}

fun acceptElements (userArray: IntArray) {
    println("Enter elements")
    for (index in 0 until userArray.size) {
        val inputNumbers = scanner.nextInt()
        userArray[index] = inputNumbers
    }
    println("You successfully input numbers")
}

fun displayNumbers (userArray: IntArray) {
    println("Numbers which you entered are: ")
    for (index in 0 until userArray.size) {
        print("${userArray[index]}\t")
    }
}

fun insertionMethod (userArray: IntArray) {
    for (index in 1 until userArray.size)  {
        if (userArray[index] < userArray[index-1]) {
            var comingIndex = index
            for (innerIndex in index downTo 0) {
                if (userArray[comingIndex] < userArray[innerIndex]){
                    val temp = userArray[comingIndex]
                    userArray[comingIndex] = userArray[innerIndex]
                    userArray[innerIndex] = temp
                    comingIndex = innerIndex
                }
            }
        }

    }
    println("After sorting via insertion method: ")
    displayNumbers(userArray)
}

fun selectionSort (userArray: IntArray) {
    val index =  userArray.size
    var temp : Int

    for (rightToLeft in index-1 downTo 0) {
        var max = rightToLeft
        for (leftToRight in 0 until rightToLeft){
            if (userArray[leftToRight] > userArray[max]) {
                max = leftToRight
            }

            if (rightToLeft != max) {
                temp = userArray[rightToLeft]
                userArray[rightToLeft] = userArray[max]
                userArray[max] = temp

            }
        }

    }

    println("After sorting via selection method:  ")
    for (numbers in 0 until userArray.size) {
        print("${userArray[numbers]}\t")
    }

}



fun bubbleSort (userArray: IntArray) {
    var swap = true
    while (swap) {
        swap  = false
        for (index in 0 until userArray.size-1) {
            if (userArray[index] > userArray[index+1]) {
                val temp = userArray[index]
                userArray[index] = userArray[index+1]
                userArray[index+1] = temp

                swap =  true
            }
        }
    }

    println("After sorting via bubble method: ")
    for (index in 0 until userArray.size){
        print("${userArray[index]}\t")
    }
}
