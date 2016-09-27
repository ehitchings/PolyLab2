package PolyLab2;

import java.util.Arrays;

/**
 * Created by evanhitchings on 9/26/16.
 */
public class ThingContainer {

    private ColorfulThing[] colorfulThings;


    public ThingContainer(int colorfulThingArraySize){
        this.colorfulThings = new ColorfulThing[colorfulThingArraySize];
    }

    public ThingContainer(ColorfulThing[] colorfulThingArray){
        this.colorfulThings = new ColorfulThing[colorfulThingArray.length];
        for(ColorfulThing colorfulThing : colorfulThingArray){
            this.add(colorfulThing);
        }
    }

    public ColorfulThing[] getColorfulThings() {
        return colorfulThings;
    }

    public void add(ColorfulThing colorfulThing){
        for(int i = 0; i < colorfulThings.length; i++){
            if(colorfulThings[i] == null){
                colorfulThings[i] = colorfulThing;
                return;
            }
        }
        System.out.println("ThingContainer is full");

    }

    public void printThings(){
        System.out.println(Arrays.toString(this.getColorfulThings()));
    }

    public ColorfulThing pop(){
        for (int i = colorfulThings.length - 1; i >= 0; i--){
            if (colorfulThings[i] != null){
                ColorfulThing toReturn = colorfulThings[i];
                colorfulThings[i] = null;
                return toReturn;
            }
        }
        System.out.println("Colorful Things array is empty");
        return null;

    }

    public ColorfulThing remove(Enum color){
        for (int i = 0; i < colorfulThings.length; i++ ){
            if (colorfulThings[i].getColor().name().equalsIgnoreCase(color.name())){
                ColorfulThing toRemove = colorfulThings[i];
                if (i < colorfulThings.length - 2){
                    colorfulThings[i] = colorfulThings[i+1];
                    colorfulThings[i + 1] = null;
                }

                return toRemove;
            }
        }
        System.out.println("No colorful things of that color");
        return null;
    }

    public ColorfulThing remove(ColorfulThing colorfulThingToRemove){
        for(int i = 0; i < colorfulThings.length; i++){
            if (colorfulThings[i].equals(colorfulThingToRemove)){
                if (i < colorfulThings.length - 2){
                    colorfulThings[i] = colorfulThings[i +1];
                    colorfulThings[i+1] = null;
                }

                return colorfulThingToRemove;
            }
        }
        System.out.println("The Colorful Thing was not in the array");
        return null;
    }



}
