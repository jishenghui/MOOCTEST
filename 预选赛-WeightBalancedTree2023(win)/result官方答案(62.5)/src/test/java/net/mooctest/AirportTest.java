package net.mooctest;

import org.junit.Test;

import static org.junit.Assert.*;

public class AirportTest {

    @Test
    public void test() {
        Airport airport = new Airport("code", "name", "city", "country", 1, 2);
        assertEquals("code", airport.getCode());
        assertEquals("name", airport.getName());
        assertEquals("city", airport.getCity());
        assertEquals("country", airport.getCountry());
        assertEquals(1, airport.getX(), 0.0001);
        assertEquals(2, airport.getY(), 0.0001);
        airport.getCoord(1);
        airport.getPoint2D();

        assertEquals("city", airport.toString());
        assertEquals("code", airport.getString("code-only"));
        assertEquals("code, name, city, country, (1.0,2.0)", airport.getString("full"));
        assertEquals("name, city, country, (1.0,2.0)", airport.getString("attributes"));
        assertEquals("Invalid format!", airport.getString("invalid"));

        Airport airport1 = new Airport("code");
        assertEquals("code", airport1.getCode());
        assertEquals("", airport1.getName());
        assertEquals("", airport1.getCity());
        assertEquals("", airport1.getCountry());
        assertEquals(0, airport1.getX(), 0.0001);
        assertEquals(0, airport1.getY(), 0.0001);
        assertEquals("", airport1.toString());
        assertEquals("", airport1.getString(""));
        assertEquals("code", airport1.getString("code-only"));
        assertEquals("code, , , , (0.0,0.0)", airport1.getString("full"));
        assertEquals(", , , (0.0,0.0)", airport1.getString("attributes"));
        assertEquals("Invalid format!", airport1.getString("invalid"));
    }
}