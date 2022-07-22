package semana_8.pg_composite_department;

public class DepartFinanciero implements Departamento {

    private Integer id;
    private String name;


    public DepartFinanciero(Integer id, String name) {
        this.id = id;
        this.name = name;
    }



    public void getName(){
        System.out.println(getClass().getSimpleName());
    }
}
