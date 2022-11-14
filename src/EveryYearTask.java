import java.time.LocalDate;
import java.time.LocalDateTime;

public class EveryYearTask extends Task {
    public EveryYearTask(String title,
                         String description,
                         LocalDateTime taskDateTime) {
        super(title, description, taskDateTime);
    }


    @Override
    public boolean appearsIn(LocalDate date) {
        return getTaskDateTime().getYear() <= date.getYear() &&
                getTaskDateTime().getDayOfYear() == date.getDayOfYear();
    }
}
