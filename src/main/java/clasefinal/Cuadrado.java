package clasefinal;

public class Cuadrado implements FiguraGeometrica{

    int lado;

    Cuadrado(){
        this.lado=3;
    }


    public int calcularArea() {
        DiaSemana diaSemana = DiaSemana.LUNES;
        System.out.println(diaSemana);
        return lado*lado;
    }
}
