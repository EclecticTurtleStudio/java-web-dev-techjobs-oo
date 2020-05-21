package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    @Test
    public void emptyTest(){
        assertEquals(10,10,.001);
    }

    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        assertEquals(1, (job2.getId() - job1.getId()));
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(job3 instanceof Job);
        assertEquals("Product tester", job3.getName());
    }

    @Test
    public void testJobsForEquality() {
        Job job4 = new Job("Sandwich Artist", new Employer("Subway"), new Location("Mars"), new PositionType("Customer Service"), new CoreCompetency("Personable"));
        Job job5 = new Job("Sandwich Artist", new Employer("Subway"), new Location("Mars"), new PositionType("Customer Service"), new CoreCompetency("Personable"));
        assertNotSame(job4, job5);
    }

    @Test
    public void testForBlankLineBeforeAndAfter() {
        Job job6 = new Job();
        String job = job6.toString();
        assertTrue(job.contains("\n" + "\n"));
    }
}
