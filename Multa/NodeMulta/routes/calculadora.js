const express = require('express');
const router = express.Router();
var multa = require('../model/calculadora')

router.post('/', (req, res) =>{
    const dados = req.body
    multa.setVelocidadeAtual(dados.velocidade)
    multa.setVelocidadeLimite(dados.limite)
    multa.calcMultaPontos()
    multa.calcMultaValor()
    var Mensagem;
    if(isNaN(dados.velocidade) || isNaN(dados.limite)){
        Mensagem='Algo deu errado ao passar os dados!'
    }else{
        Mensagem = `A multa atual é ${multa.getMultaValor()} e os pontos são ${multa.getMultaPontos()}`;
    }
    res.render('resultado', { Mensagem })
})
router.get('/', (req, res)=>{
    res.render('index')
})
module.exports = router