package PERTEMUAN6;

import java.util.ArrayList;
import java.util.List;

public class LaundryCRUD {
    private List<Laundry> laundryList;

    public LaundryCRUD() {
        this.laundryList = new ArrayList<>();
    }

    public void addLaundry(Laundry laundry) {
        laundryList.add(laundry);
    }

    public Laundry getLaundryByIndex(int index) {
        return laundryList.get(index);
    }

    public void updateLaundry(int index, Laundry updatedLaundry) {
        laundryList.set(index, updatedLaundry);
    }

    public void deleteLaundry(int index) {
        laundryList.remove(index);
    }

    public int getLaundryListSize() {
        return laundryList.size();
    }
}

