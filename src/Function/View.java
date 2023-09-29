package Function;


import Information.Students;

import java.util.ArrayList;

public class View {
    public void View_information(ArrayList<Students> newList) {
        for (int i = 0; i < newList.size(); i++) {
            Students s = newList.get(i);
            s.information_printf();
        }
    }

}
