const express = require('express');
const router = express.Router();
var multa = require('../model/calculadora')

router.post('/', (req, res) =>{
    const dados = req.body
    multa.setVelocidadeAtual(dados.velocidade)
    multa.setVelocidadeLimite(dados.limite)
    var Mensagem;
    if(isNaN(dados.velocidade) || isNaN(dados.limite)){
        Mensagem='Algum dos dados vieram como simbolos que não eram numeros!'
    }else if(dados.velocidade === '' || dados.velocidade === null || dados.limite === '' || dados.limite === null){
        Mensagem='Algum dos dados estavam vazios!!!'
    }else{
        multa.calcMultaPontos()
        multa.calcMultaValor()
        Mensagem = `A multa atual é ${multa.getMultaValor()} e os pontos são ${multa.getMultaPontos()}`;
    }
    res.render('resultado', { Mensagem })
})
router.get('/', (req, res)=>{
    res.render('index')
})
module.exports = router