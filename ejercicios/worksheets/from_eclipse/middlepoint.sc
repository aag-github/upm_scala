def middlePoint(min : Integer, max: Integer) : Double =
    (min + max) / 2.0                             //> middlePoint: (min: Integer, max: Integer)Double
def len(min : Integer, max: Integer) : Double =
    (max - min) / 2.0                             //> len: (min: Integer, max: Integer)Double

def centeredMiddleInterval(min : Integer, max: Integer) : (Double, Double) =
    (middlePoint(min, max) - len(min, max)/2,  middlePoint(min, max)  + len(min, max)/2)
                                                  //> centeredMiddleInterval: (min: Integer, max: Integer)(Double, Double)


middlePoint(0, 100)                               //> res0: Double = 50.0
middlePoint(1, 100)                               //> res1: Double = 50.5
middlePoint(1, 2)                                 //> res2: Double = 1.5

centeredMiddleInterval(0, 100)                    //> res3: (Double, Double) = (25.0,75.0)
centeredMiddleInterval(1, 100)                    //> res4: (Double, Double) = (25.75,75.25)
	
