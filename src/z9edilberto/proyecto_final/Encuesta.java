
public class Encuesta {
    
    private boolean pregunta1;
    private String pregunta2;
    private String pregunta3;
    private String pregunta4;
    private String pregunta5;
    private boolean pregunta6;
    private boolean pregunta7;
    private boolean pregunta8;
    private boolean pregunta9;
    private String pregunta10;
    private Persona persona;
    
    public Encuesta(){
    }

    public Encuesta(boolean p1, String p2, String p3, String p4, String p5, boolean p6, boolean p7, boolean p8, boolean p9, String p10, Persona pers) {
        pregunta1 = p1;
        pregunta2 = p2;
        pregunta3 = p3;
        pregunta4 = p4;
        pregunta5 = p5;
        pregunta6 = p6;
        pregunta7 = p7;
        pregunta8 = p8;
        pregunta9 = p9;
        pregunta10 = p10;
        persona=pers;
    }

    public boolean isPregunta1() {
        return pregunta1;
    }

    public String getPregunta2() {
        return pregunta2;
    }

    public String getPregunta3() {
        return pregunta3;
    }

    public String getPregunta4() {
        return pregunta4;
    }

    public String getPregunta5() {
        return pregunta5;
    }

    public boolean isPregunta6() {
        return pregunta6;
    }

    public boolean isPregunta7() {
        return pregunta7;
    }

    public boolean isPregunta8() {
        return pregunta8;
    }

    public boolean isPregunta9() {
        return pregunta9;
    }

    public String getPregunta10() {
        return pregunta10;
    }
    public Persona getPersona(){
        return persona;
    }

    public void setPregunta1(boolean pregunta1) {
        this.pregunta1 = pregunta1;
    }

    public void setPregunta2(String pregunta2) {
        this.pregunta2 = pregunta2;
    }

    public void setPregunta3(String pregunta3) {
        this.pregunta3 = pregunta3;
    }

    public void setPregunta4(String pregunta4) {
        this.pregunta4 = pregunta4;
    }

    public void setPregunta5(String pregunta5) {
        this.pregunta5 = pregunta5;
    }

    public void setPregunta6(boolean pregunta6) {
        this.pregunta6 = pregunta6;
    }

    public void setPregunta7(boolean pregunta7) {
        this.pregunta7 = pregunta7;
    }

    public void setPregunta8(boolean pregunta8) {
        this.pregunta8 = pregunta8;
    }

    public void setPregunta9(boolean pregunta9) {
        this.pregunta9 = pregunta9;
    }

    public void setPregunta10(String pregunta10) {
        this.pregunta10 = pregunta10;
    }
    
    public void setPersona(Persona pers){
        this.persona=pers;
    }
    
    @Override
    public String toString() {
        return "Encuesta\n" + "Pregunta 1= " + pregunta1 + ", pregunta 2= " + pregunta2 
                + ", pregunta 3= " + pregunta3 + ", pregunta 4= " + pregunta4 
                + ", pregunta 5= " + pregunta5 + ", pregunta 6= " + pregunta6 
                + ", pregunta 7= " + pregunta7 + ", pregunta 8= " + pregunta8 
                + ", pregunta 9= " + pregunta9 + ", pregunta 10= " + pregunta10
                + ", persona que realizo la encuesta= " + persona ;
    }

    
}


