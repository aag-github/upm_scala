

/*def ajustar(tuple : (Int ,Int)) : (Int, Int) =
	tuple match {
		case tuple if tuple._1 < -100 && tuple._2 > 100 => (-100, 100)
		case tuple if tuple._1 < -100 => (-100, tuple._2)
		case tuple if tuple._2 > 100 => (tuple._1, 100)
		case tuple => tuple;
	}*/
	

def ajustar1(value : Int, limits : (Int, Int)) : Int =
	value match {
		case v if v > 100 => 100
		case v if v < -100 => -100
		case v => v
  }                                               //> ajustar1: (value: Int, limits: (Int, Int))Int
  
def ajustar(tuple : (Int ,Int), limits : (Int, Int)) : (Int, Int) =
	(ajustar1(tuple._1, limits), ajustar1(tuple._2, limits))
                                                  //> ajustar: (tuple: (Int, Int), limits: (Int, Int))(Int, Int)


def isEven(v: Int): Boolean =
	(v % 2) == 0                              //> isEven: (v: Int)Boolean
	
	
ajustar((6,101), (-100, 100))                     //> res0: (Int, Int) = (6,100)
ajustar((-100, 100), (-100, 100))                 //> res1: (Int, Int) = (-100,100)
ajustar((-101,7), (-100, 100))                    //> res2: (Int, Int) = (-100,7)
ajustar((-101,101), (-100, 100))                  //> res3: (Int, Int) = (-100,100)

isEven(1)                                         //> res4: Boolean = false
	
