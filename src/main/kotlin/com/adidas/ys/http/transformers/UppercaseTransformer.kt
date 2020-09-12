    package com.adidas.ys.http.transformers
import javax.validation.constraints.NotBlank
import javax.inject.Singleton

@Singleton
open class UppercaseTransformer : NameTransformer {
    override fun transform(@NotBlank name: String): String {
        return name.toUpperCase()
    }
}