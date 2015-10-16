package com.ankur.main;

public class DistanceCalculater {
	
	public double calculateDistance(double latitudeOfPoint1, double longitudeOfpoint1, double latitudeOfPoint2, double longitudeOfpoint2){
		double distance = 0d;
		int radius = 6371;
		double differenceBetweenLongitude = Math.abs(longitudeOfpoint1-longitudeOfpoint2);
		double angleBetweenPoints = Math.acos(Math.sin(latitudeOfPoint1)*Math.sin(latitudeOfPoint2) + Math.cos(latitudeOfPoint1)*Math.cos(latitudeOfPoint2)*differenceBetweenLongitude);
		distance = radius*angleBetweenPoints* Math.PI/180;
		
		return distance;
	}
}
