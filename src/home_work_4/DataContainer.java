package home_work_4;

import java.util.Arrays;
import java.util.Comparator;

public class DataContainer<T> {
    private T[] data;
    public DataContainer(T[] data) {
        this.data = data;
    }
    public int add(T item) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                data[i] = item;
                return i;
            }
        }
        this.data = Arrays.copyOf(data, data.length + 1);
        data[data.length - 1] = item;
        return data.length - 1;
    }
    public T get(int index) {
        try {
            return data[index];
        } catch(ArrayIndexOutOfBoundsException e) {
            return null;
        }
    }
    public T[] getItems() {
        return data;
    }
    public boolean delete(int index) {
        try {
            T[] one = Arrays.copyOfRange(data, 0, index);
            T[] two = Arrays.copyOfRange(data, index + 1, data.length);
            this.data = Arrays.copyOf(data, data.length - 1);
            for (int i = 0; i < index; i++) {
                data[i] = one[i];
            }
            int k = 0;
            for (int i = index; i < data.length; i++) {
                data[i] = two[k];
                k++;
            }
            return true;
        } catch(Exception e) {
            return false;
        }
    }
    public boolean delete(T item) {
        int index = 0;
        for (T datum : data) {
            if (datum.equals(item)) {
                T[] one = Arrays.copyOfRange(data, 0, index);
                T[] two = Arrays.copyOfRange(data, index + 1, data.length);
                this.data = Arrays.copyOf(data, data.length - 1);
                for (int i = 0; i < index; i++) {
                    data[i] = one[i];
                }
                int k = 0;
                for (int i = index; i < data.length; i++) {
                    data[i] = two[k];
                    k++;
                }
                return true;
            }
            index++;
        }
        return false;
    }
    public void sort(Comparator<T> comparator) {
        for(int k = 0; k < data.length - 1; k++){
            for(int n = 0; n < data.length - 1; n++){
                if(comparator.compare(data[n], data[n + 1]) > 0){
                    T o = data[n];
                    data[n] = data[n + 1];
                    data[n + 1] = o;
                }
            }
        }
    }
    @Override
    public String toString() {
        int iMax = data.length - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; ; i++) {
            if(data[i] != null) {
                b.append(String.valueOf(data[i]));
            }
            if (i == iMax)
                return b.append(']').toString();
            if(data[i] != null) b.append(", ");
        }
    }
    public void sort(DataContainer<T> container, Comparator<T> comparator) {
        for(int k = 0; k < container.getItems().length - 1; k++){
            for(int n = 0; n < container.getItems().length - 1; n++){
                if(comparator.compare(container.getItems()[n], container.getItems()[n + 1]) > 0){
                    T o = container.getItems()[n];
                    container.getItems()[n] = container.getItems()[n + 1];
                    container.getItems()[n + 1] = o;
                }
            }
        }
    }
}
