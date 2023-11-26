package tutorialpoint.Collection;

import java.util.Map;

public class UpdateResults {
    public static void main(String[] args) {
        Map<String, Integer> grades = TextResult.getMakeUpGrades();
        Map<String, Integer> original = TextResult.getOriginalGrades();

        for (var students : grades.entrySet()) {
            Integer firstGrade = grades.get(students.getKey());
            Integer orginalGrade = original.get(students.getKey());

            if (firstGrade > orginalGrade) {
                original.put(students.getKey(), firstGrade);
            }

        }
        System.out.println("Final Grades:");
        original.forEach(
                (k, v) -> System.out.println("Student: " + k + ", Grade: " + v));
    }
}
