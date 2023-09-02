package HomeWorks.HomeWork_3;

import java.util.Arrays;

public class Program {

    public static void main(String[] args) {

        Employee employee1 = new Employee("CCCC", 40);
        Employee employee2 = new Employee("MMM", 38);



        LinkedList<Employee> employeeLinkedList = new LinkedList<>();
        employeeLinkedList.addFirst(new Employee("34523453245", 21));
        employeeLinkedList.addFirst(new Employee("AAAAAA", 33));
        employeeLinkedList.addFirst(employee1);
        employeeLinkedList.addFirst(new Employee("DDDD", 34));
        employeeLinkedList.addFirst(new Employee("AAAAAA", 44));
        employeeLinkedList.addFirst(new Employee("EEEEE", 51));
        employeeLinkedList.addFirst(new Employee("MMMMMM", 33));
        employeeLinkedList.addFirst(new Employee("AAAAAA", 32));
        employeeLinkedList.addFirst(employee2);

        System.out.println(employeeLinkedList);
        System.out.println();

        //boolean res = employeeLinkedList.contains(null);

//        employeeLinkedList.sort(new EmployeeNameComparator(SortType.Ascending));
//
//        System.out.println(employeeLinkedList);
//        System.out.println();
//
//        employeeLinkedList.sort(new EmployeeNameComparator(SortType.Descending));
//
//        System.out.println(employeeLinkedList);
//        System.out.println();
//
//        employeeLinkedList.removeFirst();
//        employeeLinkedList.removeLast();
//
//        System.out.println(employeeLinkedList);

        employeeLinkedList.reverseList();

        System.out.println(employeeLinkedList);
        System.out.println();

        LinkedList<Employee>.Node node = employeeLinkedList.head;
        while (node != null){
            node = node.next;
        }


//        for (Employee e: employeeLinkedList) {
//
//        }


    }

}
