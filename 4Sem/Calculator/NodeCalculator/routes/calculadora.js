const express = require('express');
const router = express.Router();

function calculadora(operacao, valor1, valor2){
    var resul;
    var mensagem;
    switch (operacao) {
        case 'multiplica':
            resul = valor1*valor2;
            mensagem = "A multiplicação deu: "
            break;
        case 'soma':
            resul = valor1+valor2;
            mensagem = "A soma deu: "
            break;
        case 'divide':
            resul = valor1/valor2;
            mensagem = "A divisão deu: "
            break;
        case 'diferenca':
            resul = valor1-valor2;
            mensagem = "A subtração deu: "
            break;
        default:
            break;
    }
    if (isNaN(resul)) {
       return "Algo deu errado ao inserir os dados para a conta!" 
    }else{
        return mensagem+resul
    }
}

router.post("/" , (req, res) => {
    
    var operacao = req.body.btnoperacao;
    const valor1 = req.body.valor1;
    const valor2 = req.body.valor2;

    console.log(operacao, valor1, valor2)
    
    var resul;
    resul = calculadora(operacao, valor1, valor2);
    
    console.log(resul)
    res.render("resultado", {resul: resul})
});

module.exports = router 