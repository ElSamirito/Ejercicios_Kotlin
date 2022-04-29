fun main() {
    eje6()
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
fun eje4(){
    println("Ingrese el ancho de un rectángulo:")
    var base = readLine()!!.toInt()
    println("Ingrese el alto de ese rectángulo:")
    var alt = readLine()!!.toInt()

    var peri = base*2 + alt*2
    var area = base * alt

    print("El perímetro del rectángulo es $peri y el área es $area")
}
fun eje5() {
    println("Ingrese un número:")
    var a = readLine()!!.toInt()
    println("Ingrese otro número")
    var b = readLine()!!.toInt()

    val sum = a+b
    val mul = a*b

    println("Suma: $sum")
    println("Producto: $mul")
}
fun eje6(){
    println("Ingrese el precio del artículo:")
    var price = readLine()!!.toFloat()
    println("Ingrese la cantidad a llevar por el cliente:")
    var cant = readLine()!!.toInt()

    val totalP = price * cant
    print("El precio final de la orden es de $$totalP")
}