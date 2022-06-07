public class lab_mass_cycle {
    public static void main(String[] args ) {
        int[] massiv = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        int mult = 1;
        for (int i = 0; i < 9; i++) {
            mult *= massiv[i];
        }
        System.out.println("Произведение элементов массива: " + mult);
    }
}
