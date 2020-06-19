package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasks() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Repair car", LocalDate.of(2019,11,01), LocalDate.of(2020,04,20)));
        tasks.add(new Task("Make extra house keys", LocalDate.of(2020,05,01), LocalDate.of(2020,06,10)));
        tasks.add(new Task("Renew insurance", LocalDate.of(2020,06,10), LocalDate.of(2020,06,30)));
        tasks.add(new Task("Paint the living room", LocalDate.of(2020,07,05), LocalDate.of(2020,07,20)));
        tasks.add(new Task("Buy socket wrenches", LocalDate.of(2020,04,15), LocalDate.of(2020,05,05)));
        tasks.add(new Task("Take out scrap metal", LocalDate.of(2020,06,15), LocalDate.of(2020,07,01)));
    return tasks;
    }
}
