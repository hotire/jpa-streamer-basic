package com.github.hotire.jpa.streamer.basic.core.field

import com.speedment.jpastreamer.field.LongField
import kotlin.reflect.KProperty1

/**
 * @see com.speedment.jpastreamer.field.Field
 */

inline fun <reified T : Any> KProperty1<T, Long>.longField(unique: Boolean = false): LongField<T> {
    return LongField.create(T::class.java, name, this, unique)
}
