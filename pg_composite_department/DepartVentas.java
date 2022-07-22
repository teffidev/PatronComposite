package semana_8.pg_composite_department;

public class DepartVentas implements Departamento{

    private Integer id;
    private String name;



    public DepartVentas(Integer id, String name) {
        this.id = id;
        this.name = name;
    }



    public void getName() {
        System.out.println(getClass().getSimpleName());

    }
}
