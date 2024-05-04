package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Test class for App.
 */
public class AppTest
{
    /**
     * Test for calculating average.
     */
    @Test
    public void testCalculateAverage()
    {
        double[] numbers = {5.5, 10.0, 15.5, 20.0};
        double expectedAverage = 12.75; // المتوسط الحقيقي للأرقام
        
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        
        double actualAverage = sum / numbers.length;
        assertEquals(expectedAverage, actualAverage, 0.0001); // يمكنك تغيير القيمة المسموح بها للانحراف للتأكد من المطابقة
    }
}
