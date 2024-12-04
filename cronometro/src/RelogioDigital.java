import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;
public class RelogioDigital {


    //função para atualiza a hora
   protected static String takeHour(){
        return new SimpleDateFormat("HH:mm:ss").format(new Date());
    }

    }



