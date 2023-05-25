fun main() {
    val invitation = readLine().toBoolean() // read other value in the same way
    // write your code here
    val gift = readLine().toBoolean()

    val check: Boolean = invitation && gift
    println(check)
}