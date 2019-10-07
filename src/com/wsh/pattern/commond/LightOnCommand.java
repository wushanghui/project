package com.wsh.pattern.commond;

/**
 * @author wsh
 * @date 2019-10-06 15:26
 */
public class LightOnCommand implements Command {

    LightReceiver light;

    public LightOnCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
