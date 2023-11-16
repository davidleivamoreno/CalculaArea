import java.util.List;

public class Main {
    public static void main(String[] args) {
       Rectángulo rectangulo=new Rectángulo(5.1 , 2.8);
      double arear= rectangulo.calculaArea();
      Circulo circulo=new Circulo(6.4);
      double areacir= circulo.calculaAreaCirculo();
      Pentagono pentagono=new Pentagono(5,7.5);
      double areapent=pentagono.calculaAreaPentagono;
      hexagono hexagono=new hexagono(5.5,3.1);
    }
}
