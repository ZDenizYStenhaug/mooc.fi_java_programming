import java.util.ArrayList;

public class ExerciseManagement {
    
    private ArrayList<Exercise> exercises;
    
    public ExerciseManagement() {
        exercises = new ArrayList<>();
    }
    
    public void add(String name) {
        exercises.add(new Exercise(name));
    }
    
    public ArrayList<String> exerciseList() {
        ArrayList<String> list = new ArrayList<>();
        for (Exercise exercise : exercises) {
            list.add(exercise.getName());
        }
        return list;    
    }
    
    public void markAsCompleted(String name) {
        for (Exercise e : exercises) {
            if (name.equals(e.getName())) {
                e.setCompleted(true);
            }
        }
    }
    
    public boolean isCompleted(String name) {
        for (Exercise e : exercises) {
            if (name.equals(e.getName())) {
                return e.getCompleted();
            }
        }
        return false;
    }
    
    
}
