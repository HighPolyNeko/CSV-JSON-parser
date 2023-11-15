import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void testToString() {
        // given:
        Employee employee = new Employee(1,"John","Smith","USA",25);
        String testResult = "Employee{id=1, firstName='John', lastName='Smith', country='USA', age=25}";

        // when:
        String result = employee.toString();

        // then:
        Assertions.assertEquals(testResult, result);
    }
}