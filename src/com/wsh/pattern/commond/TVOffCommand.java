package com.wsh.pattern.commond;

/**
 * @author wsh
 * @date 2019-10-07 22:13
 */
public class TVOffCommand implements Command {

    TVReceiver tv;

    public TVOffCommand(TVReceiver tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void undo() {
        tv.on();
    }
}
