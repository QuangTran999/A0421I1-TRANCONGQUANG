package S19_CaseStudy.services.impl;
import S19_CaseStudy.models.Facility;
import S19_CaseStudy.models.House;
import S19_CaseStudy.models.Room;
import S19_CaseStudy.models.Villa;
import S19_CaseStudy.services.FacilityServices;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityServices {
    private static Map<Facility, Integer> linkedHashMap = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);
    @Override
    public void display() {
        for(Map.Entry<Facility, Integer> facility : linkedHashMap.entrySet()){
            System.out.println("key: "+facility.getKey()+" || value: "+facility.getValue());
        }
    }

    @Override
    public void addNew() {

    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void displayMaintenance() {

    }

    @Override
    public void addNewVilla() {
        System.out.printf("Nhập tên dịch vụ: ");
        String serviceName = scanner.nextLine();
        System.out.printf("Nhập diện tích sử dụng: ");
        double area = Double.parseDouble(scanner.nextLine());
        System.out.printf("Nhập chi phí thuê: ");
        int rentalCosts = Integer.parseInt(scanner.nextLine());
        System.out.printf("Nhập số người tối đa: ");
        int people = Integer.parseInt(scanner.nextLine());
        System.out.printf("Nhập kiểu thuê: ");
        String rantalType = scanner.nextLine();
        System.out.printf("Nhập tiêu chuẩn phòng: ");
        String roomstandard = scanner.nextLine();
        System.out.printf("Nhập diện tích hồ bơi: ");
        double poolArea = Double.parseDouble(scanner.nextLine());
        System.out.printf("Nhập số tầng: ");
        int floorNumber = Integer.parseInt(scanner.nextLine());
        Villa villa = new Villa(serviceName,area,rentalCosts,people,rantalType,roomstandard,poolArea,floorNumber);
        linkedHashMap.put(villa,0);
    }

    @Override
    public void addNewHouse() {
        System.out.printf("Nhập tên dịch vụ: ");
        String serviceName = scanner.nextLine();
        System.out.printf("Nhập diện tích sử dụng: ");
        double area = Double.parseDouble(scanner.nextLine());
        System.out.printf("Nhập chi phí thuê: ");
        int rentalCosts = Integer.parseInt(scanner.nextLine());
        System.out.printf("Nhập số người tối đa: ");
        int people = Integer.parseInt(scanner.nextLine());
        System.out.printf("Nhập kiểu thuê: ");
        String rantalType = scanner.nextLine();
        System.out.printf("Nhập tiêu chuẩn phòng: ");
        String roomstandard = scanner.nextLine();
        System.out.printf("Nhập số tầng: ");
        int floorNumber = Integer.parseInt(scanner.nextLine());
        House house = new House(serviceName,area,rentalCosts,people,rantalType,roomstandard,floorNumber);
        linkedHashMap.put(house,0);
    }

    @Override
    public void addNewRoom() {
        System.out.printf("Nhập tên dịch vụ: ");
        String serviceName = scanner.nextLine();
        System.out.printf("Nhập diện tích sử dụng: ");
        double area = Double.parseDouble(scanner.nextLine());
        System.out.printf("Nhập chi phí thuê: ");
        int rentalCosts = Integer.parseInt(scanner.nextLine());
        System.out.printf("Nhập số người tối đa: ");
        int people = Integer.parseInt(scanner.nextLine());
        System.out.printf("Nhập kiểu thuê: ");
        String rantalType = scanner.nextLine();
        System.out.printf("Nhập dịch vụ miễn phí: ");
        String serviceType = scanner.nextLine();
        Room room = new Room(serviceName,area,rentalCosts,people,rantalType,serviceType);
        linkedHashMap.put(room,0);
    }
}
