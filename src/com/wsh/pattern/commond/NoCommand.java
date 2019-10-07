package com.wsh.pattern.commond;

/**
 * 没有任何命令，即空执行：用于初始化每个按钮，当调用此命令时，什么都不做，可以省略对空的判断
 * @author wsh
 * @date 2019-10-07 21:56
 */
public class NoCommand implements Command {
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
