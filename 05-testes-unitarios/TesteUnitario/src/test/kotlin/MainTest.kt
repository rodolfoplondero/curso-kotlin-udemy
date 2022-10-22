import org.junit.jupiter.api.*

class MainTest {

    @Test
    @DisplayName("Teste metodo xxoo")
    fun testCountXO() {
        Assertions.assertAll(
            { Assertions.assertTrue(countXO("xxoo")) },
            { Assertions.assertTrue(countXO("xxoo")) },
            { Assertions.assertTrue(countXO("xXoo")) },
            { Assertions.assertTrue(countXO("xxoO")) }
        )
    }

    @Test
    @Disabled
    fun naoImplementado() {

    }

    @Test
    fun vaiFalhar() {
        fail("Não posso terminar os testes sem esse método")
    }

    @Test
    fun assumption(){
        Assumptions.assumeTrue(countXO("xxoo"))
        Assertions.assertTrue(abc())
    }

    @Test
    fun exception(){
        assertThrows<NullPointerException> { abc2() }
    }
}