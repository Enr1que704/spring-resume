package dev.ericdjohnson.Resume.job;

public record Job(
    Integer id,
    String title,
    String company,
    String startDate,
    String endDate,
    String description
) {}
