
package br.com.UFF.Lista3.FigurasGeometricas;

public class Triangulo extends Figura{

private double ladoA;
private double ladoB;
private double base;
private double altura;

public Triangulo(double base, double h, double ladoA, double ladoB){
this.ladoA= ladoA;
this.base=base;
this.ladoB=ladoB;
this.altura=h;
}

@Override
public double calculaArea(){
return (this.getBase() * this.getAltura())/2;
}

@Override
public double calculaPerimetro(){
return this.getLadoA() + this.getLadoB() + this.getBase();
}

public double getLadoB(){
return ladoB;
}

public void setLadoB(double ladoB){
this.ladoB = ladoB;
}

public double getLadoA(){
return ladoA;
}

public void setLadoA(double ladoA){
this.ladoA = ladoA;
}
public double getBase(){
return base;
}

public void setBase(double base){
this.base = base;
}

double getAltura() {
return altura;
}

public void setAltura(double altura){
this.altura = altura;
}



}