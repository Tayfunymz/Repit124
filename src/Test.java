import java.util.ArrayList;
import java.util.Arrays;

// DONT TOUCH THIS GUYS THIS IS GOING TO BE USED TO TEST EVERONES CODE

public class Test {

    public static void main(String[] args) {
        int[] correct = {55,100,1,44,2,3,4};
        ArrayList<int[]> solutions = new ArrayList<>();
        solutions.add(AdiletSolution.solution());
        solutions.add(AihaitiSolution.solution());
        solutions.add(JulaitiSolution.solution());
        solutions.add(JuliaSolution.solution());
        solutions.add(MahdiSolution.solution());
        solutions.add(MohamedSolution.solution());
        solutions.add(SinanSolution.solution());
        solutions.add(TayfunSolution.solution());
        solutions.add(UmmahanSolution.solution());
        int errorFound = 0;
        for (int i = 0; i < solutions.size(); i++) {
            for (int j = 0; j < correct.length; j++) {
                if (solutions.get(i)[j] != correct[j]) {
                    errorFound += 1;
                    break;
                }
            }

        }
        if (errorFound == 0) {
            System.out.println("CONGRATS PROJECT IS COMPLETE");
        } else {
            System.out.println(errorFound + " solution was inccorect");
        }

        }
    }

