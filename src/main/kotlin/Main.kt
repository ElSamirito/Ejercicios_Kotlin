fun main() {
    eje14()
}
fun eje1(name: String){
    print("Hola $name!")
}
fun eje2(){
    val a = 2
    val b = 3

    val sum = a+b
    val mul = a*b

    println("Suma: $sum")
    println("Producto: $mul")
}
fun eje3(){
    println("Ingrese una altura:")
    val a = readLine()!!.toFloat()
    println("Ingrese una segunda altura:")
    val b = readLine()!!.toFloat()
    println("Ingrese una tercer y ultima altura:")
    val c = readLine()!!.toFloat()

    val avg = (a+b+c)/3

    print("El promedio de alturas es: $avg")
}
fun eje4(){
    println("Ingrese el ancho de un rectangulo:")
    val base = readLine()!!.toInt()
    println("Ingrese el alto de ese rectangulo:")
    val alt = readLine()!!.toInt()

    val peri = base*2 + alt*2
    val area = base * alt

    print("El perímetro del rectangulo es $peri y el area es $area")
}
fun eje5() {
    println("Ingrese un numero:")
    val a = readLine()!!.toInt()
    println("Ingrese otro numero")
    val b = readLine()!!.toInt()

    val sum = a+b
    val mul = a*b

    println("Suma: $sum")
    println("Producto: $mul")
}
fun eje6(){
    println("Ingrese el precio del articulo:")
    val price = readLine()!!.toFloat()
    println("Ingrese la cantidad a llevar por el cliente:")
    val cant = readLine()!!.toInt()

    val totalP = price * cant

    print("El precio final de la orden es de $$totalP")
}
fun eje7(){
    val num = arrayListOf<Int>()
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
    val sueldo = readLine()!!.toFloat()

    if (sueldo > 100000){
        print("En base a ese monto, se deberian pagar impuestos")
    }else{
        print("En base a ese monto, no se requiere pagar impuestos")
    }
}
fun eje9(){
    println("Ingrese un numero")
    val a = readLine()!!.toInt()
    println("Ingrese otro numero")
    val b = readLine()!!.toInt()

    if(a > b){
        print("El mayor de ambos es  $a")
    }else if (b > a){
        print("El mayor de ambos es $b")
    }else{
        print("Ambos numeros son iguales")
    }
}
fun eje10(){
    println("Ingrese un numero")
    val a = readLine()!!.toInt()
    println("Ingrese otro numero")
    val b = readLine()!!.toInt()

    var ans = 0

    if(a < b){
        ans = a + b
        println("La suma entre ambos numeros es $ans")
        ans = a - b
        println("Y la resta es $ans")
    }else{
        ans = a * b
        println("El producto entre ambos numeros es $ans")
        ans = a / b
        print("Y la division es $ans")
    }
}
fun eje11(){
    val score = arrayListOf<Float>()
    var avg : Float = 0f

    for(i in 0..2){
        println("Ingrese una nota de un alumno")
        score.add(readLine()!!.toFloat())
        avg += score[i]
    }
    avg /= 3

    if (avg >=7){
        print("Promocionado!!")
    }else{
        print("Promocionadon't :c")
    }
}
fun eje12(){
    val score = arrayListOf<Float>()
    var avg : Float = 0f

    for(i in 0..2){
        println("Ingrese una nota de un alumno")
        score.add(readLine()!!.toFloat())
        avg += score[i]
    }
    avg /= 3

    if (avg >=7){
        print("Promocionado!!")
    }else if(avg >= 4){
        print("Regular")
    }else{
        print("Reprobado")
    }
}
fun eje13(){
    println("Ingrese la cantidad de preguntas en el examen")
    val qstns = readLine()!!.toInt()
    println("Ingrese la cantidad respondidas correctamente")
    val coqstns = readLine()!!.toInt()

    val perc = (100/qstns)*coqstns

    if (perc >= 90){
        print("Nivel Máximo")
    }else if(perc >= 75){
        print("Nivel Medio")
    }else if(perc >= 50){
        print("Nivel Regular")
    }else if(perc >= 25){
        print("Nivel Muy Bajo")
    }else{
        print("Fuera de Nivel")
    }
}
fun eje14(){
    println("Ingrese una fecha. Formato DD/MM/AAAA")
    val date = readLine()
    val spldate = date!!.split("/")

    val dia = spldate[0]!!.toInt()
    val mes = spldate[1]!!.toInt()

    if(dia == 25 && mes == 12){
        print("Es Navidad!!")
    }else{
        print("No es Navidad :c")
    }
}