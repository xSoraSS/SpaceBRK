package es.angel.spacebreakers;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class SpaceShip {
    SpriteBatch batch;
    Texture ship;
    Sprite myShip;

    public void create() {
        batch = new SpriteBatch();
        ship = new Texture("ship.png");
        myShip = new Sprite(ship);
        myShip.setPosition(270, 10);
        myShip.setSize(100, 100);
    }

    void printarNave() {
        batch.begin();
        myShip.draw(batch);
        batch.end();
    }

    void dispose() {
        batch.dispose();
        ship.dispose();
    }
}
