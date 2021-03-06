def nextDay(a : Char) : Char =
	a match {
		case a if a == 'L' => 'M'
		case a if a == 'M' => 'X'
		case a if a == 'X' => 'J'
		case a if a == 'J' => 'V'
		case a if a == 'V' => 'S'
		case a if a == 'S' => 'D'
		case a if a == 'D' => 'L'
		case a => 0;
	}                                         //> nextDay: (a: Char)Char


	nextDay('L')                              //> res0: Char = M
	nextDay('M')                              //> res1: Char = X
	nextDay('X')                              //> res2: Char = J
	nextDay('J')                              //> res3: Char = V
	nextDay('V')                              //> res4: Char = S
	nextDay('S')                              //> res5: Char = D
	nextDay('D')                              //> res6: Char = L
	nextDay('Q')                              //> res7: Char =  

def nextDay1(a : Integer) : Integer =
	if (a <= 0) {
	  0
	} else if (a <= 6) {
		a + 1
	} else {
	  1
	}                                         //> nextDay1: (a: Integer)Integer
	
	
// lift: returns None, otherwise an exception is raised. Use "get" or "getOrElse" to get the actual value
def dayToString(d : Integer) : Option[String] =
  return List("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo").lift(d - 1)
                                                  //> dayToString: (d: Integer)Option[String]
def dayToInt(a : Char) : Integer =
	a match {
		case a if a == 'L' => 1
		case a if a == 'M' => 2
		case a if a == 'X' => 3
		case a if a == 'J' => 4
		case a if a == 'V' => 5
		case a if a == 'S' => 6
		case a if a == 'D' => 7
		case a => 0;
	}                                         //> dayToInt: (a: Char)Integer
	
	nextDay1(1)                               //> res8: Integer = 2
	nextDay1(2)                               //> res9: Integer = 3
	nextDay1(3)                               //> res10: Integer = 4
	nextDay1(4)                               //> res11: Integer = 5
	nextDay1(5)                               //> res12: Integer = 6
	nextDay1(6)                               //> res13: Integer = 7
	nextDay1(7)                               //> res14: Integer = 1

	dayToString(nextDay1(dayToInt('L'))).getOrElse("KK")
                                                  //> res15: String = Martes
	dayToString(nextDay1(dayToInt('M'))).getOrElse("KK")
                                                  //> res16: String = Miercoles
	dayToString(nextDay1(dayToInt('X'))).getOrElse("KK")
                                                  //> res17: String = Jueves
	dayToString(nextDay1(dayToInt('J'))).getOrElse("KK")
                                                  //> res18: String = Viernes
	dayToString(nextDay1(dayToInt('V'))).getOrElse("KK")
                                                  //> res19: String = Sabado
	dayToString(nextDay1(dayToInt('S'))).getOrElse("KK")
                                                  //> res20: String = Domingo
	dayToString(nextDay1(dayToInt('D'))).getOrElse("KK")
                                                  //> res21: String = Lunes
	dayToString(nextDay1(dayToInt('Q'))).getOrElse("KK")
                                                  //> res22: String = KK
	
