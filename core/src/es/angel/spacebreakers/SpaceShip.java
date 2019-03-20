package es.angel.spacebreakers;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class SpaceShip {
    SpriteBatch batch;
    Texture ship;
    Sprite myShip;
    int shipX = 270, shipY = 10;
//    boolean izquierda = Gdx.input.isKeyPressed(Input.Keys.LEFT);
//    boolean derecha = Gdx.input.isKeyPressed(Input.Keys.RIGHT);
//    boolean mover = (izquierda != derecha);


    public void create() {
        batch = new SpriteBatch();
        ship = new Texture("ship.png");
        myShip = new Sprite(ship);
        myShip.setPosition(shipX, shipY);
        myShip.setSize(100, 100);
    }

    void printarNave() {
        batch.begin();
        myShip.draw(batch);
        batch.end();
    }

    void moveNave(){

        if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
            create();
                shipX--;
        }else if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)){
            create();
                shipX++;
            }
        }

    void dispose() {
        batch.dispose();
        ship.dispose();
    }
}
