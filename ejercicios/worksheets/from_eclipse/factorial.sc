def factorial(n : Integer) : Integer =
    if (n > 1) {
    	n * factorial(n - 1)
    } else {
    	1
		}                                 //> factorial: (n: Integer)Integer

factorial(4)                                      //> res0: Integer = 24
factorial(1)                                      //> res1: Integer = 1
factorial(0)                                      //> res2: Integer = 1

