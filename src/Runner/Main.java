package Runner;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {

//Lista med "runners"
        var runners = new ArrayList<Runner>();
//Sätter antal inmatning til 3
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {

            var runner = new Runner();

            // Ber om namn samt tid
            System.out.print(" Name of Runner.Runner: ");
            runner.setName(input.next());
            System.out.print("Time of Runner.Runner finished: ");
            runner.setTime(input.nextInt());

            //Lägger till runners
            runners.add(runner);
        }


        //sorterar listan med runners baserat på tiden
        var sortedRunners = runners.stream()
                .sorted(Comparator.comparing(Runner::getTime))
                .collect(Collectors.toList());

        System.out.println("The fastest runner is " + sortedRunners.get(0).getName() + " with time " + sortedRunners.get(0).getTime());
        System.out.println("The second fastest runner is " + sortedRunners.get(1).getName() + " with time " + sortedRunners.get(1).getTime());
        System.out.println("The third fastest runner is " + sortedRunners.get(2).getName() + " with time " + sortedRunners.get(2).getTime());


    }


}




