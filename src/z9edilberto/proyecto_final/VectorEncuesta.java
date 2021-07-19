
package z9edilberto.proyecto_final;

import javax.swing.JOptionPane;

public class VectorEncuesta {
    private int tam;   //determina el tamaño, el numero máximo de elementos
    private int contador; // cantidad de elementos que hay almacenados en el vector
    private Encuesta vector[];  //el conjunto de elementos

     //Constructor de la clase vector...
    public VectorEncuesta(int tam){
        this.tam = tam;
        contador = 0;
        vector = new Encuesta[this.tam];
    }
    
    public boolean Adicionar(Encuesta encu)
    {
        if(contador<tam)
        {
            vector[contador]=encu;
            contador++;
            return true;
        }
        return false;
    }
    
    @Override  //en herencia se los explico
    public String toString()
    {
        String text="";
        for (int i = 0; i < contador; i++) {
            text=text + vector[i].toString() + "\n";
        }
        return text;
    }
    
    public Encuesta Buscar (String usuario, int contrasena)
    {
        Persona p = new Persona();
        Encuesta en = null;
        
        for (int i = 0; i < contador; i++) {
            p = vector[i].getPersona();
            if(p.getUsuario().equals(usuario) && p.getContrasena()==contrasena)
                return vector[i];  //cuando encuentra el elemento deja de hacer el ciclo
        }  //si termina todo el ciclo, entonces devuelve un null indicando que no se encuentra el elemento.
        return en;
    }
 
    public boolean Eliminar(String usuario, int contrasena)
    {
        for (int i = 0; i < contador; i++) {
            if(vector[i].getPersona().getUsuario().equals(usuario) && vector[i].getPersona().getContrasena()==contrasena)
            {
                for (int j = i; j < contador-1; j++) {
                    vector[j]=vector[j+1];
                }
                vector[contador-1]=null;
                i=contador;
                contador--;
                return true;
            }            
        }
        return false;
    }
    
    public int Tamaño()
    {
        int tamaño=0;
        
        for (int i = 0; i < contador; i++) {
            tamaño = tamaño + 1;
            //tam++
        }
        return tamaño;
    }
    
    public void Resultado_encuesta(){
        
        int Uno1=0, Uno2=0;
        int Dos1=0, Dos2=0, Dos3=0, Dos4=0;
        int Tres1=0, Tres2=0, Tres3=0, Tres4=0, Tres5=0;
        int Cuatro1=0, Cuatro2=0, Cuatro3=0, Cuatro4=0, Cuatro5=0;
        int Cinco1=0, Cinco2=0, Cinco3=0, Cinco4=0, Cinco5=0;
        int Seis1=0, Seis2=0;
        int Siete1=0, Siete2=0;
        int Ocho1=0, Ocho2=0;
        int Nueve1=0, Nueve2=0;
        int Diez1=0, Diez2=0, Diez3=0, Diez4=4;
        
        boolean r1, r6, r7, r8, r9;
        String r2, r3, r4, r5, r10;
        
        for (int i = 0; i < contador; i++) {
            
            r1=vector[i].isPregunta1();
                if(r1==(true)){
                    Uno1=Uno1+1;
                }else{
                    Uno2=Uno2+1;
                }
                
             r2=vector[i].getPregunta2();
                if(r2.equals("0-2.000.000"))
                    Dos1=Dos1+1;
                if(r2.equals("2.000.001-5.000.000"))
                    Dos2=Dos2+1;
                if(r2.equals("5.000.001-10.000.000"))
                    Dos3=Dos3+1;
                if(r2.equals("Mayores a 10.000.000"))
                    Dos4=Dos4+1;
            
            r3=vector[i].getPregunta3();
                if(r3.equals("Salud"))
                    Tres1=Tres1+1;
                if(r3.equals("Educación"))
                    Tres2=Tres2+1;
                if(r3.equals("Obras civiles"))
                    Tres3=Tres3+1;
                if(r3.equals("Personas vulnerables"))
                    Tres4=Tres4+1;
                if(r3.equals("Seguridad"))
                    Tres5=Tres5+1;
            
            r4=vector[i].getPregunta4();
                if(r4.equals("Canasta familiar"))
                    Cuatro1=Cuatro1+1;
                if(r4.equals("Cigarrillos y bebidas alcohólicas"))
                    Cuatro2=Cuatro2+1;
                if(r4.equals("Bebidas azucaradas"))
                    Cuatro3=Cuatro3+1;
                if(r4.equals("Gasolina"))
                    Cuatro4=Cuatro4+1;
                if(r4.equals("Transporte"))
                    Cuatro5=Cuatro5+1;
            
            r5=vector[i].getPregunta5();
                //"Poquísimo","Poco","A medias","Mucho","Muchísimo"
                if(r5.equals("Poquisimo"))
                    Cinco1=Cinco1+1;
                if(r5.equals("Poco"))
                    Cinco2=Cinco2+1;
                if(r5.equals("A medias"))
                    Cinco3=Cinco3+1;
                if(r5.equals("Mucho"))
                    Cinco4=Cinco4+1;
                if(r5.equals("Muchisimo"))
                    Cinco5=Cinco5+1;
            
            r6=vector[i].isPregunta6();
            
                if(r6==(true)){
                    Seis1=Seis1+1;
                }else{
                    Seis2=Seis2+1;
                }
                
            r7=vector[i].isPregunta7();
            
                if(r7==(true)){
                    Siete1=Siete1+1;
                }else{
                    Siete2=Siete2+1;
                }
                
            r8=vector[i].isPregunta8();
            
                if(r8==(true)){
                    Ocho1=Ocho1+1;
                }else{
                    Ocho2=Ocho2+1;
                }
                
            r9=vector[i].isPregunta9();
            
                if(r9==(true)){
                    Nueve1=Nueve1+1;
                }else{
                    Nueve2=Nueve2+1;
                }
                
            r10=vector[i].getPregunta10();
            //"100.000-300.000","300.000–500.000","500.000–700.000","700.000-900.000"
                if(r10.equals("100.000-300.000"))
                    Diez1=Diez1+1;
                if(r10.equals("300.000–500.000"))
                    Diez2=Diez2+1;
                if(r10.equals("500.000–700.000"))
                    Diez3=Diez3+1;
                if(r10.equals("700.000-900.000"))
                    Diez4=Diez4+1;
            
            JOptionPane.showMessageDialog(null, "Resultados de las encuestas:\nPregunta 1\n Si: "+Uno1+" No: "+Uno2
                    +"\nPregunta 2\n 0-2.000.000: "+Dos1+" 2.000.001-5.000.000: "+Dos2+" 5.000.001-10.000.000: "+Dos3+" Mayores a 10.000.000: "+Dos4
                    +"\nPregunta 3\n Salud: "+Tres1+" Educación: "+Tres2+" Obras civiles: "+Tres3+" Personas vulnerables: "+Tres4+" Seguridad: "+Tres5
                    +"\nPregunta 4\n Canasta familiar: "+Cuatro1+" Cigarrillos y bebidas alcohólicas: "+Cuatro2+" Bebidas azucaradas: "+Cuatro3+" Gasolina: "+Cuatro4+" Transporte: "+Cuatro5
                    +"\nPregunta 5\n Poquisimo: "+Cinco1+" Poco: "+Cinco2+" A medias: "+Cinco3+" Mucho: "+Cinco4+" Muchisimo: "+Cinco5
                    +"\nPregunta 6\n Si: "+Seis1+" No: "+Seis2
                    +"\nPregunta 7\n Si: "+Siete1+" No: "+Siete2
                    +"\nPregunta 8\n Si: "+Ocho1+" No: "+Ocho2
                    +"\nPregunta 9\n Si: "+Nueve1+" No: "+Nueve2
                    +"\nPregunta 10\n 100.000-300.000: "+Diez1+" 300.000–500.000: "+Diez2+" 500.000–700.000: "+Diez3+" 700.000-900.000: "+Diez4);
        }
    }
    
    public void Encu_por_ciudad()
    {
        int cont_medellin=0, cont_cali=0, cont_bogota=0;
        
        for (int i = 0; i < contador; i++) {
            if(vector[i].getPersona().getCiudad().equals("Medellin"))
            
               cont_medellin = cont_medellin + 1;
            
            if(vector[i].getPersona().getCiudad().equals("Cali"))
                
                cont_cali = cont_cali + 1;
            
            if(vector[i].getPersona().getCiudad().equals("Bogota"))
                
                cont_bogota = cont_bogota + 1;
                      
        }
        
        JOptionPane.showMessageDialog(null, "La cantidad de encuestas realizadas por ciudad son:\nMedellin: "
                    +cont_medellin+"\nCali: "+cont_cali+"\nBogota: "+cont_bogota);
    
    }
    
    
    public void Porcentaje_manifestacion(VectorEncuesta vec)
    {
        int total = vec.Tamaño();
        
        int total_si_estrato1=0, total_no_estrato1=0;
        int total_si_estrato2=0, total_no_estrato2=0;
        int total_si_estrato3=0, total_no_estrato3=0;
        int total_si_estrato4=0, total_no_estrato4=0;
        int total_si_estrato5=0, total_no_estrato5=0;
        int total_si_estrato6=0, total_no_estrato6=0;
        
        double promedio_si_est1=0, promedio_no_est1=0;
        double promedio_si_est2=0, promedio_no_est2=0;
        double promedio_si_est3=0, promedio_no_est3=0;
        double promedio_si_est4=0, promedio_no_est4=0;
        double promedio_si_est5=0, promedio_no_est5=0;
        double promedio_si_est6=0, promedio_no_est6=0;
        
        for (int i = 0; i < contador; i++) {
            
            if(vector[i].getPersona().getEstrato()==1 && vector[i].isPregunta6()==true)
                total_si_estrato1=total_si_estrato1 + 1;
            
            if(vector[i].getPersona().getEstrato()==1 && vector[i].isPregunta6()==false)
                total_no_estrato1=total_no_estrato1 + 1;
            
            if(vector[i].getPersona().getEstrato()==2 && vector[i].isPregunta6()==true)
                total_si_estrato2=total_si_estrato2 + 1;
            
            if(vector[i].getPersona().getEstrato()==2 && vector[i].isPregunta6()==false)
                total_no_estrato2=total_no_estrato2 + 1;
            
            if(vector[i].getPersona().getEstrato()==3 && vector[i].isPregunta6()==true)
                total_si_estrato2=total_si_estrato2 + 1;
            
            if(vector[i].getPersona().getEstrato()==3 && vector[i].isPregunta6()==false)
                total_no_estrato3=total_no_estrato3 + 1;
        
            if(vector[i].getPersona().getEstrato()==4 && vector[i].isPregunta6()==true)
                total_si_estrato4=total_si_estrato4 + 1;
            
            if(vector[i].getPersona().getEstrato()==4 && vector[i].isPregunta6()==false)
                total_no_estrato4=total_no_estrato4 + 1;
            
            if(vector[i].getPersona().getEstrato()==5 && vector[i].isPregunta6()==true)
                total_si_estrato5=total_si_estrato5 + 1;
            
            if(vector[i].getPersona().getEstrato()==6 && vector[i].isPregunta6()==false)
                total_no_estrato6=total_no_estrato6 + 1;
        
        }
            
            promedio_si_est1= (total_si_estrato1 * 100)/total;
            promedio_no_est1= (total_no_estrato1 * 100)/total;
                    
            promedio_si_est2= (total_si_estrato2 * 100)/total;
            promedio_no_est2= (total_no_estrato2 * 100)/total;
                    
            promedio_si_est3= (total_si_estrato3 * 100)/total;
            promedio_no_est3= (total_no_estrato3 * 100)/total;
                    
            promedio_si_est4= (total_si_estrato4 * 100)/total;
            promedio_no_est4= (total_no_estrato4 * 100)/total;
            
            promedio_si_est5= (total_si_estrato5 * 100)/total;
            promedio_no_est5= (total_si_estrato5 * 100)/total;
               
            promedio_si_est6= (total_si_estrato6 * 100)/total;
            promedio_no_est6= (total_no_estrato6 * 100)/total;
            
            
            JOptionPane.showMessageDialog(null, "El 100% de encuestas es: "+total
                    +"\nPrrgunta 6: \nEstrato 1: Si: "+promedio_si_est1+" No: "+promedio_no_est1
                    +"\nEstrato 2: Si: "+promedio_si_est2+"% No: "+promedio_no_est2+"%"
                    +"\nEstrato 3: Si: "+promedio_si_est3+"% No: "+promedio_no_est3+"%"
                    +"\nEstrato 4: Si: "+promedio_si_est4+"% No: "+promedio_no_est4+"%"
                    +"\nEstrato 5: Si: "+promedio_si_est5+"% No: "+promedio_no_est5+"%"
                    +"\nEstrato 6: Si: "+promedio_si_est6+"% No: "+promedio_no_est6+"%");        
    }
    
    
    public void Recaudo_peajes_genero(){
        
        int total_femenino, total_masculino;
        String p3_femenino, p3_masculino;
        
        int salud_femenino=0, educacion_femenino=0, obras_femenino=0, personas_femenino=0, seguridad_femenino=0;
        int salud_masculino=0, educacion_masculino=0, obras_masculino=0, personas_masculino=0, seguridad_masculino=0;
        
        for (int i = 0; i < contador; i++) {
            
            if(vector[i].getPersona().getGenero().equals("Femenino")){
                p3_femenino = vector[i].getPregunta3();
                
                if(p3_femenino.equals("Salud"))
                    salud_femenino = salud_femenino + 1;
                
                if(p3_femenino.equals("Educación"))
                    educacion_femenino = educacion_femenino + 1;
                
                if(p3_femenino.equals("Obras civiles"))
                    obras_femenino = obras_femenino + 1;
                
                if(p3_femenino.equals("Personas vulnerables"))
                    personas_femenino = personas_femenino + 1;
                
                if(p3_femenino.equals("Seguridad"))
                    seguridad_femenino = seguridad_femenino + 1;
            }    
                    
            if(vector[i].getPersona().getGenero().equals("Masculino")){
                p3_masculino = vector[i].getPregunta3();        
                    
                if(p3_masculino.equals("Salud"))
                    salud_masculino = salud_masculino + 1;
                
                if(p3_masculino.equals("Educación"))
                    educacion_masculino = educacion_masculino + 1;
                
                if(p3_masculino.equals("Obras civiles"))
                    obras_masculino = obras_masculino + 1;
                
                if(p3_masculino.equals("Personas vulnerables"))
                    personas_masculino = personas_masculino + 1;
                
                if(p3_masculino.equals("Seguridad"))
                    seguridad_masculino = seguridad_masculino + 1;
            }     
            
        }
        
        JOptionPane.showMessageDialog(null, "Para la pregunta 3 las respuestas fueron: \nFemenino\n:"
                    +"Salud: "+salud_femenino+" Educaión: "+educacion_femenino+" Obras civiles: "
                    +obras_femenino+" Personas vulnerables: "+personas_femenino+" Seguridad: "+seguridad_femenino
                    +"\nMasculino\nSalud: "+salud_masculino+" Educaión: "+educacion_masculino+" Obras civiles: "
                    +obras_masculino+" Personas vulnerables: "+personas_masculino+" Seguridad: "+seguridad_masculino);
    }
    
    public void Promedio_pronderado_r10(){
     
        String res10;
        int total;
        double pon, promedio_ponderado;
        int cont1=0, cont2=0, cont3=0, cont4=0;
        
        for (int i = 0; i < contador; i++) {
            
            res10 = vector[i].getPregunta10();
            
            if(res10.equals("100.000-300.000"))
                cont1 = cont1 + 1;
            
            if(res10.equals("300.000–500.000"))
                cont2 = cont2 + 1;
            
            if(res10.equals("500.000–700.000"))
                cont3 = cont3 + 1;
            
            if(res10.equals("700.000-900.000"))
                cont4 = cont4 + 1;
        }
        //formula para hallar promedio ponderado: https://definicion.de/promedio-ponderado/
        total = cont1+cont2+cont3+cont4;
        
        pon = (300.000*cont1)+(500.000*cont2)+(700.000*cont3)+(900.000*cont4);
        
        promedio_ponderado = pon/total;
        
        JOptionPane.showMessageDialog(null, "El promedio pondera para la respuesta 10 es: "+promedio_ponderado);
    }
    
    public void Top_productos_IVA(){
         
        String res4;
        int cont1=0, cont2=0, cont3=0, cont4=0, cont5=0;
        int mayor, menor;
         
         
        for (int i = 0; i < contador; i++) {
            res4=vector[i].getPregunta4();
             
            if(res4.equals("Canasta familiar"))
                cont1 = cont1 + 1;
         
            if(res4.equals("Cigarrillos y bebidas alcohólicas"))
                cont2 = cont2 + 1;
             
            if(res4.equals("Bebidas azucaradas"))
                cont3 = cont3 + 1;
             
            if(res4.equals("Gasolina"))
                cont4 = cont4 + 1;
             
            if(res4.equals("Transporte"))
                cont5 = cont5 + 1;
        
        }
        
        if(cont1>=cont2 && cont1>cont3 && cont1>cont4 && cont1>cont5){
            JOptionPane.showMessageDialog(null, "1. Canasta familiar");
        }
        
        if(cont2>cont1 && cont2>cont3 && cont2>cont4 && cont2>cont5){
            JOptionPane.showMessageDialog(null, "1. Cigarrillos y bebidas alcohólicas");
        }
        
        if(cont3>cont1 && cont3>cont2 && cont3>cont4 && cont3>cont5){
            JOptionPane.showMessageDialog(null, "1. Bebidas azucaradas");
        }
        
        if(cont4>cont1 && cont4>cont2 && cont4>cont3 && cont4>cont5){
            JOptionPane.showMessageDialog(null, "1. Gasolina");
        }
        
        if(cont5>cont1 && cont5>cont2 && cont5>cont4 && cont5>cont3){
            JOptionPane.showMessageDialog(null, "1. Transporte");
        }
    
        
    }
}