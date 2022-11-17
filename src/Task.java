import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class Task {
    private static int counter;
    private final int id;
    private String title;
    private String description;

    public enum TypeOfTask {
        PERSONAL("Личный"),
        WORK("Рабочий");

        private String typeOfTaskTitle;

        TypeOfTask(String typeOfTaskTitle) {
            this.typeOfTaskTitle = typeOfTaskTitle;
        }

        public String getTypeOfTaskTitle() {
            return typeOfTaskTitle;
        }

        public void setTypeOfTaskTitle(String typeOfTaskTitle) {
            this.typeOfTaskTitle = typeOfTaskTitle;
        }

        public String getTypeOfTask() {
            return typeOfTaskTitle;
        }

    }

    public TypeOfTask typeOfTask;

    private LocalDateTime taskDateTime;

    public Task(String title, String description, LocalDateTime taskDateTime, TypeOfTask typeOfTask) {
        this.id = counter++;
        this.title = title;
        this.description = description;
        this.taskDateTime = taskDateTime;
        this.typeOfTask = typeOfTask;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }


    public int getId() {
        return id;
    }


    public abstract boolean appearsIn(LocalDate date);

    public LocalDateTime getTaskDateTime() {
        return taskDateTime;
    }

    @Override
    public String toString() {
        return "Ваш id " + id +
                ",название: " + title + '\'' +
                ", описание: '" + description + '\'' +
                ", ваше время: " + taskDateTime +
                '}';
    }
}