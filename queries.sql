## Part 1: Test it with SQL
list the columns and their data types in the table.

id - int
employer - varchar(255)
name - varchar(255)
skills - varchar(255)

## Part 2: Test it with SQL
write a query to list the names of the employers in St. Louis City.

SELECT name
FROM employer
WHERE location="St. Louis City"

## Part 3: Test it with SQL
write the SQL statement to remove the job table.

DROP TABLE job

## Part 4: Test it with SQL
write a query to return a list of the names and descriptions of all skills that are attached to
jobs in alphabetical order. If a skill does not have a job listed, it should not be included in
the results of this query.

SELECT skill.id, skill.name, skill.description FROM techjobs_persistent.job_skills
JOIN techjobs_persistent.skill ON job_skills.skills_id = skill.id
ORDER BY  skill.name

