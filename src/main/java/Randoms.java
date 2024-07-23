import java.util.Iterator;
import java.util.Random;


public class Randoms implements Iterable {
    private final int min;
    private final int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator iterator() {
        return new RandomIterator();
    }

    private class RandomIterator implements Iterator {
        private final Random random = new Random();

        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Integer next() {
            return random.nextInt(max - min + 1) + min;
        }
    }
}