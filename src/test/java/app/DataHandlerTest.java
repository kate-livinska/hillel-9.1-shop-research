package app;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DataHandlerTest {

    private DataHandler dataHandler;
    @BeforeMethod
    private void setUp() {
        dataHandler = new DataHandler();
    }

    @Test
    void handleDataTestString() {

        String[] testInputString = new String[]{"apple", "grape", "mango", "apple", "orange"};


        String expectedOutputFromString = "(1) apple (2) grape (3) mango (4) apple (5) orange ";

        String actualOutputFromString = dataHandler.handleData(testInputString);

        Assertions.assertEquals(expectedOutputFromString, actualOutputFromString);
    }

    @Test
    void handleDataTestDouble() {

        Double[] testInputDouble = new Double[]{1520.89, 2058.35, 1807.29, 899.99, 1924.25};

        String expectedOutputFromDouble = "(1) 1520.89 (2) 2058.35 (3) 1807.29 (4) 899.99 (5) 1924.25 ";

        String actualOutputFromDouble = dataHandler.handleData(testInputDouble);

        Assertions.assertEquals(expectedOutputFromDouble, actualOutputFromDouble);
    }
}