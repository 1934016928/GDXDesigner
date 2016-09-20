package com.flysnow.software.designer.manager;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.flysnow.software.designer.input.DesignerInput;
import com.flysnow.software.designer.scene.Designer;

/**
 * 项目名称: Designer.
 * 创建时间: 2016/9/19.
 * 创 建 人: Var_雨中行.
 * 类 描 述: 支撑整个程序的实现.
 */
public class MainDesigner extends Game {

    /*程序可见区域的宽度*/
    private static final float WIDTH = 1920;
    /*程序可见区域的高度*/
    private static final float HEIGHT = 1080;

    /*承载所有控件的舞台*/
    private Stage stage;
    /*处理输入监听的类*/
    private DesignerInput input;
    /*集合输入监听的类*/
    private InputMultiplexer multiplexer;
    /*程序的主视图*/
    public Designer designer;

    /**
     * create方法,用于初始化成员
     */
    @Override
    public void create() {
        this.keepStage(WIDTH, HEIGHT);
        this.designer = new Designer(this);
        this.setScreen(designer);
    }

    /**
     * 舞台适配方法,用于自适应程序窗口的大小
     *
     * @param width  舞台的宽度
     * @param height 舞台的高度
     */
    private void keepStage(float width, float height) {
        this.stage = new Stage(new StretchViewport(width, height));
        this.input = new DesignerInput(this);
        this.multiplexer = new InputMultiplexer(input, stage);
        Gdx.input.setInputProcessor(multiplexer);
    }

    /**
     * 获取舞台对象
     *
     * @return 返回一个舞台对象
     */
    public Stage getStage() {
        return stage;
    }

    /**
     * 销毁方法
     */
    @Override
    public void dispose() {
        super.dispose();
        this.stage.dispose();
        this.designer.dispose();
    }
}
