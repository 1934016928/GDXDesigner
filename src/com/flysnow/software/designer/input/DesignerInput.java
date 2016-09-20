package com.flysnow.software.designer.input;

import com.badlogic.gdx.InputProcessor;
import com.flysnow.software.designer.manager.MainDesigner;

/**
 * 项目名称: Designer.
 * 创建时间: 2016/9/19.
 * 创 建 人: Var_雨中行.
 * 类 描 述: 监听程序的输入事件.
 */
public class DesignerInput implements InputProcessor {

    /*继承自Game的类的对象实例*/
    private MainDesigner designer;

    /**
     * 构造方法
     *
     * @param designer 管理程序的类
     */
    public DesignerInput(MainDesigner designer) {
        this.designer = designer;
    }

    /**
     * 当键盘上的键按下时调用
     *
     * @param i 键值
     * @return 是否调用keyUp方法
     */
    @Override
    public boolean keyDown(int i) {
        return false;
    }

    /**
     * 当按下的键被抬起时调用
     *
     * @param i 键值
     * @return 是否调用keyTyped方法
     */
    @Override
    public boolean keyUp(int i) {
        return false;
    }

    /**
     * 按下的键的类型
     *
     * @param c 键的名称
     * @return
     */
    @Override
    public boolean keyTyped(char c) {
        return false;
    }

    /**
     * 当鼠标上的键按下时调用
     *
     * @param i
     * @param i1
     * @param i2
     * @param i3
     * @return
     */
    @Override
    public boolean touchDown(int i, int i1, int i2, int i3) {
        return false;
    }

    /**
     * 当鼠标上的键抬起时调用
     *
     * @param i
     * @param i1
     * @param i2
     * @param i3
     * @return
     */
    @Override
    public boolean touchUp(int i, int i1, int i2, int i3) {
        return false;
    }

    /**
     * 当鼠标按下并移动时调用
     *
     * @param i  按下的键
     * @param i1 X的位置
     * @param i2 Y的位置
     * @return
     */
    @Override
    public boolean touchDragged(int i, int i1, int i2) {
        return false;
    }

    /**
     * 鼠标移动时调用
     *
     * @param i  X的位置
     * @param i1 Y的位置
     * @return
     */
    @Override
    public boolean mouseMoved(int i, int i1) {
        return false;
    }

    /**
     * 当鼠标滚轮滚动时调用
     *
     * @param i 滚动的方向,向前滚动时为1,向后滚动时为-1
     * @return
     */
    @Override
    public boolean scrolled(int i) {
        return false;
    }
}
