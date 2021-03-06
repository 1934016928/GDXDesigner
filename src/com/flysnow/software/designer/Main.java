package com.flysnow.software.designer;

import com.badlogic.gdx.Files;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.flysnow.software.designer.manager.MainDesigner;

import java.awt.*;

public class Main {

    /**
     * 主函数,程序的入口点
     *
     * @param args
     */
    public static void main(String[] args) {
        LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
        cfg.width = (int) getSize().getWidth();
        cfg.height = (int) getSize().getHeight() - 30;
        cfg.x = 0;
        cfg.y = 0;
        cfg.vSyncEnabled = false;
        cfg.title = "GDX Designer v0.0.1 -- By Var_雨中行";
        cfg.addIcon("assets/data/gdx.png", Files.FileType.Internal);
        new LwjglApplication(new MainDesigner(), cfg);
    }

    /**
     * 获取屏幕的大小
     *
     * @return 返回屏幕的宽高集合
     */
    private static Dimension getSize() {
        GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
        return graphicsEnvironment.getMaximumWindowBounds().getSize();
    }
}
