package com.gushikustudios.livewallpaper;

import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.badlogic.gdx.backends.android.AndroidLiveWallpaperService;
import com.gushikustudios.rube.Box2DLight;
import com.gushikustudios.rube.RubeLoaderTest;

public class MyLiveWallpaper extends AndroidLiveWallpaperService {
    
    @Override
    public void onCreateApplication() {
        super.onCreateApplication();
        
        
        AndroidApplicationConfiguration cfg = new AndroidApplicationConfiguration();
        
        cfg.useAccelerometer = true;
        
//        initialize(new RubeLoaderTest(true, 2), cfg);
        this.initialize(new Box2DLight(), cfg);
    }
}