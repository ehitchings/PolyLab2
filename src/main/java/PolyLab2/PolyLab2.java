package PolyLab2;

/**
 * Created by evanhitchings on 9/26/16.
 */
public class PolyLab2 {

    public static void main(String[] args) {
        ColorfulThing colorfulThing0 = new ColorfulThing(ColorfulThing.Color.PINK);
        ColorfulThing colorfulThing1 = new ColorfulThing(ColorfulThing.Color.PURPLE);
        CoatedThing coatedThing2 = new CoatedThing(ColorfulThing.Color.BLACK, CoatedThing.Texture.GLOSSY);

        ThingContainer thingContainer0 = new ThingContainer(3);
        thingContainer0.add(colorfulThing0);
        thingContainer0.add(colorfulThing1);
        thingContainer0.add(coatedThing2);
        thingContainer0.printThings();

//
//
//        thingContainer0.add(colorfulThing0);
//
//        thingContainer0.pop();
//        thingContainer0.printThings();
//        thingContainer0.add(colorfulThing2);
//        thingContainer0.printThings();
//        thingContainer0.remove(ColorfulThing.Color.PURPLE);
//        thingContainer0.printThings();
//        thingContainer0.remove(colorfulThing0);
//        thingContainer0.printThings();
//
//        thingContainer0.getThings()[0] = colorfulThing0;
//        thingContainer0.getThings()[1] = colorfulThing1;
//
//        ThingContainer thingContainer1 = new ThingContainer(thingContainer0.getThings());
//        thingContainer1.printThings();








    }
}