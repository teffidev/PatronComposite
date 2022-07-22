package semana_8.pg_composite_department;

import java.util.ArrayList;
import java.util.List;

public class DepartComposite implements Departamento {

    private Integer id;
    private String name;
    private List<Departamento> childDepartments;


    public DepartComposite(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.childDepartments = new ArrayList<>();
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getName(){
        childDepartments.forEach(Departamento::getName);
    }

    public void addDepart(Departamento department){
        childDepartments.add(department);
    }

    public void removeDepart(Departamento department){
        childDepartments.remove(department);
    }

}
