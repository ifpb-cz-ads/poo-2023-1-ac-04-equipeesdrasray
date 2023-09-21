# BMAtividade página 78

## Questão 1

A lâmpada deve possuir tipo, nome, marca, preço e código.

## Questão 2

O time deve possuir como dados o nome, jogadores, treinador e posição. Como operações, o time deve possuir as funções ÚltimoJogo() e PróximosJogos().

## Questão 3

```java
void mostrarDados(){
    System.out.print("O nome do correntista é ");
    System.out.print(nomeDoCorrentista);
    System.out.print("O saldo é");
    System.out.print(saldo);
    if(contaÉEspecial){
        if(saldo < 0){
            System.out.print("Saldo negativo!");
        }
        System.out.print("A conta é especial.");
    }
    else{
        System.out.print("A conta é comum.");
    }
}
```  

# BMAtividade página 79 à 80

## Questão 7

Identifique e explique o(s) erro(s) na classe abaixo:

```java
class Registro De Eleitor
{
/**
* Declaração dos campos desta classe
*/
int tituloDeEleitor; // número do título do eleitor
String nome; // nome do eleitor
short zonaEleitoral; // número da zona eleitoral
} // fim da classe
```

R: A classe possui espaços no nome declarado

## Questão 8

Identifique e explique o(s) erro(s) na classe abaixo:

```java
class Teste2
{
/**
* Declaração dos campos desta classe
*/
int num1,num2;
/**
* Declaração dos métodos desta classe
*/
int maior()
{
    if (num1 > num2)
        return true;
    else
        return false;
}
void menor()
{
    if (num1 < num2)
        return num1;
    else
        return num2;
}
} // fim da classe
```

R: No método **_"maior"_**, está sendo retornado **_boolean_** em vez de **_int_**. No método **_menor_** está sendo retornado **_int_** em um método que não deveria retornar nada.

## Questão 9

Identifique e explique o(s) erro(s) na classe abaixo.

```java
class TesteImpressao
{
    main(String[] args)
    {
        System.out.println(“7+2=”+(7+2));
        System.out.println(“7-2=”+(7-2));
        System.out.println(“7*2=”+(7*2));
        System.out.println(“7/2=”+(7/2));
        return true;
    }
} // fim da classe
```

R: O método main está declarado incorretamente

## Questão 10

Identifique e explique o(s) erro(s) na classe abaixo.

```java
class TesteDatas
{
    public void static main(String[] args)
    {
    Data2 hoje = new Data2();
    hoje.inicializaData(7,1,2001);
    Data2 amanha;
    amanha.inicializaData(8,1,2001);
    System.out.println(amanha.eIgual(hoje));
    }
} // fim da classe

// Identifique e explique o(s) erro(s) na classe abaixo.
class TesteObjetos
{
    public static void main(String[] args)
    {
        Data a;
        Data b = new Data();
        b = null;
        b = a;
    }
} // fim da classe
```

R: Supondo que as classes Data e Data2 estejam definidas. em **_TesteDatas_** a variável **_amanha_** tem um método chamado antes da inicialização (caso o método seja estático não há problema) o que é o mesmo caso do método **_eIgual_**.

Já na classe **_TesteObjetos_**, **_b_** está recebendo uma variável não inicializada.
