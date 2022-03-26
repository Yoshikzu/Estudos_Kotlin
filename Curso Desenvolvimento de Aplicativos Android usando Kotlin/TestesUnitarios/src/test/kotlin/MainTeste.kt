 import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.fail
import java.lang.NullPointerException

class MainTeste {

    @Test
    @DisplayName("Teste metodo xxoo")
    fun testCountXO(){
        //Caso um método falhe, os métodos abaixo não são executados
        Assertions.assertTrue(countXO("xxoo"))
        //Assertions.assertTrue(countXO("XXOO"))

        //Todos Métodos são executados
        Assertions.assertAll(
            {Assertions.assertTrue(countXO("xxoo"))},
            {Assertions.assertTrue(countXO("xxOO"))},
            {Assertions.assertTrue(countXO("XXoo"))}
        )
    }

    @Test
    @Disabled
    fun naoImplementado(){
        //TODO METODO... Disable => não executa
    }

    @Test
    fun vaiFalhar(){
        //fail("Mensagem de erro e vai falhar")
    }

    @Test
    fun assumption(){
        //só executa a 2 linha de teste se for verdadeiro o assumptions
        Assumptions.assumeTrue(countXO("xxoo"))
        Assertions.assertTrue(abc())
    }

    @Test
    fun exceptions(){
        assertThrows<NullPointerException> { abc2() }

    }
}