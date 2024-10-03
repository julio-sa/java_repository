package candidacy;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class recruiting_process {

    public static void main(String[] args) {
        String[] candidates = {"Liam", "Olivia", "Noah", "Emma", "Oliver"};
        for (String candidate : candidates) {
            tryingContact(candidate);
        }
    }

    static void tryingContact(String candidate) {
        int attemptsRealized = 1;
        boolean keepTrying = true;
        boolean answered = false;
        do {
            answered = answer();
            keepTrying = !answered;
            if (keepTrying) {
                attemptsRealized++; 
            }else {
                System.out.println("Sucessfully Contacted");
            }

        } while (keepTrying && attemptsRealized < 3);

        if (answered) {
            System.out.println(candidate + " sucessfully contacted " + " at the " + attemptsRealized + " realized"); 
        }else {
            System.out.println("Failed to contact " + candidate + " at " + attemptsRealized + " realized");
        }
    }

    static boolean answer() {
        return new Random().nextInt(3) == 1;
    }

    static void printSelected() {
        String[] candidates = {"Liam", "Olivia", "Noah", "Emma", "Oliver"};
        System.out.println("Printing the selected candidates list...");

        for (int index = 0; index < candidates.length; index++) {
            System.out.println("The candidate number" + (index + 1) + " is " + candidates[index]);
        }

        System.out.println("short form of for each");

        for (String candidate : candidates) {
            System.out.println("The selected candidate was " + candidate);
        }
    }

    static void candidatesSelection() {
        String[] candidates = {"Liam", "Olivia", "Noah", "Emma", "Oliver", "Charlotte",
            "Elijah", "Amelia", "William", "Sophia", "James", "Ava",
            "Benjamin", "Isabella", "Ethan", "Mia", "Michael",
            "Emily", "Alexander", "Harper"};

        int selectedCandidates = 0;
        int currentCandidate = 0;
        double baseSalary = 2000.0;
        while (selectedCandidates < 5 && currentCandidate < candidates.length) {
            String candidate = candidates[currentCandidate];
            double salaryExpectation = expectedValue();

            System.out.println("The candidate" + candidate + " asked for " + salaryExpectation);
            if (baseSalary >= salaryExpectation) {
                System.out.println("The candidate" + candidate + " was selected for the job");
                selectedCandidates++;
            }
            currentCandidate++;
        }
    }

    static double expectedValue() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void candidatesAnalysis(double salaryExpectation) {
        double baseSalary = 2000.0;
        if (baseSalary > salaryExpectation) {
            System.out.println("Contact Candidate");
        } else if (baseSalary == salaryExpectation) {
            System.out.println("Contact Candidate with counter offer");
        } else {
            System.out.println("Waiting for more candidate results");
        }
    }
}
