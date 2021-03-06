/*
 * Copyright (C) 2017 kkkkan
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.kkkkan.youtube.tubtub.utils;


/**
 * Horizontal screen lock · One song repeat · Playlist repeat setting is put in singleton class
 * <p>
 * 横画面ロック・一曲リピート・プレイリストリピートの設定を
 * 入れておくsingletonクラス
 * Created by admin on 2017/11/07.
 */

public class Settings {
    final private static String TAG = "Settings";
    static private Settings settings = new Settings();
    private ScreenLock screenLock = ScreenLock.OFF;
    private RepeatOne repeatOne = RepeatOne.OFF;
    private RepeatPlaylist repeatPlaylist = RepeatPlaylist.OFF;

    private Settings() {

    }

    static public Settings getInstance() {
        return settings;
    }

    public ScreenLock getScreenLock() {
        return screenLock;
    }

    public RepeatOne getRepeatOne() {
        return repeatOne;
    }

    public RepeatPlaylist getRepeatPlaylist() {
        return repeatPlaylist;
    }

    public void setScreenLock(ScreenLock screenLock) {
        this.screenLock = screenLock;
    }

    public void setRepeatOne(RepeatOne repeatOne) {
        this.repeatOne = repeatOne;
    }

    public void setRepeatPlaylist(RepeatPlaylist repeatPlaylist) {
        this.repeatPlaylist = repeatPlaylist;
    }


    /**
     * Enum for whether horizontal screen lock or not
     * <p>
     * 横画面ロックか否かのための
     * enum
     */
    public enum ScreenLock {
        ON,
        OFF
    }

    /**
     * Enum for whether to repeat a song or not
     * <p>
     * 一曲リピートか否かのための
     * enum
     */
    public enum RepeatOne {
        ON,
        OFF
    }

    /**
     * Enum for whether playlist repeat or not
     * <p>
     * プレイリストリピートか否かのための
     * enum
     */
    public enum RepeatPlaylist {
        ON,
        OFF
    }

}
