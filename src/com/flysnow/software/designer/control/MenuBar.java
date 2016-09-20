package com.flysnow.software.designer.control;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.flysnow.software.designer.util.Builder;

/**
 * 项目名称: Designer.
 * 创建时间: 2016/9/20.
 * 创 建 人: Var_雨中行.
 * 类 描 述: 菜单栏.
 */
public class MenuBar extends BaseBar {

    /*按钮的样式*/
    private TextButton.TextButtonStyle style;
    /*文件*/
    private TextButton file;
    /*编辑*/
    private TextButton edit;
    /*项目*/
    private TextButton proj;
    /*窗口*/
    private TextButton wind;
    /*帮助*/
    private TextButton help;

    /**
     * 初始化显示位置
     *
     * @param x X轴
     * @param y Y轴
     * @param w 宽度
     * @param h 高度
     */
    public MenuBar(float x, float y, float w, float h) {
        super(x, y, w, h);
        this.initActor();
    }

    /**
     * 初始化组件
     */
    private void initActor() {
        this.style = new TextButton.TextButtonStyle(null, Builder.drawable("assets/data/ui/clickback.png"), null, Builder.font("assets/data/font/designer.fnt"));
        this.file = new TextButton("文件", style);
        this.file.setBounds(0, 2, 100, 36);
        this.edit = new TextButton("编辑", style);
        this.edit.setBounds(100, 2, 100, 36);
        this.proj = new TextButton("项目", style);
        this.proj.setBounds(200, 2, 100, 36);
        this.wind = new TextButton("窗口", style);
        this.wind.setBounds(300, 2, 100, 36);
        this.help = new TextButton("帮助", style);
        this.help.setBounds(400, 2, 100, 36);
        this.initListener();
    }

    private void initListener() {
        this.file.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                super.clicked(event, x, y);
            }
        });

        this.edit.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                super.clicked(event, x, y);
            }
        });

        this.proj.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                super.clicked(event, x, y);
            }
        });

        this.wind.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                super.clicked(event, x, y);
            }
        });

        this.help.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                super.clicked(event, x, y);
            }
        });
        this.add();
    }

    /**
     * 添加控件
     */
    private void add() {
        this.addActor(this.file);
        this.addActor(this.edit);
        this.addActor(this.proj);
        this.addActor(this.wind);
        this.addActor(this.help);
    }
}
