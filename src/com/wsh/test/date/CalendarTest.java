package com.wsh.test.date;

import org.junit.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 日期 测试 class
 * 程序清单 4-1
 * @author wsh
 * @date 2019-07-04 23:19
 */
public class CalendarTest {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2019, 6, 27);
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        date = date.minusDays(today - 1);
        DayOfWeek weekDay = date.getDayOfWeek();
        int value = weekDay.getValue();

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 0; i < value; i++) {
            System.out.print("   ");
        }
        while (date.getMonthValue() == month) {
            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getDayOfMonth() == today) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1) {
                System.out.println();
            }
        }
        if (date.getDayOfWeek().getValue() != 1) {
            System.out.println();
        }

    }

    /**
     * java Calendar 类 测试
     */
    @Test
    public void CalendarTest1() {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        CostSystemReqDto dto = new CostSystemReqDto();
        dto.setPolicy("ppp00011");
        dto.setSignDate(calendar);
        Map<String, Object> map = new HashMap<>();
        map.put("costSystemReqDto", dto);
        System.out.println("--------------");
        CostSystemReqDto dto1 = (CostSystemReqDto) map.get("costSystemReqDto");
        System.out.println(dto1);
    }
}

class CostSystemReqDto {

    private String policy;
    private Calendar signDate;

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public Calendar getSignDate() {
        return signDate;
    }

    public void setSignDate(Calendar signDate) {
        this.signDate = signDate;
    }

    @Override
    public String toString() {
        return "CostSystemReqDto{" +
                "policy='" + policy + '\'' +
                ", signDate=" + signDate +
                '}';
    }
}
