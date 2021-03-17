var multa ={
    velocidadeAtual: '',
    velocidadeLimite: '',
    multaValor: '',
    multaPontos: '',

    getVelocidadeAtual: function(){
        return this.velocidadeAtual;
    },
    getVelocidadeLimite: function(){
        return this.velocidadeLimite;
    },
    getMultaValor: function(){
        return this.multaValor;
    },
    getMultaPontos: function(){
        return this.multaPontos;
    },

    setVelocidadeAtual: function(velocidadeAtual){
        this.velocidadeAtual = velocidadeAtual
    },
    setVelocidadeLimite: function(velocidadeLimite){
        this.velocidadeLimite = velocidadeLimite
    },

    calcMultaValor: function multaValor(){
        var multa;
        if(this.velocidadeLimite>this.velocidadeAtual){
            multa=0;
        }else if(this.velocidadeLimite*1.2>=this.velocidadeAtual){
            multa = 85.13;
        }else if(this.velocidadeLimite*1.5>=this.velocidadeAtual){
            multa = 127.69;
        } else{
            multa = 547.62;
        }
        this.multaValor = multa;
    },
    calcMultaPontos: function multaPontos(){
        var pontos;
        if(this.velocidadeLimite>this.velocidadeAtual){
            pontos=0;
        }else if(this.velocidadeLimite*1.2>=this.velocidadeAtual){
            pontos = 4;
        }else if(this.velocidadeLimite*1.5>=this.velocidadeAtual){
            pontos = 5;
        } else{
            pontos = 7;
        }
        this.multaPontos = pontos;
    }
}

module.exports = multa;


