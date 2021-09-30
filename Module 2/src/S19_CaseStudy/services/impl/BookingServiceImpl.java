package S19_CaseStudy.services.impl;

import S19_CaseStudy.models.Booking;
import S19_CaseStudy.models.Customer;
import S19_CaseStudy.models.Facility;
import S19_CaseStudy.models.Villa;
import S19_CaseStudy.services.BookingServices;
import S19_CaseStudy.utils.BookingComparator;

import java.util.*;

public class BookingServiceImpl implements BookingServices {
    static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());
    static List<Customer> customerList = new ArrayList<>();
    static Map<Facility, Integer> treeMap = new TreeMap<>();
    static Scanner scanner = new Scanner(System.in);
    static {
        customerList.add(new Customer(1,"Chien", 20, "Male",
                "1231223123","0984577356",
                "dulichvietnam180@gmail.com","Vip","ĐN"));
        customerList.add(new Customer(2,"Tung", 22, "Male",
                "1231223123","0984577356",
                "dulichvietnam180@gmail.com","Vip","ĐN"));
        treeMap.put(new Villa("Villa 1", 200, 150, 10,
                "Day", "Vip", 15, 2),0);
        treeMap.put(new Villa("Villa 2", 250, 100, 10,
                "Day", "Nomar", 15, 2),0);
    }

    @Override
    public void display() {
        for (Booking booking : bookingSet){
            System.out.println(booking.toString());
        }
    }

    @Override
    public void addNew() {
        int id = 1;
        if (!bookingSet.isEmpty()){
            id = bookingSet.size();
        }
        Customer customer = chooseCustomer();
        Facility facility = chooseFacility();

        System.out.printf("Nhập thời gian bắt đầu: ");
        String startTime = scanner.nextLine();
        System.out.printf("Nhập thời gian kết thúc: ");
        String endTime = scanner.nextLine();

        Booking booking = new Booking(id, startTime, endTime, customer, facility);
//        treeMap.put(booking,0);
        bookingSet.add(booking);
        System.out.println("Đã booking thành công");
    }
    public static Customer chooseCustomer(){
        System.out.println("Danh sách khách hàng: ");
        for (Customer customer: customerList) {
            System.out.println(customer.toString());
        }
        System.out.println("nhập id khách hàng: ");
        boolean check = true;
        int id = Integer.parseInt(scanner.nextLine());
        while (check){
            for (Customer customer : customerList){
                if (id == customer.getId()){
                    check = false;
                    return customer;
                }
            }
            if (check){
                System.out.println("Bạn nhập sai, vui lòng nhập id khách hàng: ");
                id = Integer.parseInt(scanner.nextLine());
            }
        }
        return null;
    }
    public static Facility chooseFacility(){
        System.out.println("Danh sách dịch vụ: ");
        for (Map.Entry<Facility, Integer> entry : treeMap.entrySet()){
            System.out.println(entry.getKey().toString());
        }

        System.out.println("nhập id dịch vụ: ");
        boolean check = true;
        String id = scanner.nextLine();
        while (check){
            for (Map.Entry<Facility, Integer> entry : treeMap.entrySet()){
                System.out.println(entry.getKey().toString());
                check = false;
                return entry.getKey();
            }

            if (check){
                System.out.println("Bạn nhập sai, vui lòng nhập id khách hàng: ");
                id = scanner.nextLine();
            }
        }
        return null;
    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }
}
