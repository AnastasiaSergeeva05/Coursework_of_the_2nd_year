import java.time.LocalDate;
import java.time.LocalDateTime;

public class EverydayTask extends Task {
    public EverydayTask(String title,

                        String description,

                        LocalDateTime taskDateTime) {
        super(title, description, taskDateTime);
    }

    @Override
    public boolean appearsIn(LocalDate date) {
        return getTaskDateTime().isBefore(date.atStartOfDay());
    }
}