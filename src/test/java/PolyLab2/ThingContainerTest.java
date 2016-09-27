package PolyLab2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by evanhitchings on 9/26/16.
 */
public class ThingContainerTest {
    @Test
    public void addTest(){
        ThingContainer thingContainer = new ThingContainer(2);
        ColorfulThing colorfulThing0 = new ColorfulThing(ColorfulThing.Color.BLACK);
        ColorfulThing colorfulThing1 = new ColorfulThing(ColorfulThing.Color.PINK);
        thingContainer.add(colorfulThing0);

        assertEquals("First Element was not ColorfulThing0", colorfulThing0, thingContainer.getThings()[0]);
        assertEquals("Second Element was not Null", null, thingContainer.getThings()[1]);
        thingContainer.add(colorfulThing1);
        assertEquals("First Element was not ColorfulThing1 after adding Colorful", colorfulThing0, thingContainer.getThings()[0]);
        assertEquals("Second Element was not ColorfulThing2", colorfulThing1, thingContainer.getThings()[1]);




    }

    @Test
    public void popTest(){
        ThingContainer thingContainer = new ThingContainer(2);
        assertEquals("Did not return null as expected from index 0 with empty array", null, thingContainer.getThings()[0]);
        ColorfulThing colorfulThing0 = new ColorfulThing(ColorfulThing.Color.BLACK);
        thingContainer.add(colorfulThing0);
        assertEquals("Did not return Colorful Thing at index 0 with empty index 1", colorfulThing0, thingContainer.pop());
        assertEquals("Did not actually pop the element specified", null, thingContainer.getThings()[0]);
        ColorfulThing colorfulThing1 = new ColorfulThing(ColorfulThing.Color.PINK);
        thingContainer.add(colorfulThing0);
        thingContainer.add(colorfulThing1);
        assertEquals("Did not return Colorful Thing 1 from index 1", colorfulThing1, thingContainer.pop());




    }

    @Test
    public void removeTestByColor(){
        ThingContainer thingContainer = new ThingContainer(3);
        ColorfulThing colorfulThing0 = new ColorfulThing(ColorfulThing.Color.BLACK);
        ColorfulThing colorfulThing1 = new ColorfulThing(ColorfulThing.Color.PINK);
        ColorfulThing colorfulThing2 = new ColorfulThing(ColorfulThing.Color.PINK);
        thingContainer.add(colorfulThing0);
        thingContainer.add(colorfulThing1);
        thingContainer.add(colorfulThing2);
        assertEquals("Did not return null when color was not found", null, thingContainer.remove(ColorfulThing.Color.PURPLE));
        thingContainer.remove(ColorfulThing.Color.PINK);
        assertEquals("Colorful Thing at index 1 was not removed", null, thingContainer.getThings()[1]);
        assertEquals("Colorful Thing at index 2 was removed instead of Colorful Thing at index 1", colorfulThing2, thingContainer.getThings()[2]);
        thingContainer.getThings()[1] = colorfulThing1;
        assertEquals("Colorful Thing was not actually removed", colorfulThing1, thingContainer.remove(colorfulThing1));
        thingContainer.getThings()[1] = colorfulThing1;
        thingContainer.remove(colorfulThing1);
        assertEquals("Wrong Colorful Thing was removed", colorfulThing2, thingContainer.getThings()[2]);




    }

    @Test
    public void removeCoatedThingTest(){
        ThingContainer thingContainer = new ThingContainer(3);
        CoatedThing ct1 = new CoatedThing(ColorfulThing.Color.PINK, CoatedThing.Texture.METALLIC);
        CoatedThing ct2 = new CoatedThing(ColorfulThing.Color.BLACK, CoatedThing.Texture.GLOSSY);
        CoatedThing ct3 = new CoatedThing(ColorfulThing.Color.PURPLE, CoatedThing.Texture.MATTE);
        thingContainer.add(ct1);
        thingContainer.add(ct2);
        thingContainer.add(ct3);
        assertEquals("Did not return null when texture was not found", null, thingContainer.remove(CoatedThing.Texture.SPECKLED));
        thingContainer.remove(CoatedThing.Texture.MATTE);
        assertEquals("Coated Thing at index 2 was not removed", null, thingContainer.getThings()[2]);
        assertEquals("Coated Thing returned did not equal argument", ct1, thingContainer.remove(ct1));
        System.out.println(thingContainer.getThings());
        assertEquals("Did not actually remove Coated Thing", ct2, thingContainer.getThings()[0]);

    }




}



