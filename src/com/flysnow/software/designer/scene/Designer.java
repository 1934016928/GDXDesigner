package com.flysnow.software.designer.scene;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.flysnow.software.designer.control.LeftBar;
import com.flysnow.software.designer.control.MenuBar;
import com.flysnow.software.designer.control.RightBar;
import com.flysnow.software.designer.control.ToolBar;
import com.flysnow.software.designer.manager.MainDesigner;

/**
 * 项目名称: Designer.
 * 创建时间: 2016/9/19.
 * 创 建 人: Var_雨中行.
 * 类 描 述: 设计器的主视图.
 */
public class Designer implements Screen {

    /*承载控件的舞台*/
    private Stage stage;
    /*菜单栏*/
    private MenuBar menuBar;
    /*工具栏*/
    private ToolBar toolBar;
    /*左边栏*/
    private LeftBar leftBar;
    /*右边栏*/
    private RightBar rightBar;

    /**
     * 构造方法
     *
     * @param designer 继承自Game的类的实例
     */
    public Designer(MainDesigner designer) {
        this.stage = designer.getStage();
    }

    /**
     * show方法,用于初始化成员
     */
    @Override
    public void show() {
        this.initBars();
    }

    /**
     * 初始化菜单栏,工具栏等
     */
    private void initBars() {
        this.menuBar = new MenuBar(0, this.stage.getHeight() - 40, this.stage.getWidth(), 40);
        this.toolBar = new ToolBar(0, this.stage.getHeight() - (1 + this.menuBar.getHeight() + this.menuBar.getHeight()), this.stage.getWidth(), 40);
        this.leftBar = new LeftBar(0, 0, 60, this.stage.getHeight() - (2 + this.menuBar.getHeight() + this.toolBar.getHeight()));
        this.rightBar = new RightBar(this.stage.getWidth() - 60, 0, 60, this.stage.getHeight() - (2 + this.menuBar.getHeight() + this.toolBar.getHeight()));
        this.stage.addActor(this.menuBar);
        this.stage.addActor(this.toolBar);
        this.stage.addActor(this.leftBar);
        this.stage.addActor(this.rightBar);
    }

    /**
     * 渲染方法
     *
     * @param v 每秒钟渲染的帧数
     */
    @Override
    public void render(float v) {
        Gdx.gl20.glClearColor(0, 0, 0, 1);
        Gdx.gl20.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stage.act(Gdx.graphics.getDeltaTime());
        stage.draw();
    }

    /**
     * resize方法,此方法在程序的大小改变时调用
     *
     * @param i  宽度
     * @param i1 高度
     */
    @Override
    public void resize(int i, int i1) {

    }

    /**
     * 暂停方法
     */
    @Override
    public void pause() {

    }

    /**
     * 在暂停之后恢复调用
     */
    @Override
    public void resume() {

    }

    /**
     * 隐藏
     */
    @Override
    public void hide() {

    }

    /**
     * 销毁
     */
    @Override
    public void dispose() {
        this.stage.clear();
    }
}
