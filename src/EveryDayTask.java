import java.time.LocalDate;
import java.time.LocalDateTime;

public class EveryDayTask extends Task {
    public EveryDayTask(String title,
                        String description,
                        LocalDateTime taskDateTime,
                        TypeOfTask typeOfTask) {
        super(title, description, taskDateTime, typeOfTask);
    }

    @Override
    public boolean appearsIn(LocalDate date) {
        return getTaskDateTime().isBefore(date.atStartOfDay());
    }
}