package com.wsh.pattern.commond;

/**
 * @author wsh
 * @date 2019-10-07 22:16
 */
public class TVOnCommand implements Command {

    TVReceiver tv;

    public TVOnCommand(TVReceiver tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }

    @Override
    public void undo() {
        tv.off();
    }
}
