public class CircularTour {

    static int findStart(int[] petrol, int[] distance) {
        int total = 0, balance = 0, start = 0;

        for (int i = 0; i < petrol.length; i++) {
            total += petrol[i] - distance[i];
            balance += petrol[i] - distance[i];

            if (balance < 0) {
                start = i + 1;
                balance = 0;
            }
        }
        return total >= 0 ? start : -1;
    }

    public static void main(String[] args) {
        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};

        int start = findStart(petrol, distance);
        System.out.println("Start Index: " + start);
    }
}
