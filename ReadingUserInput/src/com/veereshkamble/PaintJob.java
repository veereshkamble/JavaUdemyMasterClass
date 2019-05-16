package com.veereshkamble;

public class PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }

        double area = width * height;
        int totalBuckets = (int) (area / areaPerBucket);
        return totalBuckets - extraBuckets;
    }


}
