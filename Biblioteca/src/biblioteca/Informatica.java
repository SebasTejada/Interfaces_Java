
package biblioteca;


public class Informatica implements Estanteria {
    int nHojas = 0;
    String nomLibro = "";
    int nLectores=0;

    public Informatica(int nHojas, String nomLibro, int nLectores) {
        this.nHojas=nHojas;
        this.nomLibro=nomLibro;
        this.nLectores=nLectores;

    }

        
    @Override
    public void materia() {
        System.out.println(nomLibro);
    }
    
}
