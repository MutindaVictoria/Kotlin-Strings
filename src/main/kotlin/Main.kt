fun main() {
println(personDetails("Wadebe",29,"Sweden"))
println(lengthofString("Machakos"))
    println(checkName("Victoria"))
}
//Write a function that takes in 3 parameters, name, age, and country,
// and returns a String with this structure “Hi, my name is x, I am y years old and I am from z.”
// Where x, y, and z are the provided name, age, and country respectively. (3 points)
fun personDetails(name:String,age:Int,country:String):String{
    return "Hi my name is $name, I am $age years old and am from $country."

}
//2. Write a function that takes in a String and returns its length (2 points)
fun lengthofString(str:String):Int{
    return str.length
}
//3. Write a function that takes in a name and prints out “That’s me!”
// when your name is passed to it, otherwise,
// it prints out “I don’t know who that is” (3 points)
fun checkName(names:String){
    val firstname="Victoria"
    if(names == firstname){
        println("That's me")
    }
    else{
        println("I don,t know who that is")
    }
}
//Write a Kotlin function that takes in a string will all the vowels replaces by the character ‘*’.
// Use string interpolation to generate the output. (2 points)
fun replaceVowels(String1:String){
    var vowels="a,e,i,o,u"

}