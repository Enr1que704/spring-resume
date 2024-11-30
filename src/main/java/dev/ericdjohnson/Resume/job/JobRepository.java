package dev.ericdjohnson.Resume.job;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class JobRepository {

    private List<Job> jobs = new ArrayList<>();

    List<Job> findAll() {
        return jobs;
    }

    Optional<Job> findById(Integer id) {
        return jobs.stream().filter(job -> job.id().equals(id)).findFirst();
    }

    @PostConstruct
    private void init() {
        jobs.add(new Job(1, "Software Engineer", "Google", "2019-01-01", "2021-01-01", "Worked on the Google search engine."));
        jobs.add(new Job(2, "Software Engineer", "Facebook", "2017-01-01", "2019-01-01", "Worked on the Facebook social network."));
    }

}
