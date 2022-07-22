package semana_8.reapso_final;

import java.util.ArrayList;

public class Instituto {

    private ArrayList<OfertaAcademica> cursosYProgramas;

    /*No vamos a hacer el constructor*/


    public void agregarOfertas(OfertaAcademica oa){
        if (this.cursosYProgramas == null){
            this.cursosYProgramas = new ArrayList<>();
        }
        this.cursosYProgramas.add(oa);
    }

    public void generarInforme(){
        for (OfertaAcademica oa : this.cursosYProgramas){
            System.out.println("Nombre " + oa.getNombre());
        }
    }

}
