
import java.time.LocalDate;
import java.time.LocalDateTime;

public class EveryYearTask extends Task {

    public EveryYearTask(String title,
                         String description,
                         LocalDateTime taskDateTime,
                         TypeOfTask typeOfTask) {
        super(title, description, taskDateTime, typeOfTask);
    }

    @Override
    public boolean appearsIn(LocalDate date) {

        return getTaskDateTime().getYear() <= date.getYear() && getTaskDateTime().getDayOfYear() == date.getDayOfYear();
    }

}