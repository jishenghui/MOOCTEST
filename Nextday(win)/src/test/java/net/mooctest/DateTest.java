package net.mooctest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DateTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testDay(){
        Date date1=new Date(12,31,2023);
        Day day = new Day(31, new Month(12, new Year(2023)));
        assertEquals(day, date1.getDay());
        assertEquals(false,day.increment());
        date1.increment();
        day = new Day(1, new Month(1, new Year(2024)));
        assertEquals(day, date1.getDay());
        date1.printDate();
        Date date2=new Date(1,1,2024);
        assertEquals(date1,date2);
        assertEquals("1/1/2024",date1.toString());

        assertEquals(true,day.increment());
        String e="";
        try {
            day.setDay(32,new Month(12,new Year(2022)));
        }catch (IllegalArgumentException ex){
            e="Not a valid day";
        }
        assertEquals("Not a valid day",e);
        assertEquals(32,day.currentPos);
        e="";
        //        assertEquals(false,new Day(12,null));
        assertEquals(false,day.isValid());
        try {
            day=new Day(12,null);
        } catch (Exception ex) {
            e="Not a valid day";
        }
        assertEquals("Not a valid day",e);
        assertEquals(false,day.isValid());
        try {
            day=new Day(-1,new Month(11,new Year(2022)));
        } catch (Exception ex) {
            day.setCurrentPos(-1);
        }
        assertEquals(day.isValid(),false);
        day=new Day(12,new Month(1,new Year(2021)));
        assertEquals(false,day.equals(1));
        assertEquals(false,day.equals(new Day(13,new Month(12,new Year(2021)))));
        assertEquals(false,day.equals(new Day(12,new Month(11,new Year(1212)))));
        assertEquals(false,day.equals(new Day(12,new Month(1,new Year(1221)))));
        assertEquals(true,new Day(29,new Month(2,new Year(2016))).isValid());
    }

    @Test
    public void testMon(){
        Date date1=new Date(11,30,2023);
        Month month=new Month(11,new Year(2023));
        assertEquals(month,date1.getMonth());
        date1.increment();
        month=new Month(12,new Year(2023));
        assertEquals(month, date1.getMonth());
        date1.printDate();

        assertEquals(false,month.increment());
        String e="";
        try {
            month.setMonth(32,new Year(2022));
        }catch (IllegalArgumentException ex){
            e="Not a valid month";
        }
        assertEquals("Not a valid month",e);
        assertEquals(32,month.currentPos);
        e="";
        //        assertEquals(false,new Month(12,null));
        assertEquals(false,month.isValid());
        try {
            month=new Month(12,null);
        } catch (Exception ex) {
            e="Not a valid month";
        }
        assertEquals("Not a valid month",e);
        assertEquals(false,month.isValid());
        try {
            month=new Month(-1,new Year(2022));
        } catch (Exception ex) {
            month.setCurrentPos(-1);
        }
        assertEquals(month.isValid(),false);
        month=new Month(12,new Year(2021));
        assertEquals(false,month.equals(1));
        assertEquals(false,month.equals(new Month(11,new Year(2021))));
        assertEquals(false,month.equals(new Month(12,new Year(1212))));

    }

    @Test
    public void testYear(){
        Date date1=new Date(11,30,2023);
        Year year=new Year(2023);
        assertEquals(year,date1.getYear());
        date1.increment();
        year=new Year(2023);
        assertEquals(year, date1.getYear());
        date1.printDate();

        String e="";
        try {
            year.setYear(0);
        } catch (Exception ex) {
            e="Not a valid month";
        }
        assertEquals(e,"Not a valid month");
        e="";
        try {
            year.setYear(-1);
        } catch (Exception ex) {
            e="Not a valid month";
        }
        assertEquals(e,"");
        year.currentPos=0;
        assertEquals(true,year.increment());
        assertEquals(1,year.getCurrentPos());
        year=new Year(-1);
        year.increment();
        assertEquals(1,year.getCurrentPos());
        assertEquals(false,new Year(100).isLeap());
        assertEquals(false,new Year(-399).isLeap());
        assertEquals(true,new Year(-401).isLeap());
        assertEquals(true,new Year(400).isLeap());
        assertEquals(false,new Year(1000).isLeap());
        assertEquals(true,new Year(8).isLeap());
        assertEquals(true,new Year(-9).isLeap());
        assertEquals(false,new Year(-1001).isLeap());
        assertEquals(true,year.equals(new Year(1)));
        assertEquals(year,new Year(1));
        assertNotEquals(year,1);
        assertNotEquals(new Year(2),year);

    }

    @Test
    public void testDate(){
        Date date1=new Date(1,3,12);
        Date date2=new Date(1,3,12);
        Date date3=new Date(2,1,12);
        Date date4=new Date(1,2,12);
        Date date5=new Date(1,3,14);
        assertEquals(date1,date2);
        assertNotEquals(date1,date3);
        assertNotEquals(date1,date4);
        assertNotEquals(date1,date5);
        assertNotEquals(date1,1);

        date4=Nextday.nextDay(date4);
        assertEquals(date3,date4);
    }


}
