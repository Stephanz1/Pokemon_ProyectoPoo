// Clase 

public class Estudiante {
    //Atributos 
    
     private String nombre;
     private int promedio = 0;
     
     
//Metodos
    public String obtenerNombre()
    {
        return nombre;
    }

    public void establecerNombre(String nombre)
    {
        this.nombre = nombre; 
    }
    
    public int obtenerPromedio(){
        return this.promedio;
    }
    
    public void establecerPromedio(int promedio){
        if(promedio < 0 || promedio > 10){
            System.out.println("El promedio no es valido");
        }else{
            System.out.println("El promedio se ha guardado");
            this.promedio = promedio;
        }
        
        
    public void convertirPromedioLetra(){
       String letra = "";
    
        if(promedio == 10){
            letra = "A";
        }
        if(promedio == 9){
            letra = "B";
        }
        if(promedio == 8){
            letra = "C";
        }
        if(promedio == 7){
            letra = "D";
        }
        if(promedio == 6){
            letra = "E";
        }
        if(promedio == 5){
            letra = "F";
        }
        System.out.printf("El equivalente en letra es %s", letra);
    }
}
