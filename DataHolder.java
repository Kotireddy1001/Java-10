class DataHolder<T, U> {
    T key;
    U value;

    DataHolder(T key, U value) {
        this.key = key;
        this.value = value;
    }

    void show() {
        System.out.println("Key (" + key.getClass().getSimpleName() + "): " + key);
        System.out.println("Value (" + value.getClass().getSimpleName() + "): " + value);
    }

    public static void main(String[] args) {
        DataHolder<Integer, String> dh = new DataHolder<>(101, "Advanced Java");
        dh.show();
    }
}
