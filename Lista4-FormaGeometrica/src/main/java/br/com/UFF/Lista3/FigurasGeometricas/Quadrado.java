
package br.com.UFF.Lista3.FigurasGeometricas;

public class Quadrado extends Figura{

private double lado;

public Quadrado(double lado){
this.setLado(lado);
}

@Override
public double calculaArea(){
return this.getLado() * this.getLado();
}

@Override
public double calculaPerimetro(){
return 4 * this.getLado();
}

public double getLado(){
return lado;
}

public void setLado(double lado){
this.lado = lado;
}

}