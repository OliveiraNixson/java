package batalha_naval_atual;

import java.util.*;

public class SimpleDotCom {

    private String name;
    private ArrayList<String> locationCells;
    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }

    public String checkYourself(String userInput){
        String result = "miss";

        int index = locationCells.indexOf(userInput);

        if(index >= 0){
            locationCells.remove(index);
        }else {
            result = "hit";
        }

        return result;
    }
}
