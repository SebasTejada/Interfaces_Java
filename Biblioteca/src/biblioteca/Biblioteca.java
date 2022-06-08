
package biblioteca;


public class Biblioteca {

    public static void main(String[] args) {
        Fisica f= new Fisica(200, "Libro de física", 9);
        
        
        Historia h= new Historia(50,"Libro de Historia",15);
        h.lecturaDeLibro(5);
        Historia h1= new Historia();
        h1.lecturaDeLibro(1, 50);
      
        
        Informatica i= new Informatica(800,"Libro de Informatica",8);
        
        f.masLeidos(f.nLectores);
        i.masLeidos(i.nLectores);
        h.masLeidos(h.nLectores);
        f.totalHojas(f.nHojas, i.nHojas, h.nHojas);
    }
    
}
