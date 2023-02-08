package correccioncalculadora;
import static java.lang.Math.pow;
import java.text.DecimalFormat;

public class CalculadoraClass {
    //Atributos
    public double num1,num2,resultado,porcentaje_iva;
    public double angulo,num3;
    
    //Constructor
    public CalculadoraClass(){
    num1=0;
    num2=0;
    num3=0;
    resultado=0;
    angulo=0;
    }
    //Metodos
    //Operaciones matematicas
public double Suma(double a, double b){
        return a+b;
    }
    public void Resta(float a, float b){
        resultado=a-b;
    }
    public float Multiplicacion(float a, float b){
        return a*b;
    }
    public float Division(float a, float b){
        return a/b;
    }
    //Operaciones Trigonometricas
    public String Seno(double n){
        double res;
        res=Math.sin(n);
        DecimalFormat df=new DecimalFormat("###.##");
        return df.format(res);
    }
    public String Coseno(double n){
       double res;
        res=Math.cos(n);
        DecimalFormat df=new DecimalFormat("###.##");
        return df.format(res);
    }
    public String Tangente(double n){
       double res;
        res=Math.tan(n);
        DecimalFormat df=new DecimalFormat("###.##");
        return df.format(res);
    }
    //Raiz y potencia enesima
    public void Raiz_enesima(double n, double m){
        resultado=(float) Math.pow(n,1/m);
    }
    public void Potencia_enesima(double n, double m){
        resultado=(float) Math.pow(n,m);
    }
    //IVA
    public double IVA(double n, float m){
        m=m/100;
        return Math.round(m*n);
    }

    private float sqrt(int i, double n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}