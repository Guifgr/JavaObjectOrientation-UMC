const express = require('express');
const router = express.Router();
var multa = require('../model/calculadora')

router.post('/', (req, res) =>{
    const dados = req.body
    multa.setVelocidadeAtual(dados.velocidade)
    multa.setVelocidadeLimite(dados.limite)
    multa.calcMultaPontos()
    multa.calcMultaValor()
    const Mensagem = `A multa atual é ${multa.getMultaValor()} e os pontos são ${multa.getMultaPontos()}`;
    res.render('resultado', { Mensagem })
})

module.exports = router