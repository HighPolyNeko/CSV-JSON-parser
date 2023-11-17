import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    public void testJsonToList() {
        String json = "[{\"id\":1,\"firstName\":\"John\",\"lastName\":\"Doe\",\"country\":\"USA\",\"age\":30}]";
        List<Employee> expected = List.of(new Employee(1, "John", "Doe", "USA", 30));
        List<Employee> result = Main.jsonToList(json);
        Assertions.assertEquals(expected.toString(), result.toString());
    }

    @Test
    public void testReadString() throws IOException {
        File tempFile = File.createTempFile("test", ".txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile));
        bw.write("Test string");
        bw.close();

        String result = Main.readString(tempFile.getAbsolutePath());
        Assertions.assertEquals("Test string", result);
    }

    @Test
    public void testWriteString() throws IOException {
        String testString = "Test write";
        File tempFile = File.createTempFile("testWrite", ".txt");

        Main.writeString(testString, tempFile.getAbsolutePath());

        BufferedReader br = new BufferedReader(new FileReader(tempFile));
        String result = br.readLine();
        br.close();

        Assertions.assertEquals(testString, result);
    }
}