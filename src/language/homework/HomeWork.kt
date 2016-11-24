package language.homework

import java.io.File

val apiUrl = "https://www.google.co.kr/maps/place/";

/**
 *  경도 위도 시분초 계산
 *  35.1922120 -> 35°11'32.0"N
 *  0.1922120 * 60 -> 11.53272
 *  0.53272 * 60 -> 31.9632
 *
 *  129.2233130 -> 129°13'23.9"E
 *  0.2233130 * 60 -> 13.39878
 *  0.39878 * 60 -> 23.9268
 *
 *  소수점 둘째 자리에서 반올림
 *
 *  api param => 35°11'32.0"N+129°13'23.9"E
 *  result => https://www.google.co.kr/maps/place/35°11'32.0"N+129°13'23.9"E
  */

fun distFrom(lat1: Float, lng1: Float, lat2: Float, lng2: Float): Float {
	val earthRadius = 6371000.0 //meters
	val dLat = Math.toRadians((lat2 - lat1).toDouble())
	val dLng = Math.toRadians((lng2 - lng1).toDouble())
	val a = Math.sin(dLat / 2) * Math.sin(dLat / 2) + Math.cos(Math.toRadians(lat1.toDouble())) * Math.cos(Math.toRadians(lat2.toDouble())) *
			Math.sin(dLng / 2) * Math.sin(dLng / 2)
	val c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a))
	val dist = (earthRadius * c).toFloat()
	
	return dist
}




fun main(args: Array<String>) {
	val file = File("src/language/homework/earthquake_surge_shelter_info.csv").readLines()
	
	if(file.size <= 0 ) return;
	
	val keyList = file.get(1).split(",")
	val shelterDataList = file.subList(2, file.size)
	
	
	shelterDataList.forEachIndexed { i, s -> println("${i} : ${s}") }
	
//	println(distFrom(35.2250550f,129.2269450f,35.1922120f,129.2233130f))
}


