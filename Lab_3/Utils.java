package Lab_3;

import Lab_3.Animals.*;

import java.util.ArrayList;

public class Utils {
    public static Queue<? extends Mammalia> produce(Queue<? extends Animals> q) {
        int size = 0;
        for (int i = 0; i < q.getSize(); i++) {
            Object object = q.get(i);
            if (object instanceof Mammalia) {
                ++size;
            }
        }

        Queue<Mammalia> result = new Queue<>(size);
        for (int i = 0; i < q.getSize(); i++) {
            Object object = q.get(i);
            if (object instanceof Mammalia) {
                result.add((Mammalia) object);
            }
        }
        return result;
    }

    public static ArrayList<Queue<? super HomoSapiens>> consume(Queue<? extends Mammalia> q) {
        int size1 = 0;
        int size2 = 0;
        for (int i = 0; i < q.getSize(); ++i) {
            Object obj = q.get(i);
            if (obj instanceof Primates) {
            } else {
                ++size1;
            }
            if (obj instanceof Homo) {
            } else {
                ++size2;
            }
        }
        Queue<Animals> parentsOfPrimates = new Queue<>(size1);
        Queue<Animals> parentsOfHomo = new Queue<>(size2);
        for (int i = 0; i < q.getSize(); ++i) {
            Object obj = q.get(i);
            if (obj instanceof Primates) {
            } else {
                parentsOfPrimates.add((Animals) obj);;
            }
            if (obj instanceof Homo) {
            } else {
                parentsOfHomo.add((Animals) obj);
            }
        }
        ArrayList<Queue<? super HomoSapiens>> result = new ArrayList<>();
        result.add(parentsOfPrimates);
        result.add(parentsOfHomo);
        return result;
    }
}

    
