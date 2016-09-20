package com.flysnow.software.designer;

import com.badlogic.gdx.Files;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.flysnow.software.designer.manager.MainDesigner;

public class Main {

    /**
     * 主函数,程序的入口点
     *
     * @param args
     */
    public static void main(String[] args) {
        LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
        cfg.width = 1366;
        cfg.height = 708;
        cfg.x = 0;
        cfg.y = 0;
        cfg.vSyncEnabled = false;
        cfg.title = "GDX Designer v0.0.1 -- By [FlySnow Game Studio]";
        cfg.addIcon("assets/data/gdx.png", Files.FileType.Internal);
        new LwjglApplication(new MainDesigner(), cfg);
    }
}
