import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class MainTest {

    @Test
    @DisplayName("Testa os cenarios da portaria")
    fun testPortaria() {
        Assertions.assertEquals(portaria(15, "", ""), "Negado.")
        Assertions.assertEquals(portaria(20, "", ""), "Negado.")

        Assertions.assertEquals(portaria(25, "VIP", ""), "Negado.")

        Assertions.assertEquals(portaria(25, "comum", "xt10"), "Welcome.")
        Assertions.assertEquals(portaria(25, "comum", "XT10"), "Welcome.")
        Assertions.assertEquals(portaria(25, "comum", "xxas10"), "Negado.")

        Assertions.assertEquals(portaria(25, "premium", "xl10"), "Welcome.")
        Assertions.assertEquals(portaria(25, "premium", "XL10"), "Welcome.")
        Assertions.assertEquals(portaria(25, "premium", "xxas10"), "Negado.")

        Assertions.assertEquals(portaria(25, "luxo", "xl10"), "Welcome.")
        Assertions.assertEquals(portaria(25, "luxo", "XL10"), "Welcome.")
        Assertions.assertEquals(portaria(25, "luxo", "xxas10"), "Negado.")
    }

    @Test
    @DisplayName("Testa os cenarios da portaria (AssertALL)")
    fun testPortariaAll() {
        Assertions.assertAll(
            { Assertions.assertEquals(portaria(15, "", ""), "Negado.") },
            { Assertions.assertEquals(portaria(20, "", ""), "Negado.") },
            { Assertions.assertEquals(portaria(25, "VIP", ""), "Negado.") },

            { Assertions.assertEquals(portaria(25, "comum", "xt10"), "Welcome.") },
            { Assertions.assertEquals(portaria(25, "comum", "XT10"), "Welcome.") },
            { Assertions.assertEquals(portaria(25, "comum", "xxas10"), "Negado.") },

            { Assertions.assertEquals(portaria(25, "premium", "xl10"), "Welcome.") },
            { Assertions.assertEquals(portaria(25, "premium", "XL10"), "Welcome.") },
            { Assertions.assertEquals(portaria(25, "premium", "xxas10"), "Negado.") },

            { Assertions.assertEquals(portaria(25, "luxo", "xl10"), "Welcome.") },
            { Assertions.assertEquals(portaria(25, "luxo", "XL10"), "Welcome.") },
            { Assertions.assertEquals(portaria(25, "luxo", "xxas10"), "Negado.") }
        )

    }
}