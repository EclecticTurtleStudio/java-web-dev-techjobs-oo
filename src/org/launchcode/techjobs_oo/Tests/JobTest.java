package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    Job job1;
    Job job2;
    Job job3;
    Job job4;
    Job job5;

    @Before
    public void createJobs() {
        job1 = new Job();
        job2 = new Job();
        job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        job5 = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    @Test
    public void emptyTest(){
        assertEquals(10,10,.001);
    }

    @Test
    public void testSettingJobId() {
        assertEquals(1, (job2.getId() - job1.getId()));
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertNotNull(job3);
        assertEquals("Product tester", job3.getName());
        assertEquals("ACME", job3.getEmployer().getValue());
        assertEquals("Desert", job3.getLocation().getValue());
    }

    @Test
    public void testJobsForEquality() {
        assertNotSame(job3, job4);
    }

    @Test
    public void testForBlankLineBeforeAndAfter() {
        String job = job3.toString();
        assertTrue(job.contains("\n"));
    }

    @Test
    public void testJobListingDetailLayout() {
        assertEquals("\nID: 3\nName: Product tester\nEmployer: ACME\nLocation: Desert\nPosition Type: Quality control\nCore Competency: Persistence\n", job3.toString());
    }

    @Test
    public void testShowsDataNotAvailable() {
        String job = job5.toString();
        assertTrue(job.contains("Data not available"));
    }

}
