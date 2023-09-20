package Logic;
public class Metodos {
    double piValue = Math.PI;
    public double calcularTiempoFormuPeriodo(double periodo,double nvueltas){
      return periodo*nvueltas;
    }
    
    public double calcularTiempoFormuFrecuencia(double nvueltas,double frecuencia){
    return nvueltas/frecuencia;
    }

    public double calcularNdevueltasFormuFrecuencia(double frecuencia ,double tiempo){
    return frecuencia*tiempo;
    }
 
    public double calcularNdevueltasFormuPeriodo(double periodo,double tiempo){
    return tiempo/periodo;
    }

    public double calcularperiodoFormula(double tiempo,double nvueltas){ 
     return tiempo/nvueltas;
    }
     public double calcularperiodoFormulaVangular(double vangular){
     return vangular*(2*piValue);
    }
     public double calcularperiodoFormulaVlineal(double radio,double vlineal){
     return vlineal*(2*piValue*radio);
    }

    public double calcularFrecuencia(double tiempo,double nvueltas){
       return nvueltas/tiempo;
    }
    public double velocidad_lineal(double radio,double periodo){
     return (2*piValue*radio)/periodo;
    }

    public double velocidadLinealFormualaVangular(double radio,double vangular){
        return radio*vangular;
    }

    public double calcularVelocidadAngular(double periodo){
        return (2*piValue)/periodo  ;
    }
    public double calcularVelocidadAngFormFr(double frecuencia ){
     return frecuencia*2+piValue;
    }
    public double calcularAceleracion(double velocidadlineal,double radio){
      return velocidadlineal*velocidadlineal/radio;
    }
    public double calcularAceleracionFormula2(double vAngular,double radio){
      return (vAngular*vAngular)*radio;
    }
    public double calcularRadio(double aceleracion,double velocidadlineal){
      return aceleracion*(velocidadlineal* velocidadlineal);
    }
    public double calcularRadiodespejeVelocidad(double velocidadlineal,double periodo){
    return  (velocidadlineal*periodo)/2*piValue;
    }


}
