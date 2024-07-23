public static void main(String[] args) {
    for (Object r : new Randoms(90, 100)) {
        System.out.println("Случайное число: " + r);
        if (r.equals(100)) {
            System.out.println("Выпало число 100, давайте на этом закончим");
            break;
        }
    }
}