package com.itheima.demo;

public class Test {
    public static void main(String[] args) {
        //目标:完成面向对象的综合案例
        //1,设计电影类Movie,以便创1建电影对象,封装电影数据.
        //2,封装系统中的全部电影数据(自己造一些数据)
        Movie[] movies = new Movie[6];
        //movies = [null, null, null, null, null, null]
        //           0     1    2    3      4       5
        movies[0] = new Movie("《战狼2》", 1, 9.5, "吴京");
        movies[1] = new Movie("《战狼》", 2, 8.0, "吴京");
        movies[2] = new Movie("《夏洛特烦恼》", 3, 9.0, "沈腾");
        movies[3] = new Movie("《让子弹飞》", 4, 9.4, "姜文");
        movies[4] = new Movie("《暗战》", 5, 8.7, "王大陆,渣渣辉");
        movies[5] = new Movie("《速度与激情8》", 6, 9.0, "瑞克·奥利哈德");

        //3,创建一个电影操作对象出来,专门用于电影操作
        MovieOperator mo = new MovieOperator(movies);
        mo.printMovies();//Alt+Enter
        mo.searchMovieById();
    }
}
