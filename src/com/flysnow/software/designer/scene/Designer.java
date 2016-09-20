package com.flysnow.software.designer.scene;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.flysnow.software.designer.manager.MainDesigner;

/**
 * 项目名称: Designer.
 * 创建时间: 2016/9/19.
 * 创 建 人: Var_雨中行.
 * 类 描 述: 设计器的主视图.
 */
public class Designer implements Screen {

    /*管理程序的主类*/
    private MainDesigner designer;
    /*承载控件的舞台*/
    private Stage stage;

    /**
     * 构造方法
     *
     * @param designer 继承自Game的类的实例
     */
    public Designer(MainDesigner designer) {
        this.designer = designer;
        this.stage = designer.getStage();
    }

    /**
     * show方法,用于初始化成员
     */
    @Override
    public void show() {

    }

    /**
     * 渲染方法
     *
     * @param v 每秒钟渲染的帧数
     */
    @Override
    public void render(float v) {
        Gdx.gl20.glClearColor(0,0,0,0);
        Gdx.gl20.glClear(GL20.GL_COLOR_BUFFER_BIT);
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
