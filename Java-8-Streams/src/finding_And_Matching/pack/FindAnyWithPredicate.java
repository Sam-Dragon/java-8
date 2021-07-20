package finding_And_Matching.pack;

import java.util.Optional;

import model.pack.Employee;

public class FindAnyWithPredicate implements Runnable {

    public static void main(String[] args) {
        Thread t = new Thread(new FindAnyWithPredicate());
        t.start();

        t = new Thread(new FindAnyWithPredicate());
        t.start();

        t = new Thread(new FindAnyWithPredicate());
        t.start();
    }

    @Override
    public void run() {
        Optional<Employee> findAnyEmployee = Employee.employees().stream().filter(e -> e.getId().compareTo(2L) > 0)
                .findAny();
        System.out.println(findAnyEmployee);
    }
}
