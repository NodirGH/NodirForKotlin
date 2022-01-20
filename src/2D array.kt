/** Array - Two Dimension
 * set 1 Task 1
 * Write a menu driven C++ program to do following operation on two dimensional array A of size m x n.
 * You should use user-defined functions which accept 2-D array A, and its size m and n as arguments. The options are:

To input elements into matrix of size m x n
To display elements of matrix of size m x n
Sum of all elements of matrix of size m x n
To display row-wise sum of matrix of size m x n
To display column-wise sum of matrix of size m x n
To create transpose of matrix B of size n x m
 */
fun findSizeOfMatrix () {
    val twoD = Array(4) {IntArray(3)}
    println("Enter numbers")

    for (row in 0 until twoD.size) {
        val columnArray = IntArray(3)
        for (column in 0 until columnArray.size) {
            val inputNumbers = scanner.nextInt()
            columnArray[column] = inputNumbers
        }

        twoD[row] = columnArray   //I don't  understand this line
    }


    for (columnArray in twoD){
        for (columnValue in columnArray){
            print(columnValue)
            print(" ")
        }
        println()
    }

}


