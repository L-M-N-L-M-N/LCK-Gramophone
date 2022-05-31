package com.yibao.music.model;

import java.io.File;


public class LyricDownBean {
    private boolean doneOK;
    private String downMsg;

    public LyricDownBean(boolean doneOK, String downMsg) {
        this.doneOK = doneOK;
        this.downMsg = downMsg;
    }

    public boolean isDoneOK() {
        return doneOK;
    }

    public void setDoneOK(boolean doneOK) {
        this.doneOK = doneOK;
    }

    public String getDownMsg() {
        return downMsg;
    }

    public void setDownMsg(String downMsg) {
        this.downMsg = downMsg;
    }
}
