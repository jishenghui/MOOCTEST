package net.mooctest;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class JCLOTest {

    JCLO jclo;
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void test1(){
        jclo=new JCLO("peo",new peo(),new String[][]{{"peo","--"},{"args","^"}});
        assertEquals("int: age = 10\n" +
                "String: sex = man\n" +
                "String: name = hello\n" +
                "String: hobby = world",jclo.toString());
        assertEquals("",jclo.usage());
        jclo.parse(new String[]{"setAge","getAge","getSex","setSex","setHobby","getHobby","getName","setName"});
    }
    static class peo{
        public int age=10;
        private String sex="man";
        protected String name="hello";
        String hobby="world";

        int getAge() {
            return age;
        }

        void setAge(int age) {
            this.age = age;
        }

        private String getSex() {
            return sex;
        }

        private void setSex(String sex) {
            this.sex = sex;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        protected String getHobby() {
            return hobby;
        }

        protected void setHobby(String hobby) {
            this.hobby = hobby;
        }
    }

}
