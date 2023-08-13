package ru.netology.planner;

import java.util.Arrays;

public class Epic extends Task {
    protected String subtasks;

    public Epic(int id, String subtasks) {
        super(id); // вызов родительского конструктора
        this.subtasks = subtasks; // заполнение своих полей
    }

    public String getSubtask() {
        return subtasks;
    }


//    @Override // дописать + протестировать
//    public boolean matches(String query) {
//        for (Epic task : subtasks) { // перебираем все задачи
//            if (task.contains(query)) { // если задача подходит под запрос
//                return true; // добавляем её в массив ответа
//            }
//        }
//        return false;
//    }
}
