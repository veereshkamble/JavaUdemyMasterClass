package com.veereshkamble;

public class PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }

        double area = width * height;
        int totalBuckets = (int) (area / areaPerBucket);
        if(area % areaPerBucket != 0) {
            totalBuckets++;
        }
        return totalBuckets - extraBuckets;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if(width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        double area = width * height;
        int totalBuckets = (int) (area / areaPerBucket);
        if(area % areaPerBucket != 0) {
            totalBuckets++;
        }
        return totalBuckets;
    }

    public static void main(String[] args) {

        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
    }

}
