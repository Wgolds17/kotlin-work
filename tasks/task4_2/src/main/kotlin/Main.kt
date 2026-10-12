// Task 4.2: use of if and ranges

fun main() {
    print("PIZZA MENU\n\n(1) Margherita\n(2) Quattro Stagioni\n(3) Seafood\n(4) Hawaiian\n\nChoose your pizza (a-d): ")
    val selection = readln().lowercase()
    if (selection.length == 1) {
        if (selection in "a".."d") {
            println("Order Accepted")
        }
        else {
            println("Please enter a valid order number.")
        }
    }
    else {
        println("Please enter a valid order number.")
    }
}
