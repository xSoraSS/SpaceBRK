package es.angel.spacebreakers;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;


public class Alien {

    private SpriteBatch batch;
    private Texture alien;
    private Sprite myAlien;
    private int alienx = 70, alieny = 350;

    void create(){
        batch = new SpriteBatch();
        alien = new Texture("alien.png");
        myAlien = new Sprite(alien);
        myAlien.setSize(70,70);
        myAlien.setPosition(alienx, alieny);
    }

    void printarAlien() {
        batch.begin();
        myAlien.draw(batch);
        batch.end();
    }

    void dispose () {
        batch.dispose();
        alien.dispose();
    }
}

