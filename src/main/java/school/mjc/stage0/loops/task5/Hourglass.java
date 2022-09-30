package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        int height1 = height % 2 == 0 ? height / 2 : (height + 1) / 2;
        int height2 = height / 2;

        String eights = "";
        String spaces = "";

        int count = 0;

        for (int i = 0; i < height1; i++) {
            int numOfEights = height - count * 2;
            for (int j = 0; j < numOfEights; j++) {
                eights += "8";
            }
            for (int j = 0; j < i; j++) {
                spaces += " ";
            }
            System.out.println(spaces + eights + spaces);
            eights = "";
            spaces = "";
            count++;
        }

        count -= height % 2 == 0 ? 1 : 2;

        for (int i = 0; i < height2; i++) {
            for (int j = count * 2; j < height; j++) {
                eights += "8";
            }
            for (int j = count - 1; j >= 0; j--) {
                spaces += " ";
            }
            System.out.println(spaces + eights + spaces);
            eights = "";
            spaces = "";
            count--;
        }
    }
}
