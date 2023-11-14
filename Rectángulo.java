public class Rectángulo{
    private double lado1;
    private double lado2;

    public Rectángulo(double lado1,double lado2){
        this.lado1=lado1;
        this.lado2=lado2;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica []";
    }
   
    public  double calculaArea(){
        return lado1*lado2;
    }
}