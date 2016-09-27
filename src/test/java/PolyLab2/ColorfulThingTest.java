package PolyLab2;

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



}
