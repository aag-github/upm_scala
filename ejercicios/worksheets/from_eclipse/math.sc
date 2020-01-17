def power(n : Integer, exp : Integer) : Integer =
    if (exp > 0) {
    	n * power(n, exp - 1)
    } else {
    	1
		}                                 //> power: (n: Integer, exp: Integer)Integer

power(3, 4)                                       //> res0: Integer = 81
power(3, 1)                                       //> res1: Integer = 3
power(3, 0)                                       //> res2: Integer = 1

def times(a : Integer, b : Integer) : Integer =
    if (b > 1) {
    	a + times(a, b - 1)
    } else if (b == 1){
    	a
		} else {
			0
		}                                 //> times: (a: Integer, b: Integer)Integer

times(3, 4)                                       //> res3: Integer = 12
times(3, 1)                                       //> res4: Integer = 3
times(3, 0)                                       //> res5: Integer = 0


def add(a : Integer, b : Integer) : Integer =
    if (b > 0) {
    	add(a + 1, b - 1)
		} else {
			a
		}                                 //> add: (a: Integer, b: Integer)Integer

add(3, 4)                                         //> res6: Integer = 7
add(3, 1)                                         //> res7: Integer = 4
add(3, 0)                                         //> res8: Integer = 3
add(0, 0)                                         //> res9: Integer = 0
add(0, 7)                                         //> res10: Integer = 7
	

def subs(a : Integer, b : Integer) : Integer =
    if (b > 0) {
    	subs(a - 1, b - 1)
		} else {
			a
		}                                 //> subs: (a: Integer, b: Integer)Integer

subs(3, 4)                                        //> res11: Integer = -1
subs(3, 1)                                        //> res12: Integer = 2
subs(3, 0)                                        //> res13: Integer = 3
subs(0, 0)                                        //> res14: Integer = 0
subs(0, 7)                                        //> res15: Integer = -7
	
