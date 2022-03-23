import java.util.ArrayList;
import java.util.HashMap;

public class StepTracker {
    int goalOfStep = 10000;
    HashMap<Integer, MonthData> monthToData = new HashMap<Integer, MonthData>();
    HashMap<String, Integer> monthAndValues = new HashMap<>();

    public StepTracker() {
        for (int i = 0; i < 12; i++) {
            monthToData.put(i, new MonthData());
        }
        monthAndValues.put("Январь", 0);
        monthAndValues.put("Февраль", 1);
        monthAndValues.put("Март", 2);
        monthAndValues.put("Апрель", 3);
        monthAndValues.put("Май", 4);
        monthAndValues.put("Июнь", 5);
        monthAndValues.put("Июль", 6);
        monthAndValues.put("Август", 7);
        monthAndValues.put("Сентябрь", 8);
        monthAndValues.put("Октябрь", 9);
        monthAndValues.put("Ноябрь", 10);
        monthAndValues.put("Декабрь", 11);

    }

    class MonthData {
        HashMap<Integer, Integer> monthData = new HashMap<Integer, Integer>();

        public MonthData() {

            for (int i = 1; i < 31; i++) {
                monthData.put(i, 0);
            }
        }
    }

    public void saveStepNumber(String month, int day, int numberOfStep) {
        if (!monthAndValues.containsKey(month)) {
            System.out.println("Такого месяца нет!");
            return;
        }
        Integer numberMonth = monthAndValues.get(month);
        MonthData DayAndStep = monthToData.get(numberMonth);
        if (!DayAndStep.monthData.containsKey(day)) {
            System.out.println("Такого дня нет!");
            return;
        }
        if (numberOfStep < 0) {
            System.out.println("Шаги не могут быть отрицательными!");
            return;
        }
        DayAndStep.monthData.put(day, numberOfStep);
    }

    public void statistics(String month) {
        if (!monthAndValues.containsKey(month)) {
            System.out.println("Такого месяца нет!");
            return;
        }
        Integer numberMonth = monthAndValues.get(month);
        MonthData DayAndStep = monthToData.get(numberMonth);
        ArrayList<String> day = new ArrayList<>();

        for (Integer key : DayAndStep.monthData.keySet()) {
            Integer values = DayAndStep.monthData.get(key);
            day.add(key + " день: " + values);


        }

        System.out.println(String.join(", ", day));
        
    }

    public void goalStep() {

    }

}
