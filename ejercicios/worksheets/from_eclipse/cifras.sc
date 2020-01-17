
def cifras(d : Integer) : Integer =
  if (d > 9) {
     1 + cifras(d/10)
  } else {
     1
  }                                               //> cifras: (d: Integer)Integer

cifras(1239)                                      //> res0: Integer = 4
cifras(123456)                                    //> res1: Integer = 6
cifras(1)                                         //> res2: Integer = 1

