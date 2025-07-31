package batalha_naval_aprimorada;

import java.util.*;

public class DotCom {

    String name;

    private ArrayList<String> locationCells;

    public void setLocationCells(ArrayList<String> loc){
        locationCells = loc;
    }



    public String checkYourself(String userInput){
        String result = "errado";

        int index = locationCells.indexOf(userInput);

        if(index >= 0){
            locationCells.remove(index);
        if(locationCells.isEmpty()){
            result = "eliminar";

            System.out.printf("Ora tua afundaste o %s",name);
        }else {
            result = "correto";
        }
        }
        return result;

    }
    public void setName(String name) {
        this.name = name;
    }
}
