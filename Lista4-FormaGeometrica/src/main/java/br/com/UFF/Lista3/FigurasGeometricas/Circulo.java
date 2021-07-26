
package br.com.UFF.Lista3.FigurasGeometricas;


public class Circulo extends Figura{

private  double raio;

public Circulo(double raio){
this.raio=raio;
}

@Override
public double calculaArea(){
return Math.PI * (this.getRaio() * this.getRaio());
}

@Override
public double calculaPerimetro(){
return 2 * Math.PI * this.getRaio();
}

public double getRaio(){
return raio;
}

}