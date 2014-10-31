package com.wrongkey.springidol;

/**
 *@author wrongkey
 *@description 萨克斯
 *@date 2014/10/31
 *@version v1.0
 *
 */
public class Saxophone implements Instrument {
    @Override
    public void play() {
        System.out.println("TOOT TOOT TOOT");
    }
}
