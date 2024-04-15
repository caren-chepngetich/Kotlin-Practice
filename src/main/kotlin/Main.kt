import java.text.FieldPosition

fun main(){
sumProduct(11,10)
    areaOfRectangle(24,13)
    details("Caren",10,"Black")
  calculateAverage(20,30,40)
    passExams(60)
    calculateShippingCost(1000.0)
    checkOdd(23)
    checkNumbers(0)
    checkPalindrome("madam")
    checkPalindrome("caren")
    average(listOf(1,2,3,4,5))
//    guessNumber(13)
    checkPrimeNumber(23)
    checkPrimeNumber(20)
    checkPrimeNumber(21)
    checkAnagram("caren","neracc")
    checkAnagram("silent","listen")
    checkMaxMin(listOf(2,45,67,1,3))
    wordsReversed("chicken")
    fibonacciUsingRecursion(23)
    fibonacciUsingRecursion(30)
    calculateSum(23,12)
 println(calculateSum(23,13))



}
fun sumProduct(num1:Int,num2: Int){

    var sum = num1+num2
    var product = num1*num2
    var difference = num1-num2
    var quotient = num1/num2

    println(sum)
    println(difference)
    println(product)
    println(quotient)


}
fun areaOfRectangle(length:Int,width:Int){
    var area = length*width
    println(area)
}
//fun temperature(num:Double){
////    not done
//}
fun details(name:String,age:Int,color:String){
    var sentence="My name is $name and I am $age years old. My favourite color is $color"
    println(sentence)

}
//Question 5 Note done
fun calculateAverage(num1: Int,num2: Int,num3: Int) {
    var sum = num1 + num2 + num3
    var average = sum/3
   println(average)
}
 fun passExams(score:Int){
     if (score>=60){
         println("has passed exams")
     }
     else{
         println("has not passed exams")
     }
 }
fun calculateShippingCost(weight:Double){
    if (weight<=2){
        println("cost is $5")
    }
    else if (weight>2 && weight<=5){
        println("cost is $1o")
    }
    else{
        println("cost is $15")
    }
}
fun checkOdd(num:Int){
    if (num%2==0){
        println("is odd number")
    }
    else{
        println("is even number")
    }
}
fun checkNumbers(num:Int){
    if (num>0){
        println("positive")
    }
    else if (num<0){
        println("negative")
    }
    else{
        println("zero")
    }
}
fun checkPalindrome(word:String){
   val  wordReversed = word.reversed()
    if (word==wordReversed){
        println("is palindrome")
    }
    else{
        println("is not palindrome")
    }
}
fun average(numbers: List<Int>){
    var sum = numbers.sum()
  var average = sum/numbers.size
    println(average)
}
//fun guessNumber(num:Int){
//    val correctNumber = 55
//    while (num in  1..100){
//if (num==correctNumber)
//    println("congratulations")
//    }
//    else if(num<=correctNumber){
//       println("too low keep trying")
//    }
//    else{
//        println("too high keep trying")
//    }
//    println("Enter number between 1 and 100")
//}
fun checkPrimeNumber(num:Int){
    if (num%3<=1){
        println("num is a prime number")
    }
    else{
        println("num is not a prime number")
    }
}
fun checkAnagram(word1: String,word2:String){
    if (word1===word2){
        println("word is anagram")
    }
    else{
        println("word is not an anagram")
    }
}
fun checkMaxMin(numbers: List<Int>){
    var maximum = numbers.max()
    var minimum = numbers.min()
    println(maximum)
    println(minimum)
}
fun wordsReversed(word: String){
    var new = word.reversed()
    println(new)
}
fun getNumberChar(strings:List<String>, position:Int, char: Char){

}
fun fibonacciUsingRecursion(num: Int) {
//    println("enter a number")
    val n = readLine()?.toIntOrNull()
    if (n != null && n > 0){
        println("Fibonacci sequence up to $n:")
    var a = 0
    var b = 1
    while (a <= n) {
        print("$a")
        val sum = a + b
        a = b
        b = sum
    }
}else {
    println("enter")
}
}
//    return  if (num <= 1) {
//          num
//    } else {
//        fibonacciUsingRecursion(num - 1) + fibonacciUsingRecursion(num - 2)
//    }
fun calculateSum(num1:Int,num2: Int):Int{
    var sum = num1+num2
    return sum

}


