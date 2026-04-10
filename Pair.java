public class Pair<K, V> {

    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Pair{key=" + key + ", value=" + value + "}";
    }

    public static void main(String[] args) {
        Pair<String, Integer> p1 = new Pair<>("Lala", 95);
        System.out.println(p1);
        System.out.println("Key: " + p1.getKey());
        System.out.println("Value: " + p1.getValue());

        Pair<Integer, Double> p2 = new Pair<>(1, 3.14);
        System.out.println(p2);
    }
}
