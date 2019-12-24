/*Memory leak generation*/
package com.smarsh.perftraining.examples;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MemoryLeakGenerator {
    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        Map sampleMap = new HashMap();
        Thread.sleep(10000);
        // Loop forever...
        while(true) {
            // Create and store a random pair.
            int randomValue = random.nextInt();
            sampleMap.put(randomValue, String.valueOf(randomValue));
            //Thread.sleep(1);
        }
    }
}

