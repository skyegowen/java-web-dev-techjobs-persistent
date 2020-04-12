package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {


    @NotBlank
    @Size(min=3, max=255, message="Description must be between 3 & 255 characters.")
    private String description;

    //Part 4: Skill.jobs: Step 1 & 2
    @ManyToMany(mappedBy = "skills")
    private final List<Job> jobs = new ArrayList<>();

    public Skill(String description) {
        this.description = description;
    }

    public Skill() {}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Part 4: Skill.jobs: Step 1 Add getter for jobs List
    public List<Job> getJobs() {
        return jobs;
    }

    // Part 4: Skill.jobs: Step 1 Add method to add jobs
    public void addJob(Job job) {
        this.jobs.add(job);
    }
}