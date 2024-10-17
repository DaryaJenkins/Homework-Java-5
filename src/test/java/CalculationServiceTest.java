import org.junit.jupiter.api.Test;
import ru.netology.services.CalculationService;

public class CalculationServiceTest {

    @Test
    public void vacationSalary10K() {
        CalculationService service = new CalculationService();

        int vacationMonths = service.calculate(10_000, 3_000, 20_000);
        System.out.println(vacationMonths);
    }

    @Test
    public void vacationSalary100K() {
        CalculationService service = new CalculationService();

        int vacationMonths = service.calculate(100_000, 60_000, 150_000);
        System.out.println(vacationMonths);
    }
}