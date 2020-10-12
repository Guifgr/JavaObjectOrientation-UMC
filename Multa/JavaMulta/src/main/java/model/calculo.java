/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Guifgr
 */
public class calculo {
    public double velocidade;
    public double limite;

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    public double calculoMulta(){
        double multa;
        if(limite>velocidade){
            multa=0;
        }else if(limite*1.2>=velocidade){
            multa = 85.13;
        }else if(limite*1.5>=velocidade){
            multa = 127.69;
        } else{
            multa = 547.62;
        }
        return multa;
    }
    public double calculoPontos(){
        double pontos;
        if(limite>velocidade){
            pontos=0;
        }else if(limite*1.2>=velocidade){
            pontos = 4;
        }else if(limite*1.5>=velocidade){
            pontos = 5;
        } else{
            pontos = 7;
        }
        return pontos;
    }
}
