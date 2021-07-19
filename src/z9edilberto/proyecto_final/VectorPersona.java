

package z9edilberto.proyecto_final;

import javax.swing.JOptionPane;

public class VectorPersona {
    private int tam;   //determina el tamaño, el numero máximo de elementos
    private int contador; // cantidad de elementos que hay almacenados en el vector
    private Persona vector[];  //el conjunto de elementos

     //Constructor de la clase vector...
    public VectorPersona(int tam){
        this.tam = tam;
        contador = 0;
        vector = new Persona[this.tam];
    }
    
    public boolean Adicionar(Persona pers)
    {
        if(contador<tam)
        {
            vector[contador]=pers;
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
    
    public Persona Buscar (String usuario, int contrasena)
    {
        Persona p = null;
        for (int i = 0; i < contador; i++) {
            if(vector[i].getUsuario().equals(usuario) && vector[i].getContrasena()==contrasena)
                return vector[i];  //cuando encuentra el elemento deja de hacer el ciclo
        }  //si termina todo el ciclo, entonces devuelve un null indicando que no se encuentra el elemento.
        return p;
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
//    public double Total()
//    {
//        double total = 0;
//        for (int i = 0; i < counter; i++) {
//            total += vector[i].getAccount();
//        }
//        return total;    
//    }
    
    public boolean Habilitar(int min, int max)
    {
        for (int i = 0; i < contador; i++) {
            if(vector[i].getEdad()>=min && vector[i].getEdad()<=max)
            {
                if(vector[i].getEstado()==(false)){
                    vector[i].setEstado(true);
                    return true;
                }
                
            }            
        }
        return false;
    }
    
    public boolean Desahilitar()
    {
        for (int i = 0; i < contador; i++) {
            if(vector[i].getEstado()==true)
            {
                vector[i].setEstado(false);
                    return true;
                
                
            }            
        }
        return false;
    }
 
    public int Habilitados(){
        int cant=0;
        
        for (int i = 0; i < contador; i++) {
            if(vector[i].getEstado()==true)
            {
                cant=cant+1;
            }            
        }
        
        return cant;
    }
    
}
