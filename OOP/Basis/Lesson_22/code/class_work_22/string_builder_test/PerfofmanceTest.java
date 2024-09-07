package class_work_22.string_builder_test;



public class PerfofmanceTest {
    private static final int N_ITERATION = 100_000;
    private static final String WORD = "meow";

    public static void main(String[] args) {

        // string
        String str = "";
        long t1 = System.currentTimeMillis();  // start times
        for (int i = 0; i < N_ITERATION; i++) {
            str = str + WORD;
        }
        long t2 = System.currentTimeMillis();
        System.out.println("Time for 100_000 meow: " + (t2 - t1));

        // StringBuilder
        StringBuilder sb = new StringBuilder("");
        t1 = System.currentTimeMillis();  // start times
        for (int i = 0; i < N_ITERATION; i++) {
            sb.append(WORD);
        }
        t2 = System.currentTimeMillis();
        System.out.println("Time for 100_000 meow for StringBuilder: " + (t2 - t1));

    } // End of main

} // End of class
