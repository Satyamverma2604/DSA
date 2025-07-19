public class trappingRainWater {

    public static void totalTrapedWater(int barHeight[]) {

        if (barHeight.length < 3) {
            System.out.println("Number of bars is too few to get water trapped");
        } else {
            int leftBoundary[] = new int[barHeight.length];
            int rightBoundary[] = new int[barHeight.length];
            leftBoundary[0] = barHeight[0];
            for (int i = 1; i < barHeight.length; i++) {
                leftBoundary[i] = Math.max(leftBoundary[i - 1], barHeight[i]);
            }
            rightBoundary[(barHeight.length) - 1] = barHeight[(barHeight.length) - 1];
            for (int i = (barHeight.length) - 2; i >= 0; i--) {
                rightBoundary[i] = Math.max(rightBoundary[i + 1], barHeight[i]);
            }

            int totalTrapedWater = 0;
            for (int i = 0; i < barHeight.length; i++) {
                int waterLavel = Math.min(leftBoundary[i], rightBoundary[i]);
                int trapedWater = waterLavel - barHeight[i];
                if (trapedWater < 0)
                    trapedWater = 0;
                totalTrapedWater += trapedWater;
            }
            System.out.println("Total traped water = " + totalTrapedWater);
        }

    }

    public static void main(String args[]) {

        int barHeight[] = { 4, 2, 0, 6, 3, 2, 5 };
        int arr[] = { 1, 2 };
        totalTrapedWater(arr);
        // totalTrapedWater(barHeight);
    }
}
