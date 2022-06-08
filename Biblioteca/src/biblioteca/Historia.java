
package biblioteca;


public class Historia implements Estanteria {
    
    int nHojas = 0;
    String nomLibro = "";
    int nLectores=0;

    public Historia(int nHojas, String nomLibro, int nLectores) {
        this.nHojas=nHojas;
        this.nomLibro=nomLibro;
        this.nLectores=nLectores;

    }

    public Historia(int nHojas){
        this.nHojas=nHojas;
    }

    public Historia(String nomLibro, int nLectores) {
        this.nomLibro=nomLibro;
        this.nLectores=nLectores;

    }
    public Historia(){
        
    }
       
    public void lecturaDeLibro(){
        for(int i=0; i<nHojas;i++){
            System.out.println("Hoja"+i);
        }};
    
    public void lecturaDeLibro(int grupo){
        int aux=0;
        for(int i=0; i<nHojas;i++){
            aux=aux+grupo;
            if(aux==nHojas){
                System.out.println("Termino de leer");
                break;
            }else{
                System.out.println("Grupo de hojas leídas "+aux);
            }
                    
             
        }};
    
     public void lecturaDeLibro(int inicio, int ifinal){
     
     System.out.println("El libro de historia se está leyendo desde la página " + inicio + " hasta la "+ifinal);
     
     }
    
    @Override
    public void materia() {
        System.out.println(nomLibro);
    }
    
}
