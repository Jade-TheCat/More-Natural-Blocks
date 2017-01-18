package iearthia.mnb.common.property;

import net.minecraft.util.IStringSerializable;

public enum EnumStoneType implements IStringSerializable {

    BASALT("stone_basalt", 0),
    MARBLE("stone_marble", 1),
    LIMESTONE("stone_limestone", 2),
    SMOOTH_BASALT("smooth_basalt", 3),
    SMOOTH_MARBLE("smooth_marble", 4),
    SMOOTH_LIMESTONE("smooth_limestone", 5),
    BRICKS_BASALT("bricks_basalt", 6),
    BRICKS_MARBLE("bricks_marble", 7),
    BRICKS_LIMESTONE("bricks_limestone", 8);

    private String name;
    private int ID;

    EnumStoneType(String name, int ID){
        this.name = name;
        this.ID = ID;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.getName();
    }

    public int getID(){
        return this.ID;
    }

    public static String[] toStringArray(){
        String[] subNames = new String[values().length];

        for(int i = 0; i < values().length; i++){
            subNames[i] = values()[i].getName();
        }

        return subNames;
    }

}
