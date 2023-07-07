// Подумать над структурой класса Ноутбук(или Единорогов) для магазина техники - 
// выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Переопределить toString, equals и hashCode(как на семинаре).
// Вывести на печать экземпляры класса, сравнить пару экземпляров и 
// найти один экземпляр в наборе.

package Homework6;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;

public class Unicornshop {

    public int weight;
    public String name;
    public int color;
    public Date age;
    public boolean isMan;
    public long id;
    public float price;

    public Unicornshop(int weight, String name, int color, Date age, boolean isMan, long id, float price) {
        this.weight = weight;
        this.name = name;
        this.color = color;
        this.age = age;
        this.isMan = isMan;
        this.id = id;
        this.price = price;

    }

    public boolean medSup() {
        return true;
    }

    @Override
    public String toString() {
        SimpleDateFormat formatter = new SimpleDateFormat("EEE, MMMM d, yyyy", Locale.ENGLISH);

        return "Кличка: " + name + " ID: " + id + " Вес: " + weight + " Дата рождения: " + formatter.format(age)
                + "Цена: " + price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Unicornshop unicorn = (Unicornshop) o;
        return weight == unicorn.weight && color == unicorn.color && isMan == unicorn.isMan;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, name, color, age, isMan, id);
    }

}