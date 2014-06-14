package aula_II;

public class Triangulo extends Figura {
protected double lado1, lado2, lado3;
protected Object tipo;
enum Tipo {ESCALENO, EQUILATERO,ISOCELES};

public double calculaArea(){ return (lado1 + lado2 + lado3)/2; }
public double calculaPerimetro(){return lado1 + lado2 + lado3;}
public Object tipoTriangulo()
{
	if (lado1 == lado2  && lado2 == lado3 ) {
		tipo = Tipo.EQUILATERO;
	} else {
		if( lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
			tipo = Tipo.ISOCELES; 
		} else {
			tipo = Tipo.ESCALENO;
		}
	}
	return tipo;
}
}
