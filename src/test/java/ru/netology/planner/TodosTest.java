package ru.netology.planner;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TodosTest {
    @Test
    public void shouldAddThreeTasksOfDifferentType() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, "какие-то подзадачи");

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        Todos todos = new Todos();

        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);

        Task[] expected = {simpleTask, epic, meeting};
        Task[] actual = todos.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

//    @Test  // дописать
//    public void searchTaskTest() {
//        String[] query = {"Позвонить родителям","Выкатка 3й версии приложения"};
//        Todos search = new Todos();
//        Task[] expected ={};
//        Task[] actual = search.search("Позвонить родителям");
//
//        Assertions.assertArrayEquals(expected, actual);
//    }
//
// @Test
// public void searchEpicTest(){
//
// }

    @Test
    public void searchMeetingTest() {
        Meeting meetingSearch = new Meeting(555, "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда");
        Boolean expected = true;
        Boolean actual = meetingSearch.matches("Выкатка");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void searchSimpleTaskTest() {
        SimpleTask simpleTaskSearch = new SimpleTask(5, "Позвонить родителям");
        Boolean expected = true;
        Boolean actual = simpleTaskSearch.matches("родителям");

        Assertions.assertEquals(expected, actual);
    }

}
