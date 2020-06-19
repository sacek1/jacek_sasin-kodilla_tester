package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {

        List<LocalDate> deadlineDates = TaskRepository.getTasks()
                .stream()
                .filter(task -> task.getDeadline().isAfter(LocalDate.now()))
                .map(tn -> tn.getDeadline())
                .collect(Collectors.toList());
        System.out.println(deadlineDates);
    }
}
