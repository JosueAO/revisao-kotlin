package fundamentos

/**
 * Erros esperados e inferências
 */


fun main(args: Array<String>) {

    // Kotlin: This variable must either have a type annotation or be initialized
/**
    var a // Erro!
    var b = 2
    a = 10
    print(a + b)

 **/

    // Kotlin: The floating-point literal does not conform to the expected type Int
 /**
    var a = 1
    var b = 2
    a = 2.3 // Erro!
    print(a + b)

  */

    // Kotlin: Val cannot be reassigned

/*
    val a: Int = 1
    val b = 2 // Tipo inferido
    a = a + b // Erro!
    print(a)

 */


}
