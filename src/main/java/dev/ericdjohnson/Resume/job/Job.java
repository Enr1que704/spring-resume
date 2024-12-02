package dev.ericdjohnson.Resume.job;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.PastOrPresent;

public record Job(
    Integer id,
    @NotEmpty
    String title,
    @NotEmpty
    String company,
    String startDate,
    String endDate,
    @NotEmpty
    String description
) {}
