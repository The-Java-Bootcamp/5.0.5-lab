package academy.javapro.lab;

import java.util.Date;

public class StringBuilderBufferLab {
    public static void main(String[] args) {
        // TODO: Implement the assignment tasks here

        // Performance comparison
        String str = "";
        StringBuilder sb = new StringBuilder();
        long start, end;

        // String concatenation
        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            str += "a";
        }
        end = System.currentTimeMillis();
        long stringTime = end - start;

        // StringBuilder
        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            sb.append("a");
        }
        end = System.currentTimeMillis();
        long sbTime = end - start;

        // TODO: Print performance comparison results
    }
}
