const express = require("express");
const app = express();
const indexRouter = require("./routes/index");
const calculadoraRouter = require("./routes/calculadora");
const bodyParser = require("body-parser");

app.set("view engine", "ejs"); //set de 
app.set("views", __dirname + "/view");
app.use(bodyParser.urlencoded({extended:false}));
app.use(bodyParser.json());
app.use("/", indexRouter);
app.use("/calculadora", calculadoraRouter);

app.listen(process.env.PORT || 3000);