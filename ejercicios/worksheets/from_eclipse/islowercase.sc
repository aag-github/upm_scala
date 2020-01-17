def isLower(value : Char) : Boolean =
	(value >= 'a' && value <= 'z') || value == 'ñ'
                                                  //> isLower: (value: Char)Boolean

def isUpper(value : Char) : Boolean =
	(value >= 'A' && value <= 'Z') || value == 'Ñ'
                                                  //> isUpper: (value: Char)Boolean
	
def toLower(value : Char) : Char =
  if (isUpper(value)) {
    (value - 'A' + 'a').toChar
  }
  else {
  	value
  }                                               //> toLower: (value: Char)Char

isLower('a' - 1)                                  //> res0: Boolean = false
isLower('a')                                      //> res1: Boolean = true
isLower('z')                                      //> res2: Boolean = true
isLower('z' + 1)                                  //> res3: Boolean = false

isLower('ñ')                                      //> res4: Boolean = true
isLower('0')                                      //> res5: Boolean = false
isLower('A')                                      //> res6: Boolean = false

toLower('A' - 1)                                  //> res7: Char = @
toLower('A')                                      //> res8: Char = a
toLower('Z')                                      //> res9: Char = z
toLower('Z' + 1)                                  //> res10: Char = [

toLower('Ñ')                                      //> res11: Char = Ã±
toLower('0')                                      //> res12: Char = 0
toLower('a')                                      //> res13: Char = a


toLower('a' - 1)                                  //> res14: Char = `
toLower('a')                                      //> res15: Char = a
toLower('z')                                      //> res16: Char = z
toLower('z' + 1)                                  //> res17: Char = {

toLower('ñ')                                      //> res18: Char = Ã±
toLower('0')                                      //> res19: Char = 0


	
