class Retangulo {

  double ladoA, ladoB;

  public void setLadoA(double novoLado) {
    ladoA = novoLado;
  } 

  public void setLadoB(double novoLado) {
    ladoB = novoLado;
  }

  public void getLados() {
    System.out.println("O valor dos lados são: "+ladoA+" e "+ladoB);
  }

  public double calcularArea() {
    double area = ladoA * ladoB;
    return area;
  }

  public double calcularPerimetro() {
    double perimetro = 2 * (ladoA+ladoB);
    return perimetro;
  }
  
}