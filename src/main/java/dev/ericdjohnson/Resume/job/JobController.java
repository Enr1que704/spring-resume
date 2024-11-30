package dev.ericdjohnson.Resume.job;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/jobs")
public class JobController {

    private final JobRepository jobRepository;

    public JobController(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    @GetMapping("/allJobs")
    List<Job> findAllJobs() {
        return jobRepository.findAll();
    }

    @GetMapping("/jobById/{id}")
    Job findJobById(@PathVariable Integer id) {
        Optional<Job> job = jobRepository.findById(id);
        if (job.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Job not found.");
        }
        return job.get();
    }
}
