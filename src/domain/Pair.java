/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Xiaomi
 */
public class Pair {
    public long number;
    public int count;
    
    public Pair(long number) {
        reset(number, 0);
    }
    
    public void reset(long number, int count) {
        this.number = number;
        this.count = count;
    }
}
