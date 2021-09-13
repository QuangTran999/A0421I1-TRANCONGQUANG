package S7_AbstractClass_Interface.Thuc_hanh.Lop_Animal_va_interface_Edible.animal;

import S7_AbstractClass_Interface.Thuc_hanh.Lop_Animal_va_interface_Edible.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";

    }


    @Override
    public String howToEat() {
        return "could be fried";
    }
}
