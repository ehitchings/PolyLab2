package PolyLab2;

import java.util.Arrays;

/**
 * Created by evanhitchings on 9/26/16.
 */
public class ThingContainer {

    private Thing[] things;


    public ThingContainer(int thingArraySize){
        this.things = new Thing[thingArraySize];
    }

    public ThingContainer(Thing[] thingArray){
        this.things = new Thing[thingArray.length];
        for(Thing thing : thingArray){
            this.add(thing);
        }
    }

    public Thing[] getThings() {
        return things;
    }

    public void add(Thing thing){
        for(int i = 0; i < things.length; i++){
            if(things[i] == null){
                things[i] = thing;
                return;
            }
        }
        System.out.println("ThingContainer is full");

    }

    public void printThings(){
        System.out.println(Arrays.toString(this.getThings()));
    }

    public ColorfulThing pop(){
        for (int i = things.length - 1; i >= 0; i--){
            if (things[i] != null){
                ColorfulThing toReturn = (ColorfulThing)things[i];
                things[i] = null;
                return toReturn;
            }
        }
        System.out.println("Colorful Things array is empty");
        return null;

    }

    public ColorfulThing remove(ColorfulThing.Color color){
        for (int i = 0; i < things.length; i++ ){
            if (things[i].getProperties().get(0).equalsIgnoreCase(color.name())){
                ColorfulThing toRemove = (ColorfulThing)things[i];
                if (i < things.length - 2){
                    things[i] = things[i+1];
                    things[i + 1] = null;
                } else {
                    things[i] = null;
                }

                return toRemove;
            }
        }
        System.out.println("No colorful things of that color");
        return null;
    }

    public ColorfulThing remove(ColorfulThing colorfulThingToRemove){
        for(int i = 0; i < things.length; i++){
            if (things[i].equals(colorfulThingToRemove)){
                if (i < things.length - 2){
                    things[i] = things[i +1];
                    things[i+1] = null;
                } else {
                    things[i] = null;
                }

                return colorfulThingToRemove;
            }
        }
        System.out.println("The Colorful Thing was not in the array");
        return null;
    }

    public CoatedThing remove(CoatedThing.Texture texture){
        for(int i = 0; i < things.length; i++){
            if(things[i].getProperties().get(1).equalsIgnoreCase(texture.name())){
                CoatedThing toReturn = (CoatedThing)things[i];
                if (i < things.length - 2){
                    things[i] = things[i+1];
                    things[i+1] = null;
                } else {
                    things[i] = null;
                }
                return toReturn;
            }

        }
        System.out.println("No Coated Things of that texture");
        return null;
    }

    public CoatedThing remove(CoatedThing coatedThingToRemove){
        for(int i = 0; i < things.length; i++ ){
            if(things[i].equals(coatedThingToRemove)){
                if (i < things.length - 2){
                    things[i] = things[i +1];
                    things[i+1] = null;
                } else {
                    things[i] = null;
                }
                return coatedThingToRemove;
            }
        }
        System.out.println("The Coated Thing was not in the array");
        return null;
    }





}
