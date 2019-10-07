package com.wsh.pattern.commond;

/**
 * @author wsh
 * @date 2019-10-06 15:25
 */
public interface Command {

    public void execute();

    public void undo();

}
