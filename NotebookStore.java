public class NotebookStore {
    public static void main(String[] args) {
        java.util.Set<Notebook> notebooks = new java.util.HashSet<>();
        notebooks.add(new Notebook("Lenovo", 8, 256, "Windows", "White"));
        notebooks.add(new Notebook("HP", 8, 512, "Windows", "Silver"));

        filterAndPrint(notebooks);
    }

    private static void filterAndPrint(java.util.Set<Notebook> notebooks) {
        notebooks.forEach(System.out::println);
    }
}