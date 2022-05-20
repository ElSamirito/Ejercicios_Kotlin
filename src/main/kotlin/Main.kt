import java.lang.Math.pow

fun main() {
    eje22()
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
fun eje15(){
    val n = arrayListOf<Double>()

    for(i in 0..2){
        println("Ingrese un numero")
        n.add(readLine()!!.toDouble())
    }

    if(n[0] == n[1] && n[1] == n[2]){
        print("${ pow(n[0], 3.0) }")
    }
}
fun eje16(){
    val n = arrayListOf<Double>()

    for(i in 0..2){
        println("Ingrese un numero")
        n.add(readLine()!!.toDouble())
    }

    if(n[0] > 10 || n[1] > 10 || n[2] > 10){
        print("Alguno de los numeros ingresados es mayor a 10")
    }else{
        print("Todos los numeros ingresados son menores a 10")
    }
}
fun eje17(){
    val n = arrayListOf<Float>()
    var sum : Float = 0f
    for(i in 0..9){
        println("Ingrese un numero")
        n.add(readLine()!!.toFloat())
        sum += n[i]
    }
    println("La suma de todos los numeros ingresados es $sum")
    print("Y el promedio es ${sum/10}")
}
fun eje18(){
    var nota = 0f
    var aprov = 0
    var desaprov = 0
    var wc = "s"

    do{
        println("Ingrese una nota de Ap. de Nuevas Tecnologias")
        nota = readLine()!!.toFloat()
        if (nota >= 7){
            aprov++
        }else{
            desaprov++
        }
        println("Desea ingresar mas notas? s/n")
        wc = readLine()!!.toString()
    }while (wc == "s")

    println("La cantidad de aprobados es $aprov")
    print("Y la de desaprobados es $desaprov")
}
fun eje19(){
    for (i in 0 .. 20){
        if ((i%2)==0)
            println("$i")
    }
}
fun eje20(){
    for (i in 20 downTo 0){
        if ((i % 2) == 0){
            println("$i")
        }
    }
}
fun eje21(){
    var num = 0
    var even = 0
    var wc : String
    do{
        println("Ingrese un numero")
        num = readLine()!!.toInt()
        if ((num % 2) == 0){
            even++
        }
        println("Desea ingresar mas numeros? s/n")
        wc = readLine()!!.toString()
    }while(wc == "s")

    print("La cantidad de numeros pares ingresados es $even")
}
fun eje22(){
    println("Ingrese la cantidad de numeros a ingresar")
    val cant = readLine()!!.toInt()
    var num:Float = 0f
    var menor:Float = 0f
    var posicionMenor:Int = 0

    for (i in 1..cant){
        println("Ingrese un numero")
        num = readLine()!!.toFloat()
        if (i == 1){
            menor = num
        }else{
            if (num < menor){
                menor = num
                posicionMenor = i
            }
        }
    }
    if (posicionMenor == 1){
        print("El primero es menor")
    }else{
        println("El menor es: $menor")
        print("En la posicion: $posicionMenor")
    }
}