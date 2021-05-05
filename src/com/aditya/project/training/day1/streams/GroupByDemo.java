package com.aditya.project.training.day1.streams;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByDemo {

    public static void main(String[] args) {

        List<Product> products = Arrays.asList(
                new Product("apple", 10, 9.99),
                new Product("banana", 20, 19.99),
                new Product("orange", 10, 29.99),
                new Product("watermelon", 10, 29.99),
                new Product("papaya", 20, 9.99),
                new Product("apple", 10, 9.99),
                new Product("banana", 11, 19.99),
                new Product("apple", 10, 9.99)
        );

        System.out.println("************ LIST ************");
        products.forEach(System.out::println);

        System.out.println("************ GROUP BY ************");
        products.stream()
                .collect(Collectors.groupingBy(Product::getName))
                .forEach((key, value) -> System.out.println(key + " : " + value));

        System.out.println("************ GROUP BY - LONG WAY ************");
        Map<String, List<Product>> map = products.stream()
                .collect(Collectors.groupingBy(Product::getName));
        map.forEach((key, value) -> System.out.println(key + " : " + value));

        System.out.println("************ GROUP BY NUMBER OF ELEMENTS ************");
        products.stream()
                .collect(Collectors.groupingBy(Product::getName, Collectors.counting()))
                .forEach((key, value) -> System.out.println(key + " : " + value));

        System.out.println("************ GROUP BY PRICE & QUANTITY ************");
        Map<Double, Map<Integer, List<Product>>> priceQtyProductMap = products.stream()
                .collect(Collectors.groupingBy(Product::getPrice, Collectors.groupingBy(Product::getQty)));
        priceQtyProductMap.forEach((price, qtyProductsMap) -> {
            System.out.println("Price : " + price);
            qtyProductsMap.forEach((quantity, productList) -> {
                System.out.println("    Quantity : " + quantity);
                productList.forEach(product -> System.out.println("     Product : " + product));
            });
        });

        System.out.println("************ PARTITIONING ************");
        Map<Boolean, List<Product>> partitionedByQty = products.stream()
                .collect(Collectors.partitioningBy(p -> p.getQty() == 10));
        partitionedByQty.forEach((key, value) -> System.out.println(key + " : " + value));

        System.out.println("************ SUMMING ************");
        Map<String, Integer> sum = products.stream()
                .collect(Collectors.groupingBy(Product::getName, Collectors.summingInt(Product::getQty)));
        System.out.println(sum);

        System.out.println("************ SUMMARY ************ ");
        DoubleSummaryStatistics statistics = products.stream()
                .mapToDouble(Product::getPrice)
                .summaryStatistics();
        System.out.println(statistics);

    }
}
