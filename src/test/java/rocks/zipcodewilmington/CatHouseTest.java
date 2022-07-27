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
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void testGetNumberOfCats() {
        // Given (some
        String name = "Zula";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();

        // When
        CatHouse.add(animal);
        CatHouse.add(animal);
        CatHouse.add(animal);
        CatHouse.add(animal);

        // Then
        Assert.assertEquals(4, (int) CatHouse.getNumberOfCats());
    }

    @Test
    public void testAddCats() {
        // Given (some
        String name = "Zula";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();

        // When
        CatHouse.add(animal);

        // Then
        Assert.assertEquals(1, (int)CatHouse.getNumberOfCats());
    }

    @Test
    public void testRemoveByCat() {
        // Given (some
        String name = "Zula";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();

        // When
        CatHouse.add(animal);
        CatHouse.remove(animal);

        // Then
        Assert.assertNull(CatHouse.getCatById(0));
    }

    @Test
    public void testRemoveById() {
        // Given (some
        String name = "Zula";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();

        // When
        CatHouse.add(animal);
        CatHouse.remove(0);

        // Then
        Assert.assertNull(CatHouse.getCatById(0));
    }

    @Test
    public void testGetById() {
        // Given (some
        String name = "Zula";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();

        // When
        CatHouse.add(animal);
        Cat actual = CatHouse.getCatById(0);

        // Then
        Assert.assertEquals(animal, actual);
    }
}
