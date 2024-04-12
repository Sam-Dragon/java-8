package src.streams.finding_and_matching.pack;

import src.model.Employee;

import java.math.BigDecimal;
import java.util.Optional;

public class FindFirstWithPredicate implements Runnable {

    public static void main(String[] args) {
        Thread t = new Thread(new FindAnyWithPredicate());
        t.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        t = new Thread(new FindAnyWithPredicate());
        t.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        t = new Thread(new FindAnyWithPredicate());
        t.start();
    }

    @Override
    public void run() {
        Optional<Employee> findFirstEmployee = Employee.employees()
                .stream()
                .filter(e -> e.getSalary()
                        .compareTo(BigDecimal.valueOf(55000)) > 0)
                .findFirst();
        System.out.println(findFirstEmployee);
    }
}
