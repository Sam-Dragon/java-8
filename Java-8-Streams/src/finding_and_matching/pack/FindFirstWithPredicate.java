package finding_and_matching.pack;

import java.util.Optional;

import model.pack.Employee;

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
        Optional<Employee> findFirstEmployee = Employee.employees().stream().filter(e -> e.getId().compareTo(2L) > 0)
                .findFirst();
        System.out.println(findFirstEmployee);
    }
}