package com.itheima.demo;
//电影操作类

import java.util.Scanner;

public class MovieOperator {
    private Movie[] movies;//记住一个电影对象的数组

    public MovieOperator(Movie[] movies) {
        this.movies = movies;
    }

    //打印电影列表
    public void printMovies() {
        System.out.println("打印电影列表如下");
        for (int i = 0; i < movies.length; i++) {
            //i = 0 1 2 3 4 5
            Movie m = movies[i];
            System.out.println(m.getId() + " " + m.getName() + " " + m.getPrice() + " " + m.getActor());
        }
    }

    //根据id查询电影
    public void searchMovieById() {
        System.out.println("请输入要查询的电影id");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        //遍历每个电影对象
        for (int i = 0; i < movies.length; i++) {
            //拿到当前遍历到的电影对象
            Movie m = movies[i];
            //判断当前电影的id是否和用户输入的id一致,是的话,打印电影信息
            if (id == m.getId()) {
                System.out.println(m.getId() + " " + m.getName() + " " + m.getPrice() + " " + m.getActor());
                return;
            }
        }
        System.out.println("没有找到该电影");
        return;
    }
}
