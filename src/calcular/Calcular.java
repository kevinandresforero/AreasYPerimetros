
package calcular;


public class Calcular {
    
   
    private float radio;
    private float resultado;
    private float pi=(float) 3.1416;
    private float base;
    private float altura;
    
    public void setNumero1(float valor){
        this.radio=valor;
    }
    public void setNumero2(float valor){
        this.base=valor;
    }
    public void setNumero3(float valor){
        this.altura=valor;
    }
    public float getResultado(){
        return this.resultado;
    }
    public void circuloA (){
        this.resultado= (float)Math.pow(this.radio,2)*this.radio;
    }
    public void circuloP(){
        
        this.resultado=(2*this.radio)*this.pi;
    }
    public void trianguloA(){
        
        this.resultado=(this.base*this.altura)/2;
    }
    public void trianguloP(){
        
        this.resultado=this.base*3;
        
    }
    public void cuadradoA(){
        
        this.resultado=this.base*this.base;
    }
    public void cuadradoP(){
        
        this.resultado=this.base*4;
    }
   
}
