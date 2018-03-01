package couchdb;

import java.util.HashMap;

public class Room
{


    private Room()
    {
    }

    //HashMap keys
     static final String bedTypeKey = "bedType";
    static final String roomTypeKey = "roomType";
    static final String isSmokingKey = "isSmoking";
    static final String petKey = "hasPet";
    static final String amenitiesKey = "amenities";


    public static enum roomType {
        suite, reg, handi
    }

    public static enum bedType {
        king, queen, twin
    }

    public static enum isSmoking {
        yes, no
    }

    public static enum hasPet {
        yes, no
    }


     static final HashMap<String, Boolean> regAmenities = getRegAmenities();
     static final HashMap<String, Boolean> suiteAmenities = getSuiteAmenities();


    private static final HashMap<String, Boolean> getRegAmenities()
    {

        HashMap<String, Boolean> regRoomAmenities = new HashMap<String, Boolean>();

        //create reg amenities object with boolean values to change if room as amenity available
        regRoomAmenities.put(amenities.fridge.toString(), true);
        regRoomAmenities.put(amenities.microwave.toString(), true);
        regRoomAmenities.put(amenities.couch.toString(), true);
        regRoomAmenities.put(amenities.telephone.toString(), true);
        regRoomAmenities.put(amenities.iron.toString(), true);
        regRoomAmenities.put(amenities.safe.toString(), true);

        return  regRoomAmenities;
    }

    private static HashMap<String, Boolean> getSuiteAmenities()
    {
         HashMap<String, Boolean> suiteRoomAmenities = Room.regAmenities;

        suiteRoomAmenities.put(amenities.cofferMaker.toString(), true);
        suiteRoomAmenities.put(amenities.stereo.toString(), true);
        suiteRoomAmenities.put(amenities.miniBar.toString(), true);

         return  suiteRoomAmenities;
    }

    public static enum amenities {
        fridge, microwave, couch, telephone, iron, safe, cofferMaker, stereo, miniBar

    }


}

