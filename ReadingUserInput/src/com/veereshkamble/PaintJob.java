package com.veereshkamble;

public class PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }

        double area = width * height;
        System.out.println("Area = " + area);
        int totalBuckets =  Math.round(area/areaPerBucket);
        System.out.println("Total Buckets = " + totalBuckets);
        return totalBuckets - extraBuckets;
    }

    public static void main(String[] args) {

        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));
        System.out.println();
    }


}
