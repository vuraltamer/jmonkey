package mygame;

import com.jme3.app.SimpleApplication;
import com.jme3.renderer.RenderManager;

/**
 * This is the Main Class of your Game. You should only do initialization here.
 * Move your Logic into AppStates or Controls
 * @author normenhansen
 */
public class Main extends SimpleApplication {

    public static void main(String[] args) {
        Main app = new Main();
        app.start();
    }

    /**
    * carScene.j3o -> stateManager.attach(new Car(this));
    * 
    * hoverScene.j30 -> stateManager.attach(new HoverCar(this));
    */
    @Override
    public void simpleInitApp() {
        final SceneEnum scene = SceneEnum.HOVER_CAR; // SceneEnum.CAR;
        
        if (SceneEnum.HOVER_CAR.equals(scene)) {
            stateManager.attach(new HoverCar(this));
        } else {
            stateManager.attach(new Car(this));
        }
    }
   
    @Override
    public void simpleUpdate(float tpf) {
        //TODO: add update code
    }

    @Override
    public void simpleRender(RenderManager rm) {
        //TODO: add render code
    }
}
