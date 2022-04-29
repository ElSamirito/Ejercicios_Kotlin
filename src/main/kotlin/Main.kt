fun main() {
    eje3()
}
fun eje1(name: String){
    print("Hola $name!")
}
fun eje2(){
    val a = 2
    val b = 3
    var sum = a+b
    var mul = a*b

    println("Suma: $sum")
    println("Producto: $mul")
}
fun eje3(){
    println("Ingrese una altura:")
    var a = readLine()!!.toFloat()
    println("Ingrese una segunda altura:")
    var b = readLine()!!.toFloat()
    println("Ingrese una tercer y última altura:")
    var c = readLine()!!.toFloat()

    var avg = (a+b+c)/3
    print("El promedio de alturas es: $avg")
}