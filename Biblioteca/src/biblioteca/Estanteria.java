package biblioteca;

public interface Estanteria {

    int nHojas = 0;
    String nomLibro = "";
    int nLectores=0;
    
    public void materia();

    public default void totalHojas(int libro1, int libro2, int libro3) {

        
        System.out.println("\n El número total de hojas de todos los libros son: " + (libro1 + libro2 + libro3)+" hojas");

    }

    public default void masLeidos(int lib1) {
        if(lib1>=10){
            System.out.println("\n Libro popular"); 
            materia();
        }else{
            System.out.println("\n Libro no tan leído"); 
            materia();
        }
        
       
    }
}
