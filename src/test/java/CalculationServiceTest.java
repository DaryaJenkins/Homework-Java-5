import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.services.CalculationService;

public class CalculationServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/money.csv")
    public void vacationSalary(int income, int expenses, int threshold) {
        CalculationService service = new CalculationService();

        int vacationMonths = service.calculate(income, expenses, threshold);
        System.out.println(vacationMonths);
    }
}