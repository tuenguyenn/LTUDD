package com.example.myapplication.tuan3;

public class T32contact
{
   private String name;
   private String Age;
   private int Image;

    public T32contact() {
    }

    public T32contact(String name, String age, int image) {
        this.name = name;
        this.Age = age;
        this.Image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }
}
