package day61_Collection_Map.My_Oractice;

import day61_Collection_Map.My_Oractice.Job;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class JobHunter {
    public static void main(String[] args) {

        List<Job> jobLst = new LinkedList<>();
        Job j1 = new Job("VA",120000, "Cybertek");
        Job j2 = new Job("TX",90000, "Apple");
        Job j3 = new Job("NY",122000,"MasterCard");
        Job j4 = new Job("PA",11000, "NOVA");
        Job j5 = new Job("FL",98000, "VISA");
        jobLst.addAll(Arrays.asList(j1,j2,j3,j4,j5));

        System.out.println("jobLst before = " + jobLst);
        Collections.sort(jobLst);
        System.out.println("jobLst after = " + jobLst);

    }
}
