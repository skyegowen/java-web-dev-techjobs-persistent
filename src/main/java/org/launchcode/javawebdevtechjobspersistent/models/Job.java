package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Job extends AbstractEntity{

    @ManyToOne
    private Employer employer;

    //Part 4: Refactor job.skills update skills
    @ManyToMany
    private List<Skill> skills = new ArrayList<>();

    public Job() {
    }

    public Job(Employer anEmployer) { //, List<Skill> someSkills
        super();
        this.employer = anEmployer;
       // this.skills = someSkills;//Part 4: Refactor job.skills update skills to be type List<Skill>

    }

    // Getters and setters.

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    //Part 4: Refactor job.skills update skills & add getter
    public List<Skill> getSkills() {
        return skills;
    }
// Part 4: update skill to be of type List<Skill>. Final variable so setter unnecessary.
    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
}
