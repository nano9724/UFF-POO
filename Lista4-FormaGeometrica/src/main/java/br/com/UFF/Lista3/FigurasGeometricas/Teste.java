package br.com.UFF.Lista3.FigurasGeometricas;

public class Teste {

public static void main(String[] args) {
    
Quadrado q1 = new Quadrado(5);
Quadrado q2 = new Quadrado(8);

Triangulo t1 = new Triangulo(5,7,3,3);
Triangulo t2 = new Triangulo(8,6,4,4);

Circulo c1 = new Circulo(5);
Circulo c2 = new Circulo(8);


String quadrado1 = "A área do quadrado q1 é:" + q1.calculaArea()+ "\n" + "E o perimetro é: " + q1.calculaPerimetro();

String quadrado2 = "A área do quadrado q2 é: " + q2.calculaArea()+ "\n" + "E o perimetro é: " + q2.calculaPerimetro();
System.out.println(quadrado1);
System.out.println(quadrado2);

String triangulo1 = "A área do triangulo t1 é: "+t1.calculaArea()+"\n" + "E o perimetro é: " + t1.calculaPerimetro();
String triangulo2 = "A área do triangulo t2 é: "+t2.calculaArea()+"\n" + "E o perimetro é: " + t2.calculaPerimetro();

System.out.println(triangulo1);
System.out.println(triangulo2);

String circulo1 = "A área do circulo c1 é: "+c1.calculaArea()+"\n" + "E o perimetro é: "+c1.calculaPerimetro();
String circulo2 = "A área do circulo c2 é: "+c2.calculaArea()+"\n" + "E o perimetro é: "+c2.calculaPerimetro();

System.out.println(circulo1);
System.out.println(circulo2);

}

}
    
    

