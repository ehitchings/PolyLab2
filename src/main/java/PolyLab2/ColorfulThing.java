package PolyLab2;
import java.util.List;
import java.util.ArrayList;

/**
 * Created by evanhitchings on 9/26/16.
 */
public class ColorfulThing implements Thing{


    private Color color;


    public ColorfulThing(Color color) {
        this.color = color;

    }

    public Color getColor(){
        return this.color;
    }

    @Override
    public String toString(){

        return color.toString();
    }

    public List<String> getProperties(){
        List<String> toReturn = new ArrayList<String>();
        toReturn.add(color.name());
        return toReturn;
    }

    public enum Color {PINK, PURPLE, BLACK}




}
