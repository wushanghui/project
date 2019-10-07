package com.wsh.pattern.commond;

/**
 * @author wsh
 * @date 2019-10-06 15:26
 */
public class LightOffCommand implements Command {

    LightReceiver light;

    public LightOffCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
