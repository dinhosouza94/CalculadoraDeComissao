fun main(args: Array<String>) {

    print("insira o valor de vendas efetuadas: ")
    var comissao = readLine()!!.toDouble()

    if(comissao <= 1000) {
        println("você não recebera comissao.")

    }else if(comissao >= 1001 && comissao <= 5000){
        comissao = comissao * 0.1
        println("Sua comissão é de $comissao.")

    }else if(comissao >= 5001 && comissao <= 9999){
        comissao = comissao * 0.2
        println("sua comissão é de $comissao")

    }else if(comissao >= 10000){
        comissao = comissao * 0.3
        println("sua comissão é de $comissao ")

    }else{
        println("dados inválidos")
    }

}