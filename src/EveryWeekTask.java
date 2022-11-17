
import java.time.LocalDate;
import java.time.LocalDateTime;

public class EveryWeekTask extends Task {
    public EveryWeekTask(String title,
                         String description,
                         LocalDateTime taskDateTime, TypeOfTask typeOfTask) {
        super(title, description, taskDateTime, typeOfTask);
    }

    @Override
    public boolean appearsIn(LocalDate date) {
        return getTaskDateTime().getDayOfWeek().equals(date.getDayOfWeek());
    }
}