package ba.franz.mvcdemo;

import org.junit.Test;

import ba.franz.mvcdemo.model.People;

import static org.junit.Assert.assertEquals;

/**
 * Created by Franz on 25.03.2018.
 */


//Example Unit test to check if input == output
public class PeopleUnitTest {


    @Test
    public void inputNameIsWorking() throws Exception {

        People p = new People();

        p.setName("Test");

        assertEquals(p.getName(),"Test");

    }

    @Test
    public void inputAgeIsWorking() throws Exception {

        People p = new People();

        p.setAge(2);

        assertEquals(p.getAge(), Integer.valueOf(2));

    }



}
