package ba.franz.mvcdemo.model;


/**
 * Created by Franz on 25.03.2018.
 */


//Businesslogic

public class People {

    //Vars
    private String  name;
    private Integer age;


    //Setter
    public void setName(String input){
        this.name = input;
    }

    public void setAge(Integer input){
        this.age = input;
    }


    //Getter
    public String getName(){
        return name;
    }

    public Integer getAge(){
        return age;
    }

}
