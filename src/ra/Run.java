package ra;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;

public class Run {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws ParseException {
        while (true){
            System.out.println("Chọn chức năng :");
            System.out.println("1. Thêm mới");
            System.out.println("2. Hiển thị");
            System.out.println("3. Sửa");
            System.out.println("4. Xóa");
            System.out.println("5. Thoát");
            byte choice = sc.nextByte();
            switch (choice){
                case 1:
                    System.out.println("==========Thêm mới========");
                    Employee employee = new Employee();
                    System.out.println("Nhập tên : ");
                    employee.setName(sc.nextLine());
                    System.out.println("Nhập phòng ban : ");
                    employee.setDepartment(sc.nextLine());
                    System.out.println("Nhập Ngày sinh : ");
                    employee.setDob(new SimpleDateFormat("dd/MM/yyyy").parse(sc.nextLine()));
                    System.out.println("Nhập lương : ");
                    employee.setSalary(new BigDecimal(sc.nextLine()));
                    List<Employee> list = IOFile.readFromFile("employee.txt");
                    list.add(employee);
                    IOFile.writeToFile("employee.txt",list);
                    break;
                case 2:
                    System.out.println("Hien thị danh sach");
                    List<Employee> employees = IOFile.readFromFile("employee.txt");
                    for (Employee e : employees){
                        System.out.println(e);
                    }
                    break;
            }
        }
    }
}
