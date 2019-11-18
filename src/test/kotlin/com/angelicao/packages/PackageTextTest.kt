package com.angelicao.packages

import junit.framework.Assert.assertEquals
import org.junit.Test

class PackageTextTest {
    @Test
    fun packageStr_checkTextIsCorrect() {
        val packageText = PackageText()

        assertEquals("Hello I am a text in packages", packageText.packageStr)
    }
}