import java.util.List;

public class Main {
    public static void main(String[] args) {
       Rectángulo rectangulo=new Rectángulo(5.1 , 2.8);
      double arear= rectangulo.calculaArea();
      triangulo triangulo=new triangulo(12, 7);
      double areatr=triangulo.calcularAreaTrinagulo();
      circulo circulo=new circulo(6.4);
      double areacir= circulo.calculaAreaCirculo();
      pentagono pentagono=new pentagono(5,7.5);
      double areapent=pentagono.calculaAreaPentagono();
      hexagono hexagono=new hexagono(5.5,3.1);
      double areahex=hexagono.calculaAreaHexagono();
      System.out.println("Todos areas: \n Area rectangulo:"+arear+"\n Area Circulo: "+areacir+"\n Area Pentagono: "+areapent+"\n Area hexagono: "+areahex);
    }
}
