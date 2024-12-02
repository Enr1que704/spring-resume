//package dev.ericdjohnson.Resume.job;
//
//import jakarta.validation.Valid;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/api/jobs")
//public class JobControllerInMem {
//
//    private final JobRepositoryInMem jobRepositoryInMem;
//
//    public JobControllerInMem(JobRepositoryInMem jobRepositoryInMem) {
//        this.jobRepositoryInMem = jobRepositoryInMem;
//    }
//
//    @GetMapping("/allJobs")
//    List<Job> findAllJobs() {
//        return jobRepositoryInMem.findAll();
//    }
//
//    @GetMapping("/jobById/{id}")
//    Job findJobById(@PathVariable Integer id) {
//        Optional<Job> job = jobRepositoryInMem.findById(id);
//        if (job.isEmpty()) {
//            throw new JobNotFoundException();
//        }
//        return job.get();
//    }
//
//    @ResponseStatus(HttpStatus.CREATED)
//    @PostMapping("/createJob")
//    // @Valid annotation is used to validate the request body, and the checks are contained within the Job class
//    void createJob(@Valid @RequestBody Job job) {
//        jobRepositoryInMem.create(job);
//    }
//
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    @PutMapping("/updateJob/{id}")
//    void updateJob(@Valid @RequestBody Job job, @PathVariable Integer id) {
//        jobRepositoryInMem.update(job, id);
//    }
//
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    @DeleteMapping("/deleteJob/{id}")
//    void deleteJob(@PathVariable Integer id) {
//        jobRepositoryInMem.delete(id);
//    }
//}
