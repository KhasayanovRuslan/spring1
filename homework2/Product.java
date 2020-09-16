//Разобраться с примером проекта на Spring MVC.
//        Создать класс Товар (Product), с полями id, title, cost.
//        Товары необходимо хранить в репозитории (класс, в котором в виде List<Product> хранятся товары).
//        Репозиторий должен уметь выдавать список всех товаров и товар по id.
//        Сделать форму для добавления товара в репозиторий и логику работы этой формы.
//        Сделать страницу, на которой отображаются все товары из репозитория.
package com.geekbrains.entites;

public class Product {
    private int id;
    private String title;
    private double cost;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
