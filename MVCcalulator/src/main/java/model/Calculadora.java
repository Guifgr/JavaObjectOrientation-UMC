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
public class Calculadora {
       public double v1, v2, resultado;

    public double getV1() {
        return v1;
    }

    public void setV1(double v1) {
        this.v1 = v1;
    }

    public double getV2() {
        return v2;
    }

    public void setV2(double v2) {
        this.v2 = v2;
    }

    public double getResultado() {
        return resultado;
    }
    
    public void somar(){
        resultado=v1+v2;
    }
    public void subtrair(){
        resultado=v1-v2;
    }
    public void multiplicar(){
        resultado=v1*v2;
    }
    public void dividir(){
        resultado=v1/v2;
    }
    public boolean verificarDivisao(){
        if(v2!=0){
            return true;
        }else{
            return false;
        }
    }
}
