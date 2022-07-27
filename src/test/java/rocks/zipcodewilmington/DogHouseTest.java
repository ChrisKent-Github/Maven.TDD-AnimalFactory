package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        CatHouse.clear();

        // When
        DogHouse.add(animal);
        DogHouse.add(animal);
        DogHouse.add(animal);
        DogHouse.add(animal);

        // Then
        Assert.assertEquals(4, (int) DogHouse.getNumberOfDogs());
    }

    @Test
    public void testAddDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        Assert.assertEquals(1, (int)DogHouse.getNumberOfDogs());
    }

    @Test
    public void testRemoveByDog() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);
        DogHouse.remove(animal);

        // Then
        Assert.assertNull(DogHouse.getDogById(0));
    }

    @Test
    public void testRemoveById() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);
        DogHouse.remove(0);

        // Then
        Assert.assertNull(DogHouse.getDogById(0));
    }

    @Test
    public void testGetById() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);
        Dog actual = DogHouse.getDogById(0);

        // Then
        Assert.assertEquals(animal, actual);
    }
}
