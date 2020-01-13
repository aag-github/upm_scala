def power(tuple: (Int, Int) ): Int = {
    def power_(tuple: (Int, Int), accumulator : Int) : Int =
      tuple match {
        case (_, exp) if exp == 0 => accumulator
        case (base, exp) => power_((base, exp - 1), accumulator * base)
      }

    power_(tuple, 1)
}

power((3, 4))
power((3, 1))
power((3, 0))
