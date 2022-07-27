package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void dogNameMatchTest() {
        // Given (dog data)
        Date date = new Date(120,11,18);


        // When (a dog is constructed)
        Dog milo = AnimalFactory.createDog("Milo", date);

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals("Milo", milo.getName());
    }

    @Test
    public void dogBirthDateMatchTest() {
        // Given (dog data)
        Date date = new Date(120,11,18);


        // When (a dog is constructed)
        Dog milo = AnimalFactory.createDog("Milo", date);

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(date, milo.getBirthDate());
    }

    @Test
    public void createDogInstanceOfDogTest() {
        // Given (dog data)
        Date date = new Date(120,11,18);


        // When (a dog is constructed)
        Dog milo = AnimalFactory.createDog("Milo", date);

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertTrue(milo instanceof Dog);
    }

    @Test
    public void catNameMatchTest() {
        // Given (cat data)
        Date date = new Date(120,10,11);


        // When (a cat is constructed)
        Cat zula = AnimalFactory.createCat("Zula", date);

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals("Zula", zula.getName());
    }

    @Test
    public void catBirthDateMatchTest() {
        // Given (cat data)
        Date date = new Date(120,10,11);


        // When (a cat is constructed)
        Cat zula = AnimalFactory.createCat("Zula", date);

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(date, zula.getBirthDate());
    }

    @Test
    public void createCatInstanceOfCatTest() {
        // Given (cat data)
        Date date = new Date(120,11,18);


        // When (a dog is constructed)
        Cat zula = AnimalFactory.createCat("Zula", date);

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertTrue(zula instanceof Cat);
    }

}
