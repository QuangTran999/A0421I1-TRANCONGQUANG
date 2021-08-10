package S7_AbstractClass_Interface.Thuc_hanh.Lop_Animal_va_interface_Edible.fruit;

import S7_AbstractClass_Interface.Thuc_hanh.Lop_Animal_va_interface_Edible.edible.Edible;

public class Orange extends Fruit {
    @Override
    public String howToEat() {
        return "Orange could be juiced";
    }
}
