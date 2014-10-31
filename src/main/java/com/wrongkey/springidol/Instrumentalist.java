package com.wrongkey.springidol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

/**
 *@author wrongkey
 *@description 音乐演奏家
 *@date 2014/10/30
 *@version v1.0
 *
 */
public class Instrumentalist implements Performer {
    private String name;    //演奏家姓名
    private String song;    //演奏的歌曲
    private Instrument instrument;  //演奏的歌曲

    public Instrumentalist() {
    }

    /**
     *@author wrongkey
     *@description 乐器演奏
     *@date 2014/10/31
     *@version v1.0
     *
     */
    @Override
    public void perform()throws PerformanceException{
        System.out.print(name+" playing " + song + " : ");
        instrument.play();
    }

    /**
     *@author wrongkey
     *@description 注入song
     *@date 2014/10/30
     *@version v1.0
     *
     */
    @Value("jingle bells")
    public void setSong(String song) {
        this.song = song;
    }

    public String getSong() {
        return song;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    /**
     *@author wrongkey
     *@description 注入instrument
     *@date 2014/10/30
     *@version v1.0
     *
     */
    @Autowired
    @StringedInstrument
    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }


    public String getName() {
        return name;
    }

    /**
     *@author wrongkey
     *@description 注入name
     *@date 2014/10/30
     *@version v1.0
     *
     */
    @Value("wrongkey")
    public void setName(String name) {
        this.name = name;
    }


}
