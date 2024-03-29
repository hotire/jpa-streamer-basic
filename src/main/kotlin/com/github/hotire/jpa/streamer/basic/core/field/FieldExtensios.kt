package com.github.hotire.jpa.streamer.basic.core.field

import com.speedment.jpastreamer.field.ComparableField
import com.speedment.jpastreamer.field.EnumField
import com.speedment.jpastreamer.field.LongField
import kotlin.reflect.KProperty1

/**
 * @see com.speedment.jpastreamer.field.Field
 */

inline fun <reified T : Any> KProperty1<T, Long>.longField(unique: Boolean = false): LongField<T> {
    return LongField.create(T::class.java, name, this, unique)
}

inline fun <reified T : Any> KProperty1<T, Long?>.longNullableField(unique: Boolean = false): ComparableField<T, Long> {
    return ComparableField.create(T::class.java, name, { this?.call() }, unique)
}

inline fun <reified T : Any, reified E : Enum<E>> KProperty1<T, E>.enumField(): EnumField<T, E> {
    return EnumField.create(T::class.java, name, this, E::class.java)
}
