package PolyLab2;
import java.util.List;
import java.util.ArrayList;

/**
 * Created by evanhitchings on 9/27/16.
 */
public class CoatedThing extends ColorfulThing  {
    private Texture texture;

    public CoatedThing(Color color, Texture texture){
        super(color);
        this.texture = texture;
    }

    public CoatedThing.Texture getTexture() {
        return texture;
    }

    public void setTexture(CoatedThing.Texture texture) {
        this.texture = texture;
    }

    @Override
    public List<String> getProperties(){
        List<String> toReturn = super.getProperties();
        toReturn.add(this.texture.name());
        return toReturn;

    }

    @Override
    public String toString(){
        return this.getColor().name() + "\t" + this.getTexture().toString();
    }







    public enum Texture{GLOSSY, MATTE, SPECKLED, METALLIC}

}
