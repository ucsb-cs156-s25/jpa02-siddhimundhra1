package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("s25-14");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("s25-14"));
    }

    @Test
    public void getTeam_returns_team_with_correct_members() {
        Team  t = Developer.getTeam();
        assert(t.getMembers().contains("Siddhi M"));
        assert(t.getMembers().contains("Andrew Z"));
        assert(t.getMembers().contains("Karen Y"));
        assert(t.getMembers().contains("Chloe A"));
        assert(t.getMembers().contains("Ryan C"));
        assert(t.getMembers().contains("Shruti S"));
 /*       assertEquals(t.getMembers().contains("Siddhi M"));
assertEquals(t.getMembers().contains("Andrew Z"));
assertEquals(t.getMembers().contains("Karen Y"));
assertEquals(t.getMembers().contains("Chloe A"));
assertEquals(t.getMembers().contains("Ryan C"));
assertEquals(t.getMembers().contains("Shruti S"));*/


    }

    
   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)

}
