package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
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

    @Test
    public void equal_test() {
        assert(team.equals(team));
        Object notATeam = new Object();
        assert(!team.equals(notATeam));

        Team team1 = new Team("test-team");  
        Team team2 = new Team("not-equal");

        assert(team.equals(team1));
        assert(!team.equals(team2));
        assert(!team.equals(null));


        Team team3 = new Team("test-team");
        team3.addMember("Alice");
        assert(!team.equals(team3));
        
        Team team4 = new Team("test-team");
        team4.addMember("Alice");
        assert(team3.equals(team4));



    }

    @Test
    public void hash_test() {
        Team t=new Team("test-team");
        int result = t.hashCode();
        int expectedResult = -1226298695;
        assertEquals(expectedResult, result);
    }

    
   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)

}
