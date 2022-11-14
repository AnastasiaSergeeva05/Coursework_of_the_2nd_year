import java.time.LocalDate;
import java.time.LocalDateTime;

public class EveryWeekTask extends Task {
    public EveryWeekTask(String title,
                         String description,
                         LocalDateTime taskDateTime) {
        super(title, description, taskDateTime);
    }

    @Override
    public boolean appearsIn(LocalDate date) {
        return getTaskDateTime().getDayOfWeek().equals(date.getDayOfWeek());

    }
}
