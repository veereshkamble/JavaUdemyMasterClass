package com.veereshkamble;

public class PaintJob {

    public static int getBucketCount(double width, double height, int areaPerBucket, int extraBuckets) {

        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
    }


}
