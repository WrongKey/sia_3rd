package com.wrongkey.springidol;

/**
 *@author wrongkey
 *@description guitar
 *@date 2014/10/31
 *@version v1.0
 *
 */
@StringedInstrument
public class Guitar implements Instrument{
    @Override
    public void play() {
        System.out.println("DONG DONG DONG");
    }
}
