
package z9edilberto.proyecto_final;

import javax.swing.JOptionPane;


public class Clase_Principal {
    
    
    public static void main(String[] args) {
        
        int tam = 2;
        
        VectorPersona vec_per = new VectorPersona(tam);
        VectorEncuesta vec_encu=new VectorEncuesta(tam);
        
        
        String usuario, ciudad, genero;
        int contrasena, edad, estrato;
        boolean estado;
               
        String t_genero [] = {"Femenino", "Masculino"};        
        String t_estrato [] = {"1", "2", "3", "4", "5", "6"};
        
        String opt;
        
        String menu[]={"Registrar usuario", "Habilitar usuarios en un rango de edad", "Registrar encuesta",
            "Corregir encuesta", "Eliminar encuesta", "Mostrar resultados de las encuestas", 
            "Finalizar encuesta", "Estadísticas", "Exit"};
        
        boolean r1, r6, r7, r8, r9;
                String resp[]={"Si", "No"};
                String resp2[]={"0-2.000.000","2.000.001-5.000.000","5.000.001-10.000.000","Mayores a 10.000.000"};
                String resp3[]={"Salud","Educación","Obras civiles","Personas vulnerables","Seguridad"};
                String resp4[]={"Canasta familiar","Cigarrillos y bebidas alcohólicas","Bebidas azucaradas","Gasolina","Transporte"};
                String resp5[]={"Poquísimo","Poco","A medias","Mucho","Muchísimo"};
                String resp10[]={"100.000-300.000","300.000–500.000","500.000–700.000","700.000-900.000"};
        
        String todas_ciudades [] = {"Medellin", "Cali", "Bogota"};        
        do{
            opt=(String)JOptionPane.showInputDialog(null,"Selected option","Main menu",
                    1, null, menu, menu[0]);
            switch(opt){
                
                case "Registrar usuario":
                    

                        usuario = (String) JOptionPane.showInputDialog(null, "Ingresar nombre del usuario");
                        contrasena = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar constraseña"));
                        edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar edad"));
                        ciudad = (String) JOptionPane.showInputDialog(null, "Selected option", "Elija la ciudad a la cual pertence",
                                1, null, todas_ciudades, todas_ciudades[0]);
                        estrato = Integer.parseInt((String) JOptionPane.showInputDialog(null, "Selecionar Estrato", "Tipo de estrato", 1, null, t_estrato, t_estrato[0]));
                        genero = (String) JOptionPane.showInputDialog(null, "Selecionar Género", "Tipo de género", 1, null, t_genero, t_genero[0]);
                        estado = false; //Deshabilitado

                        Persona p = new Persona(usuario, contrasena, edad, ciudad, estrato, genero, estado);

                        vec_per.Adicionar(p);

                        JOptionPane.showMessageDialog(null, "Usuario registrado con exito");
                    
                    
                break;
                        
                case "Habilitar usuarios en un rango de edad":
                    
                    int min, max;
        
                    JOptionPane.showMessageDialog(null, "Hablitar un rango de edad");

                    min = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar rango minimmo de edad"));
                    max = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrsar rango máximo de edad"));

                    vec_per.Habilitar(min, max);

                    JOptionPane.showMessageDialog(null, "Se habilitaron los usuarios en el rango establecido");
                
                break;
                    
                case "Registrar encuesta":
                  
                    JOptionPane.showMessageDialog(null, "Confirmar usuario y contraseña");

                    usuario = (String) JOptionPane.showInputDialog(null, "Confirme nombre del usuario");
                    contrasena = Integer.parseInt(JOptionPane.showInputDialog(null, "Confirme constraseña"));
                    
                    Persona pers = vec_per.Buscar(usuario, contrasena);
                    
                    if(pers!=null){
                        
                        if(pers.getEstado()==true){
                   
                        String nombre_usuario = pers.getUsuario();
                        JOptionPane.showMessageDialog(null, "Registrar encuesta para: " + nombre_usuario);

                        String p1 = (String) JOptionPane.showInputDialog(null, "Selected option", "¿Está de acuerdo con el IVA a los servicios públicos para los estratos 4, 5 y 6?",
                                1, null, resp, resp[0]);

                        if (p1.equals("Si")) {
                            r1 = true;
                        } else {
                            r1 = false;
                        }

                        String r2 = (String) JOptionPane.showInputDialog(null, "Selected option", "A partir de que rango de salarios, considera que se puede pagar impuesto de renta:",
                                1, null, resp2, resp2[0]);

                        String r3 = (String) JOptionPane.showInputDialog(null, "Selected option", "Si se instalan peajes en el área metropolitana de una región, su recaudo se debería utilizar para:",
                                1, null, resp3, resp3[0]);

                        String r4 = (String) JOptionPane.showInputDialog(null, "Selected option", "¿A qué tipo de productos considera que se le puede aplicar IVA",
                                1, null, resp4, resp4[0]);

                        String r5 = (String) JOptionPane.showInputDialog(null, "Selected option", "¿Qué tan afectado se sentiría en caso de que fuera aprobada la reforma tributaria?",
                                1, null, resp5, resp5[0]);

                        String p6 = (String) JOptionPane.showInputDialog(null, "Selected option", "¿Participaría en alguna manifestación pacífica en contra o a favor de la reforma?",
                                1, null, resp, resp[0]);

                        if (p6.equals("Si")) {
                            r6 = true;
                        } else {
                            r6 = false;
                        }

                        String p7 = (String) JOptionPane.showInputDialog(null, "Selected option", "¿Está de acuerdo con la grabación de impuesto para las pensiones?",
                                1, null, resp, resp[0]);

                        if (p7.equals("Si")) {
                            r7 = true;
                        } else {
                            r7 = false;
                        }

                        String p8 = (String) JOptionPane.showInputDialog(null, "Selected option", "¿En los últimos 6 meses ha comprado huevos a 1800 la docena?",
                                1, null, resp, resp[0]);

                        if (p8.equals("Si")) {
                            r8 = true;
                        } else {
                            r8 = false;
                        }

                        String p9 = (String) JOptionPane.showInputDialog(null, "Selected option", "La reforma tributaria promueve el empleo personas a mujeres cabeza de familia, adultos mayores que no tiene pensión, y otras personas en situaciones de vulnerabilidad",
                                1, null, resp, resp[0]);

                        if (p9.equals("Si")) {
                            r9 = true;
                        } else {
                            r9 = false;
                        }

                        String r10 = (String) JOptionPane.showInputDialog(null, "Selected option", "",
                                1, null, resp10, resp10[0]);
                    
                        Encuesta e = new Encuesta(r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,pers);
                    
                        vec_encu.Adicionar(e);
                    
                        JOptionPane.showMessageDialog(null, "Encuesta registrada con exito");
                        }else{
                            JOptionPane.showMessageDialog(null, "La persona se encuentra DESHABILITADA");
                        }
                    }else
                        JOptionPane.showMessageDialog(null, "No se encontro la persona solicitada");
                    
                break;
                    
                case "Corregir encuesta":

                    JOptionPane.showMessageDialog(null, "Confirmar usuario y contraseña");

                    usuario = (String) JOptionPane.showInputDialog(null, "Confirme nombre del usuario");
                    contrasena = Integer.parseInt(JOptionPane.showInputDialog(null, "Confirme constraseña"));
                    
                    Encuesta e = vec_encu.Buscar(usuario, contrasena);
                   
                    if(e!=null){
                        
                        if(e.getPersona().getEstado()==true){
                   
                            String nombre_usuario = e.getPersona().getUsuario();
                            JOptionPane.showMessageDialog(null, "Registrar encuesta para: " + nombre_usuario);

                            String p1 = (String) JOptionPane.showInputDialog(null, "Selected option", "¿Está de acuerdo con el IVA a los servicios públicos para los estratos 4, 5 y 6?",
                                    1, null, resp, resp[0]);

                            if (p1.equals("Si")) {
                                r1 = true;
                            } else {
                                r1 = false;
                            }

                            String r2 = (String) JOptionPane.showInputDialog(null, "Selected option", "A partir de que rango de salarios, considera que se puede pagar impuesto de renta:",
                                    1, null, resp2, resp2[0]);

                            String r3 = (String) JOptionPane.showInputDialog(null, "Selected option", "Si se instalan peajes en el área metropolitana de una región, su recaudo se debería utilizar para:",
                                    1, null, resp3, resp3[0]);

                            String r4 = (String) JOptionPane.showInputDialog(null, "Selected option", "¿A qué tipo de productos considera que se le puede aplicar IVA",
                                    1, null, resp4, resp4[0]);

                            String r5 = (String) JOptionPane.showInputDialog(null, "Selected option", "¿Qué tan afectado se sentiría en caso de que fuera aprobada la reforma tributaria?",
                                    1, null, resp5, resp5[0]);

                            String p6 = (String) JOptionPane.showInputDialog(null, "Selected option", "¿Participaría en alguna manifestación pacífica en contra o a favor de la reforma?",
                                    1, null, resp, resp[0]);

                            if (p6.equals("Si")) {
                                r6 = true;
                            } else {
                                r6 = false;
                            }

                            String p7 = (String) JOptionPane.showInputDialog(null, "Selected option", "¿Está de acuerdo con la grabación de impuesto para las pensiones?",
                                    1, null, resp, resp[0]);

                            if (p7.equals("Si")) {
                                r7 = true;
                            } else {
                                r7 = false;
                            }

                            String p8 = (String) JOptionPane.showInputDialog(null, "Selected option", "¿En los últimos 6 meses ha comprado huevos a 1800 la docena?",
                                    1, null, resp, resp[0]);

                            if (p8.equals("Si")) {
                                r8 = true;
                            } else {
                                r8 = false;
                            }

                            String p9 = (String) JOptionPane.showInputDialog(null, "Selected option", "La reforma tributaria promueve el empleo personas a mujeres cabeza de familia, adultos mayores que no tiene pensión, y otras personas en situaciones de vulnerabilidad",
                                    1, null, resp, resp[0]);

                            if (p9.equals("Si")) {
                                r9 = true;
                            } else {
                                r9 = false;
                            }

                            String r10 = (String) JOptionPane.showInputDialog(null, "Selected option", "",
                                    1, null, resp10, resp10[0]);

                            e.setPregunta1(r1);
                            e.setPregunta2(r2);
                            e.setPregunta3(r3);
                            e.setPregunta4(r4);
                            e.setPregunta5(r5);
                            e.setPregunta6(r6);
                            e.setPregunta7(r7);
                            e.setPregunta8(r8);
                            e.setPregunta9(r9);
                            e.setPregunta10(r10);

                        } else
                            JOptionPane.showMessageDialog(null, "La persona se encuentra DESHABILITADA");
                    }else
                        JOptionPane.showMessageDialog(null, "Persona no encontrada");
                    
                    break;
                
                case "Eliminar encuesta":
                    
                    JOptionPane.showMessageDialog(null, vec_encu.toString());
                    
                    JOptionPane.showMessageDialog(null, "Confirmar usuario y contraseña");

                    usuario = (String) JOptionPane.showInputDialog(null, "Confirme nombre del usuario");
                    contrasena = Integer.parseInt(JOptionPane.showInputDialog(null, "Confirme constraseña"));
                    
                    vec_encu.Eliminar(usuario, contrasena);
                    
                    JOptionPane.showMessageDialog(null, vec_encu.toString());
                    
                    break;
            
                case "Mostrar resultados de las encuestas":
                    
                    vec_encu.Resultado_encuesta();
                    
                    break;
                
                case "Finalizar encuesta":
                    
                    int habilitados = vec_per.Habilitados();
                    
                    int encu_diligenciadas = vec_encu.Tamaño();
                    
                    vec_per.Desahilitar();
                    
                    JOptionPane.showMessageDialog(null, "Cantidad de personas habilitadas: "+habilitados
                            +"\nCantidad de encuestas diligenciadas: "+encu_diligenciadas
                            +"\nTodas las personas han sido deshabilitadas con exito");
                    
                    break;
                
                case "Estadísticas":
                    
                    //a
                    vec_encu.Encu_por_ciudad();
                    
                    //b
                    vec_encu.Porcentaje_manifestacion(vec_encu);
                    
                    //c
                    vec_encu.Recaudo_peajes_genero();
                    
                    //d
                    
                    vec_encu.Promedio_pronderado_r10();
                    
                    //e
                    
                    vec_encu.Top_productos_IVA();
                    
                    break;
            }
        }while(!opt.equals("Exit"));
    }
    
}
        
        

