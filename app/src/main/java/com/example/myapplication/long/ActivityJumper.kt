package com.example.myapplication.long

interface ActivityJumper {
    fun jumpToBusStopDetail(city_str: String, city_name: String, station: String)
    fun jumpToBusLineDetail(city_str: String, city_name: String, line: String,nowStopName:String)
}