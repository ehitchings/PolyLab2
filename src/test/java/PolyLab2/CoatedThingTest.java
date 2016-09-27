package PolyLab2;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by evanhitchings on 9/27/16.
 */
public class CoatedThingTest {

    @Test
    public void getPropertiesTest(){
        CoatedThing ct = new CoatedThing(ColorfulThing.Color.PINK, CoatedThing.Texture.METALLIC);
        List<String> colorProperties = new ArrayList<String>();
        colorProperties.add(ColorfulThing.Color.PINK.name());
        colorProperties.add(CoatedThing.Texture.METALLIC.name());
        assertEquals("The color at index 0 did not match", colorProperties.get(0), ct.getProperties().get(0));
        assertEquals("The texture at index 1 did not match", colorProperties.get(1), ct.getProperties().get(1));

    }








}
