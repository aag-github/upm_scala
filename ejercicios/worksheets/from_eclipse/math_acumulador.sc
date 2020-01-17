def power(n : Int, exp : Int) : Integer = {
	def power_(n : Int, exp : Int, accumulator : Int) : Int =
    exp match {
    	case 0 => accumulator
    	case _ => power_(n, exp - 1, accumulator * n)
    }

	power_(n, exp, 1)
}                                                 //> power: (n: Int, exp: Int)Integer

power(3, 4)                                       //> res0: Integer = 81
power(3, 1)                                       //> res1: Integer = 3
power(3, 0)                                       //> res2: Integer = 1

//---------------------------
def times_(a : Integer, b : Integer, accumulator : Integer) : Integer =
    if (b >= 1) {
    	times_(a, b - 1, accumulator + a)
		} else {
			accumulator
		}                                 //> times_ : (a: Integer, b: Integer, accumulator: Integer)Integer

def times(a: Integer, b: Integer) : Integer =
    times_(a, b, 0)                               //> times: (a: Integer, b: Integer)Integer
    
times(3, 4)                                       //> res3: Integer = 12
times(3, 1)                                       //> res4: Integer = 3
times(3, 0)                                       //> res5: Integer = 0

//---------------------------
def add_(a : Integer, b : Integer, accumulator : Integer) : Integer =
    if (b > 0) {
    	add_(a, b - 1, accumulator + 1)
		} else if (a > 0) {
    	add_(a - 1, b, accumulator + 1)
		} else {
			accumulator
		}                                 //> add_ : (a: Integer, b: Integer, accumulator: Integer)Integer

def add(a : Integer, b : Integer) : Integer =
    add_(a, b, 0)                                 //> add: (a: Integer, b: Integer)Integer

add(3, 4)                                         //> res6: Integer = 7
add(3, 1)                                         //> res7: Integer = 4
add(3, 0)                                         //> res8: Integer = 3
add(0, 0)                                         //> res9: Integer = 0
add(0, 7)                                         //> res10: Integer = 7
	

def subs_(a : Integer, b : Integer, accumulator : Integer) : Integer =
    if (b > 0) {
    	subs_(a, b - 1, accumulator - 1)
		} else if (a > 0) {
    	subs_(a - 1, b, accumulator + 1)
		} else {
			accumulator
		}                                 //> subs_ : (a: Integer, b: Integer, accumulator: Integer)Integer

def subs(a : Integer, b : Integer) : Integer =
		subs_(a, b, 0)                    //> subs: (a: Integer, b: Integer)Integer

subs(3, 4)                                        //> res11: Integer = -1
subs(3, 1)                                        //> res12: Integer = 2
subs(3, 0)                                        //> res13: Integer = 3
subs(0, 0)                                        //> res14: Integer = 0
subs(0, 7)                                        //> res15: Integer = -7
