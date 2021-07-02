package com.github.welblade.collections

import java.math.BigDecimal

fun Array<BigDecimal>.somatoria(): BigDecimal {
    return this.reduce { acc, bigDecimal -> acc + bigDecimal }
}

fun Array<BigDecimal>.media():BigDecimal {
    if(this.isEmpty()) return BigDecimal.ZERO
    return this.somatoria() / this.size.toBigDecimal()
}