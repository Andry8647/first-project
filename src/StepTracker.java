import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
public class StepTracker {
    HashMap<Integer, MonthData> monthToData = new HashMap<Integer, MonthData>();

    public StepTracker() {
        for (int i = 0; i < 12; i++) {
            monthToData.put(i, new MonthData());
        }
    }

    class MonthData {

        HashMap<String, Integer> stepOfDay = new HashMap<String, Integer>();
       for (int i = 1; i < 31; i++){
            stepOfDay.put(i,)
        } // Заполните класс самостоятельно
    }

}
