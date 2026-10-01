package com.javarush.task.pro.task16.task1616;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/* 
Тренировка временных зон
*/

public class Solution {

    public static void main(String[] args) {
        TreeSet<String> sortedZones = getSortedZones();
        System.out.println(sortedZones.size());
        System.out.println(sortedZones.first());
        System.out.println(sortedZones.last());

        System.out.println(getBeijingDateTime());
    }

    static TreeSet<String> getSortedZones() {
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        TreeSet<String> sortedZones = new TreeSet<>();
        for (String availableZoneId : availableZoneIds) {
            sortedZones.add(availableZoneId);
        }
        return sortedZones;
    }

    static ZonedDateTime getBeijingDateTime() {
        return ZonedDateTime.now(ZoneId.of("Asia/Shanghai"));
    }
}
