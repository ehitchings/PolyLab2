package PolyLab2;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by evanhitchings on 9/26/16.
 */
public class ColorfulThingTest {
    @Test
    public void getColorTest(){
        ColorfulThing colorfulThing = new ColorfulThing(ColorfulThing.Color.PINK);
        ColorfulThing.Color expectedColor = ColorfulThing.Color.PINK;
        ColorfulThing.Color actualColor = colorfulThing.getColor();

        assertEquals("These colors should be the same", expectedColor, actualColor);


    }

    @Test
    public void getPropertiesTest(){
        ColorfulThing colorfulThing = new ColorfulThing(ColorfulThing.Color.PINK);
        List<String> colorProperties = new ArrayList<String>();
        colorProperties.add(ColorfulThing.Color.PINK.name());
        assertEquals("The colors at index 0 did not match", colorProperties.get(0), colorfulThing.getProperties().get(0));

    }



}
