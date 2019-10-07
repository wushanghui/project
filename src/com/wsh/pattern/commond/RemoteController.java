package com.wsh.pattern.commond;

/**
 * @author wsh
 * @date 2019-10-07 21:58
 */
public class RemoteController {

    /**
     * 开-命令组
     */
    Command[] onCommands;

    /**
     * 关-命令组
     */
    Command[] offCommands;

    /**
     * 撤销命令
     */
    Command undoCommand;

    /**
     * 初始化按钮
     */
    public RemoteController() {
        onCommands = new Command[5];
        offCommands = new Command[5];

        for (int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    /**
     * 设置命令
     * @param no
     * @param onCommand
     * @param offCommand
     */
    public void setCommand(int no, Command onCommand, Command offCommand) {
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    /**
     * 开按钮
     * @param no
     */
    public void onButtonWasPushed(int no) {
        //找到按下的开的按钮，调用对应的方法
        onCommands[no].execute();
        //记录这次操作，用于撤销
        undoCommand = onCommands[no];
    }

    /**
     * 关按钮
     * @param no
     */
    public void offButtonWasPushed(int no) {
        //找到按下的关的按钮，调用对应的方法
        offCommands[no].execute();
        //记录这次操作，用于撤销
        undoCommand = offCommands[no];
    }

    /**
     * 撤销按钮
     */
    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

}
