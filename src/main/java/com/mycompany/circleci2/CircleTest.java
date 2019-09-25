/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh
 */
package com.mycompany.circleci2;

/**
 *
 * @author godswill
 */
public class CircleTest {

    public int m = 0;

    public int sum(int n, int y) {
        return n + y;

    }

    public void multi(int n, int y) {
        
        if((n<0)||(m<0)) return;
        m = n * y;
        System.out.println(m);

    }
        public void multix(int n, int y) throws Exception{
        
        if((n<0)||(m<0)) throw new Exception("invalid value 001");
        m = n * y;
        System.out.println(m);

    }
}
