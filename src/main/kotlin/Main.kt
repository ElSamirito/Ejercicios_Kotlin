fun main() {
    eje8()
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
    println("Ingrese una tercer y ultima altura:")
    var c = readLine()!!.toFloat()

    var avg = (a+b+c)/3
    print("El promedio de alturas es: $avg")
}
fun eje4(){
    println("Ingrese el ancho de un rectangulo:")
    var base = readLine()!!.toInt()
    println("Ingrese el alto de ese rectangulo:")
    var alt = readLine()!!.toInt()

    var peri = base*2 + alt*2
    var area = base * alt

    print("El perímetro del rectangulo es $peri y el area es $area")
}
fun eje5() {
    println("Ingrese un numero:")
    var a = readLine()!!.toInt()
    println("Ingrese otro numero")
    var b = readLine()!!.toInt()

    val sum = a+b
    val mul = a*b

    println("Suma: $sum")
    println("Producto: $mul")
}
fun eje6(){
    println("Ingrese el precio del articulo:")
    var price = readLine()!!.toFloat()
    println("Ingrese la cantidad a llevar por el cliente:")
    var cant = readLine()!!.toInt()

    val totalP = price * cant
    print("El precio final de la orden es de $$totalP")
}
fun eje7(){
    var num = arrayListOf<Int>()
    var sum = 0
    for(i in 0..3){
        println("Ingrese un numero entero")
        num.add(readLine()!!.toInt())
        sum += num[i]
    }
    print("La suma de los valores ingresados es $sum")
}
fun eje8(){
    println("Ingrese un monto de sueldo")
    var sueldo = readLine()!!.toFloat()
    if (sueldo > 100000){
        print("En base a ese monto, se deberian pagar impuestos")
    }else{
        print("En base a ese monto, no se requiere pagar impuestos")
    }
}