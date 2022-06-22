import java.lang.Math.*

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
    for (i in 0 .. 20 step 2){
        println("$i")
    }
}
fun eje20(){
    for (i in 20 downTo 0 step 2){
        println("$i")
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
    if (posicionMenor == 0){
        print("El primero es menor")
    }else{
        println("El menor es: $menor")
        print("En la posicion: $posicionMenor")
    }
}
fun eje23(){
    println("Ingrese la cantidad de horas trabajadas")
    val horas = readLine()!!.toFloat()
    println("Ingrese el valor de cada hora de trabajo")
    val valor = readLine()!!.toFloat()
    println("Ingrese la antiguedad(en meses) que posee en la empresa")
    val antiguedad = readLine()!!.toFloat()

    val sueldoBasico = horas * valor
    val sueldoBasico15 = sueldoBasico * 0.015
    val sueldoNeto = sueldoBasico + sueldoBasico15 * (antiguedad/12)

    println("Sueldo Basico: $sueldoBasico")
    println("Sueldo Neto: $sueldoNeto")
}
fun eje24(){
    println("Ingrese el monto del presupuesto anual")
    val presupuesto = readLine()!!.toFloat()

    val cardiologia = presupuesto * 0.4
    val traumatologia = presupuesto * 0.3
    val pediatria = presupuesto * 0.3

    println("Presupuesto para Cardiologia $cardiologia")
    println("Presupuesto para Traumatologia $traumatologia")
    print("Presupuesto para Pediatria $pediatria")
}
fun eje25(){
    println("Ingrese la cantidad de horas trabajadas en la semana")
    val horas = readLine()!!.toFloat()
    var salarioSemanal:Float
    val extras:Boolean

    if(horas <= 40){
        salarioSemanal = horas * 300
        extras = false
    }else{
        salarioSemanal = horas * 300
        salarioSemanal += (horas-40) * 150
        extras = true
    }

    if (extras){
        println("Realizo horas extras")
    }else{
        println("No realizo horas extras")
    }
    print("Y el total a cobrar esta semana es de $$salarioSemanal")
}
fun eje26(){
    println("Ingrese la cantidad de minutos de uso")
    val minutos = readLine()!!.toInt()
    println("Ingrese la cantidad de hojas impresas")
    val hojas = readLine()!!.toInt()

    val totalMins = (minutos * 0.9) + (minutos*0.01)*0.05

    println("Precio final por cada minuto de uso: $${totalMins}")
    print("Precio final por cada hoja impresa: $${(hojas * 0.07)!!.toFloat()}")
}

fun eje27(){
    println("Ingrese la cantidad de horas trabajadas")
    val horas = readLine()!!.toFloat()
    println("Ingrese el valor de cada hora de trabajo")
    val valor = readLine()!!.toFloat()
    println("Ingrese la antiguedad(en meses) que posee en la empresa")
    val antiguedad = readLine()!!.toFloat() / 12

    val sueldoNeto:Float
    val sueldoBasico = horas * valor
    if (sueldoBasico > 50000 && antiguedad < 10){
        sueldoNeto = sueldoBasico - 3000
    }else if (sueldoBasico <= 50000 && antiguedad >= 10){
        sueldoNeto = (sueldoBasico * 1.3)!!.toFloat()
    }else{
        sueldoNeto = sueldoBasico
    }

    println("Sueldo Basico: $sueldoBasico")
    println("Sueldo Neto: $sueldoNeto")
}
fun eje28(){
    val dia = arrayListOf<String>()
    val temp = arrayListOf<Float>()
    var menor0 = 0
    var sumamay0 = 0f
    var semanaavg = 0f
    var posmay = 0
    var posmen = 0

    println("Ingrese el nombre de la localidad")
    val localidad = readLine().toString()
    for (i in 0..6){
        println("Ingrese el dia a registrar")
        dia.add(readLine().toString())
        println("Ingrese la temperatura promedio del dia")
        temp.add(readLine()!!.toFloat())

        semanaavg += temp[i]

        if (temp[i] < 0){
            menor0++
        }

        if (temp[i] > 0){
            sumamay0 += temp[i]
        }

        if(i==1){
            posmay = i
            posmen = i
        }else{
            if(temp[i] < temp[posmen]){
                posmen = i
            }

            if (temp[i] > temp[posmay]){
                posmay = i
            }
        }
    }

    println("Mayor temperatura: ${temp[posmay]}C Dia: ${dia[posmay]}")
    println("Menor temperatura: ${temp[posmen]}C Dia: ${dia[posmen]}")
    println("Dias bajo-cero: $menor0")
    println("Suma de temperaturas mayores a 0: $sumamay0")
    println("Temperaturas Avg: ${semanaavg/7}")
    print("Localidad: $localidad")
}
fun eje29(){
    var damas:Float = 0f
    var caballeros:Float = 0f
    var ninios:Float = 0f
    var mayor:Float = 0f
    var codMayor:String = "Codigo Mayor"
    var menor:Float = 0f
    var codMenor:String = "Codigo Menor"

    println("Ingrese la cantidad de productos a registrar")
    val N = readLine()!!.toInt()

    for (i in 1..N){
        println("Ingrese el codigo de productos(D, C o N)")
        val codigo = readLine()!!.toString()
        println("Ingrese la ganancia aportada del producto")
        val gan = readLine()!!.toFloat()
        when(codigo){
            "D", "d" -> damas += gan
            "C", "c" -> caballeros += gan
            "N", "n" -> ninios += gan
        }
    }

    val gantotal = damas + caballeros + ninios

    mayor = max(max(damas, caballeros), ninios)

    if (mayor == damas){
        codMayor = "Damas (D)"
        menor = min(caballeros, ninios)
    }else if(mayor == caballeros){
        codMayor = "Caballeros (C)"
        menor = min(damas, ninios)
    }else{
        codMayor = "Ninos (N)"
        menor = min(damas, caballeros)
    }

    if (menor == damas){
        codMenor = "Damas (D)"
    }else if (menor == caballeros){
        codMenor = "Caballeros (C)"
    }else{
        codMenor = "Ninos (N)"
    }

    println("Ganancia total: $gantotal")
    println("Ganancia de damas: ${(damas / gantotal) * 100}%")
    println("Ganancia de caballeros: ${(caballeros / gantotal) * 100}%")
    println("Ganancia de ninos: ${(ninios / gantotal) * 100}%")
    println("El codigo que mayor ganancia reporto es: $codMayor")
    if (((menor/gantotal)*100) > 20){
        println("El codigo que menor ganancia reporto es: $codMenor")
    }
}
fun eje30(){
    /*Un kiosco ubicado en la zona céntrica de nuestra ciudad desea registrar sus ventas por medio de una computadora.
    Diseñe un programa que lea para N clientes el monto de la venta, y:
    calcule e imprima el valor correspondiente al IVA.
    calcule e imprima el monto total a pagar.
    lea la cantidad con que paga el cliente.
    calcule e imprima el vuelto que debe entregar.*/
    var monto = 0f
    var iva = 0.0
    var total = 0.0
    var pago = 0f

    println("Ingrese la cantidad de clientes a registrar")
    val clientes = readLine()!!.toInt()

    for (i in 1..clientes) {
        println("Ingrese el valor de la compra")
        monto = readLine()!!.toFloat()

        iva = monto * 0.21
        println("El IVA correspondiente a la compra es $$iva")

        total = monto + iva
        println("El total a pagar es $$total")

        println("Ingrese la cantidad con la que paga el cliente")
        pago = readLine()!!.toFloat()
        if (pago<total){
            println("Falta plata")
        }else if (pago>total){
            println("El vuelto a entregar es de $${pago-total}")
        }else{
            println("Esta justo")
        }
    }
}
fun eje31(){
    /*Ciertos atletas pierden en sus carreras 100 gramos de peso por cada 50m recorridos.
    Sus entrenadores desean un programa que a partir de datos como:
    Peso del corredor
    Longitud del circuito (nunca menor a 50m)
    Tiempo empleado (en seg.).
    Cumpla con los siguientes puntos:
    Determinar cuántos gramos pierde el corredor y cuál es su peso final.
    Si ha perdido más de 300g de peso, indicar que necesitará vitamina A y si pierde más de 450g necesitará también vitamina C.
    Sabiendo que para el circuito olímpico el tiempo récord es de 25 seg. en 400m, y que para el circuito panamericano el tiempo récord es de 15 seg. en 250m, determinar si el corredor ha mejorado alguno de estos récords.
    Hacer ésto para N corredores.*/
    var pesoF: Float
    var pesoP: Float
    var circuito: Float
    var tiempo: Float

    print("Ingrese la cantidad de corredores a registrar: ")
    val corredores = readLine()!!.toInt()

    for(i in 1..corredores){
        print("Ingrese el peso del corredor(Kg): ")
        pesoF= readLine()!!.toFloat()
        print("Ingrese la longitud del circuito(No menor a 50m): ")
        circuito = readLine()!!.toFloat()
        print("Ingrese el tiempo empleado al recorrerlo(Seg): ")
        tiempo = readLine()!!.toFloat()

        pesoP = circuito/50 * 100
        pesoF *= 1000
        pesoF -= pesoP
        pesoF /= 1000

        println("El corredor perdio $pesoP g, con un peso final de $pesoF Kg")
        if (pesoP>450){
            println("Necesita consumir Vitamina A y C")
        }else if (pesoP>300){
            println("Necesita consumir Vitamina A")
        }

        if (circuito >= 400 && tiempo < 25){
            println("El corredor rompio el record olimpico")
        }else if (circuito >= 250 && tiempo < 15){
            println("El corredor rompio el record panamericano")
        }
    }
}
fun main(){
    eje31()
}