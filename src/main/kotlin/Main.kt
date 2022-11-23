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
fun eje32(){
    print("Ingrese el capital de la empresa: ")
    var capital = readLine()!!.toFloat()

    if(capital > 20000){
        /* No Préstamo */
    }else if(capital > 0){
        capital += 20000 /* Préstamo de 20k */
    }else{
        capital += 10000 /* Préstamo de 10k */
    }
    capital -= 5000
    println("Equipo de Computo: $5000")
    capital -= 2000
    println("Mobiliario: $2000")
    capital /= 2
    println("Compra de Insumos: ${abs(capital)}")
    println("Incentivos al Personal: ${abs(capital)}")
}
fun eje33() {
    println("Ingrese una fecha de nacimiento")
    print("Dia: ")
    val dia = readLine()!!.toInt()
    print("Mes: ")
    val mes = readLine()!!.toString()

    when(mes){
        "Enero" -> if(dia <= 20){
            print("Capricornio")
        }else{
            print("Acuario")
        }
        "Febrero" -> if (dia <= 20){
            print("Acuario")
        }else{
            print("Piscis")
        }
        "Marzo" -> if (dia <= 20){
            print("Piscis")
        }else{
            print("Aries")
        }
        "Abril" -> if (dia <= 20){
            print("Aries")
        }else{
            print("Tauro")
        }
        "Mayo" -> if (dia <= 20){
            print("Tauro")
        }else{
            print("Geminis")
        }
        "Junio" -> if (dia <= 20){
            print("Geminis")
        }else{
            print("Cancer")
        }
        "Julio" -> if (dia <= 20){
            print("Cancer")
        }else{
            print("Leo")
        }
        "Agosto" -> if (dia <= 20){
            print("Leo")
        }else{
            print("Virgo")
        }
        "Septiembre" -> if (dia <= 20){
            print("Virgo")
        }else{
            print("Libra")
        }
        "Octubre" -> if (dia <= 20){
            print("Libra")
        }else{
            print("Escorpio")
        }
        "Noviembre" -> if (dia <= 20){
            print("Escorpio")
        }else{
            print("Sagitario")
        }
        "Diciembre" -> if (dia <= 20){
            print("Sagitario")
        }else{
            print("Capricornio")
        }
    }
}
fun sumFantasma(lista:MutableList<Int>):Int{
    var resultado:Int = 0
    for(i in lista){
        resultado += lista[i]
    }
    return resultado
}
fun ejFantasma(){
    var num = mutableListOf<Int>()

    for (i in 0..9){
        print("Ingrese un numero: ")
        num.add(readLine()!!.toInt())
    }
    sumFantasma(num)
}
fun suma(a:Int, b:Int):Int{
    return a+b
}
fun resta(a:Int, b:Int):Int{
    return a-b
}
fun multi(a:Int, b:Int):Int{
    return a*b
}
/*fun divi(a:Int, b:Int):Float{
    return a/b
}*/
fun tp3ej1(){
    val num1 = 238
    val num2 = 121

    println("La suma entre 238 y 121 es ${suma(num1, num2)}")
    println("La resta entre 238 y 121 es ${resta(num1, num2)}")
    println("El producto entre 238 y 121 es ${multi(num1, num2)}")
    //println("El cosciente entre 238 y 121 es ${divi(num1, num2)}")
}
fun tp3ej2() {
    var num1: Int = 0
    var num2: Int = 0
    for(i in 0..1){
        print("Ingrese un numero entero: ")
        num1 = readLine()!!.toInt()
        print("Ingrese otro: ")
        num2 = readLine()!!.toInt()
        println("La suma de entre ambos numeros es ${suma(num1, num2)}")
        for (z in 0..30){
            print("-")
        }
        println("-")
    }

}
fun calcularMayor(a: Int, b: Int, c: Int):String{
    var mayor = 0
    if (a==b && b==c){
        return "Todos valen lo mismo"
    }
    if(a>b && a>c){
        mayor=a
    }else{
        if(b>c){
            mayor=b
        }else{
            mayor=c
        }
    }
    return "El mayor de los numeros ingresados es $mayor"
}
fun tp3ej3(){
    print("Ingrese un numero entero: ")
    val num1 = readLine()!!.toInt()
    print("Ingrese un numero entero: ")
    val num2 = readLine()!!.toInt()
    print("Ingrese un numero entero: ")
    val num3 = readLine()!!.toInt()

    print(calcularMayor(num1, num2, num3))
}
fun tp3ej4(){
    print("Ingrese el lado de un cuadrado: ")
    val ladoq = readLine()!!.toDouble()
    println("Que quiere hacer con ese dato:")
    println("1. Calcular Perimetro")
    println("2. Calcular Superficie")
    val op = readLine()!!.toInt()
    when(op){
        1 -> println("El perimetro del cuadrado propuesto seria ${ladoq*4}");
        2 -> println("La superficie del cuadrado propuesto seria ${pow(ladoq, 2.0)}")
    }
}
fun superficie(a: Float, b: Float):Float{
    return a*b
}
fun tp3ej5(){
    print("Ingrese el alto de un rectangulo: ")
    val alt = readLine()!!.toFloat()
    print("Ingrese el ancho del mismo: ")
    val anch = readLine()!!.toFloat()
    print("La superficie del rectangulo propuesto es ${superficie(alt,anch)}")
}
fun mayorde2(a: Int, b: Int):Int{
    var mayor = 0

    if (a>b){
         mayor = a
    }else if (b>a){
        mayor = b
    }

    return mayor
}
fun tp3ej6(){
    print("Ingrese un numero entero: ")
    val num1 = readLine()!!.toInt()
    print("Ingrese otro numero entero: ")
    val num2 = readLine()!!.toInt()

    print("El mayor es ${mayorde2(num1, num2)}")
}
fun strlen(a: String):Int{
    return a.length
}
fun tp3ej7(){
    print("Ingrese un nombre: ")
    val name1 = readLine().toString()
    print("Ingrese otro nombre distinto: ")
    val name2 = readLine().toString()

    val leng1 = strlen(name1)
    val leng2 = strlen(name2)
    val mayor = mayorde2(leng1, leng2)

    if(mayor == leng1){
        print("'$name1' tiene mas caracteres")
    }else if(mayor == leng2){
        print("'$name2' tiene mas caracteres")
    }else{
        print("Ambos tienen la misma cantidad de caracteres")
    }
}
fun promedio(a:Int, b:Int, c:Int):Float{
    val suma = a+b+c
    println("La suma de los enteros ingresados es $suma")
    return suma/3f
}
fun tp3ej8(){
    print("Ingrese un numero entero: ")
    val num1 = readLine()!!.toInt()
    print("Ingrese un numero entero: ")
    val num2 = readLine()!!.toInt()
    print("Ingrese un numero entero: ")
    val num3 = readLine()!!.toInt()

    val prom = promedio(num1, num2, num3)

    print("El promedio de estos es $prom")
}
fun tp3ej9(){
    fun prom(a:Int, b:Int, c:Int):Double = (a+b+c)/3.0

    var nums = emptyArray<Int>()

    for (i in 1..3){
        print("Ingrese un numero entero: ")
        nums += readLine()!!.toInt()
    }

    print("El promedio entre ellos es ${prom(nums[0], nums[1], nums[2])}")
}
fun tp3ej10(){
    fun peri(a:Float, b:Float):Float = a*2 + b*2

    print("Ingrese el lado 'a' de un rectangulo: ")
    val ladoa = readLine()!!.toFloat()
    print("Ingrese el lado 'b' de un rectangulo: ")
    val ladob = readLine()!!.toFloat()

    print("El perimetro del rectangulo es ${peri(ladoa, ladob)}")
}
fun tp3ej11(){
    fun leng11(a:String):Int = a.length

    print("Ingrese un nombre: ")
    val name1 = readLine().toString()
    print("Ingrese otro nombre distinto: ")
    val name2 = readLine().toString()

    val leng1 = leng11(name1)
    val leng2 = leng11(name2)
    val mayor = mayorde2(leng1, leng2)

    if(mayor == leng1){
        print("'$name1' tiene mas caracteres")
    }else if(mayor == leng2){
        print("'$name2' tiene mas caracteres")
    }else{
        print("Ambos tienen la misma cantidad de caracteres")
    }
}
fun tp3ej12(){
    fun notaparcs(nota1:Float, nota2:Float):String{
        if(nota1 >= 8 && nota2 >= 8){
            return "Promocionado"
        }else if(nota1 >= 6 && nota2 >= 6){
            return "Regular"
        }else{
            return "Libre"
        }
    }

    var leg:Int; var parc1:Float; var parc2:Float; var prom = 0; var reg = 0; var lib = 0

    do{
        print("Ingrese N de Legajo: ")
        leg = readLine()!!.toInt()

        if (leg == -1){
            println("Ingreso finalizado")
            break
        }

        print("Ingrese la nota del primer parcial: ")
        parc1 = readLine()!!.toFloat()
        print("Ingrese la nota del segundo parcial: ")
        parc2 = readLine()!!.toFloat()
        val result = notaparcs(parc1, parc2)
        println("Alumno $result")

        when(result){
            "Promocionado" -> prom++
            "Regular" -> reg++
            "Libre" -> lib++
        }

    }while(true)

    println("Cantidad de Alumnos Promocionados: $prom")
    println("Cantidad de Alumnos Regulares: $reg")
    println("Cantidad de Alumnos Libres: $lib")
}
fun tp3ej13(){
    print("Ingrese un número entero: ")
    val num1 = readLine()!!.toInt()
    print("Ingrese otro(No necesariamente otro): ")
    val num2 = readLine()!!.toInt()

    do{

    }

    println("MENÚ")
    println("*********************************")
    println("1: suma")
    println("2: resta")
    println("3: multiplicación")
    println("4: división")
    println("5: cuadrado")
    println("6: raíz cuadrada")
    println("7: Salir")
    println("**********************************")

}
fun mostrararray(array:IntArray){
    val last = array.size - 1
    print("[")
    for (i in 0..last) {
        if (i == last) {
            print("${array[i]}")
        } else {
            print("${array[i]}, ")
        }
    }
    println("]")

}
fun findarray(elem:Int, array:IntArray): Boolean {
    var esta = false
    for (i in 0..array.size-1) {
        if (array[i] == elem){
            esta = true
        }
    }
    return esta
}
fun tp4ej14(){
    val N = 3
    var vec1 = IntArray(N)
    var vec2 = IntArray(N)
    var vec3 = IntArray(0)

    println("Ingrese valores al primer vector:")
    for (i in 0..N-1){
        print("Elemento $i: ")
        vec1[i] = readLine()!!.toInt()
    }
    println("Ingrese valores al segundo vector:")
    for (i in 0..N-1){
        print("Elemento $i: ")
        vec2[i] = readLine()!!.toInt()
    }

    for(i in 0..N-1){
        if(!findarray(vec1[i], vec2)){
            vec3 += vec1[i]
        }
    }
    println("Vector Nº1:")
    mostrararray(vec1)
    println("Vector Nº2:")
    mostrararray(vec2)
    println("Vector Nº3:")
    mostrararray(vec3)
}
fun main(){
    tp3ej13()
}