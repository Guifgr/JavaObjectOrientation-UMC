const { Router } = require('express');
const express = require('express');
const app = express();
const indexRouter = require('./routes/index')
const calculadoraRouter = require('./routes/calculadora')
const bodyParser = require('body-parser')

app.use(bodyParser.urlencoded({ extended: false }))
app.set('view engine', 'ejs');

app.use('/', indexRouter)
app.use('/calculadora', calculadoraRouter)
app.listen('3000')